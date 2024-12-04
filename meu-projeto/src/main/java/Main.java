import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Veiculo {
    private String marca;
    private String modelo;
    private int chassi;
    private String placa;
    private String cor;

    public Veiculo(String marca, String modelo, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public Veiculo(int chassi, String marca, String modelo, String placa, String cor) {
        this.chassi = chassi;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public int getChassi() {
        return chassi;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }
}

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Scanner input = new Scanner(System.in);
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conexão com SQLite estabelecida!");
            String createTableSQL = """
                       CREATE TABLE IF NOT EXISTS veiculo (
                        numero_chassi INTEGER PRIMARY KEY AUTOINCREMENT,
                        marca VARCHAR(256) NOT NULL,
                        modelo VARCHAR(256) NOT NULL,
                        placa VARCHAR(10) NOT NULL,
                        cor VARCHAR(20) NOT NULL
                    );
                    """;

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Tabela 'veiculo' criada ou já existe.");

            String insertSQL = "INSERT INTO veiculo (marca, modelo, placa, cor) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            String continuar;
            do {
                System.out.println();
                System.out.println("---------------MENU---------------");
                System.out.println();
                System.out.println("Escolha uma das opcoes: ");
                System.out.println(
                        "1- Adicionar Veiculo  2- Consultar Veiculos  3- Atualizar Veiculo  4- Excluir Veiculo");
                int opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Informe a marca do veiculo: ");
                        String marca = input.next().trim();
                        input.nextLine();
                        System.out.println("Informe o modelo do veiculo: ");
                        String modelo = input.nextLine().trim();
                        System.out.println("Informe a placa do veiculo: ");
                        String placa = input.nextLine().trim();
                        System.out.println("Informe a cor do veiculo: ");
                        String cor = input.nextLine().trim();

                        Veiculo veiculo = new Veiculo(marca, modelo, placa, cor);

                        preparedStatement.setString(1, veiculo.getMarca());
                        preparedStatement.setString(2, veiculo.getModelo());
                        preparedStatement.setString(3, veiculo.getPlaca());
                        preparedStatement.setString(4, veiculo.getCor());
                        preparedStatement.executeUpdate();
                        System.out.println();
                        break;
                    case 2:
                        String selectSQL = "SELECT * FROM veiculo;";
                        ResultSet resultSet = statement.executeQuery(selectSQL);
                        while (resultSet.next()) {
                            System.out.println("Numero do Chassi: " + resultSet.getInt("numero_chassi") +
                                    ", Marca: " + resultSet.getString("marca") +
                                    ", Modelo: " + resultSet.getString("modelo") +
                                    ", Placa: " + resultSet.getString("placa") +
                                    ", Cor: " + resultSet.getString("cor"));
                        }
                        break;
                    case 3:
                        String UpdateSQL = "UPDATE veiculo SET marca = ?, modelo = ?, placa = ?, cor = ? WHERE numero_chassi = ?";
                        preparedStatement = connection.prepareStatement(UpdateSQL);
                        System.out.println("Informe o numero do chassi do carro a ser alterado: ");
                        int chassi = input.nextInt();
                        System.out.println("Informe a marca do veiculo: ");
                        input.nextLine();
                        marca = input.nextLine().trim();
                        System.out.println("Informe o modelo do veiculo: ");
                        modelo = input.nextLine().trim();
                        System.out.println("Informe a placa do veiculo: ");
                        placa = input.nextLine().trim();
                        System.out.println("Informe a cor do veiculo: ");
                        cor = input.nextLine().trim();

                        Veiculo veic = new Veiculo(chassi, marca, modelo, placa, cor);
                        preparedStatement.setString(1, veic.getMarca());
                        preparedStatement.setString(2, veic.getModelo());
                        preparedStatement.setString(3, veic.getPlaca());
                        preparedStatement.setString(4, veic.getCor());
                        preparedStatement.setInt(5, veic.getChassi());
                        int rowsUpdated = preparedStatement.executeUpdate();
                        if (rowsUpdated > 0) {
                            System.out.println("Veiculo atualizado com sucesso!");
                        } else {
                            System.out.println("Nenhum veiculo encontrado com o ID especificado.");
                        }
                        break;
                    case 4:
                        String deleteSQL = "DELETE FROM veiculo WHERE numero_chassi = ?";
                        PreparedStatement preparedStatement2 = connection.prepareStatement(deleteSQL);
                        System.out.println("Informe o Codigo do Chassi a ser excluido:");
                        chassi = input.nextInt();

                        preparedStatement2.setInt(1, chassi);
                        int rowsDeleted = preparedStatement2.executeUpdate();
        
                        if (rowsDeleted > 0) {
                            System.out.println("Usuário excluído com sucesso!");
                        } else {
                            System.out.println("Nenhum usuário encontrado com o ID especificado.");
                        }
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }
                input.nextLine();
                System.out.print("Deseja continuar? (sim/não): ");
                continuar = input.nextLine();
            } while (continuar.equalsIgnoreCase("sim"));
        } catch (

        Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        input.close();
    }
}