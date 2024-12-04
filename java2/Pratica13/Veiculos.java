package Pratica13;

import java.util.Scanner;

public class Veiculos {
    private String marca;
    private String modelo;
    private String chassi;
    private String placa;
    private String cor;

    public Veiculos(String marca, String modelo, String chassi, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Chassi: " + chassi);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("------------------------");
    }
}

class Cadastro {
    private Veiculos[] veiculos;
    public int contador;

    /** Construtor do vetor */
    public Cadastro(int tamanhoMaximo) {
        veiculos = new Veiculos[tamanhoMaximo];
        contador = 0;
    }

    /** Método para cadastrar um veículo */
    public void cadastrarVeiculo(Veiculos veiculo) {
        if (contador < veiculos.length) {
            veiculos[contador] = veiculo;
            contador++;
            System.out.println("Veículo cadastrado com sucesso!");
        } else {
            System.out.println("Capacidade máxima de veículos atingida.");
        }
    }

    /** Método para exibir todos os veículos cadastrados */
    public void exibirTodosVeiculos() {
        for (int i = 0; i < contador; i++) {
            veiculos[i].exibirInformacoes();
        }
    }
}

class CadastroVeiculos{   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(10); 
        String marca,modelo,chassi,placa,cor;

        boolean continuar = true;

        while (continuar && cadastro.contador < 10) {
            System.out.print("Informe a marca do veiculo: ");
            marca = input.nextLine();
            System.out.print("Informe o modelo do veiculo: ");
            modelo = input.nextLine();
            System.out.print("Informe o chassi do veiculo: ");
            chassi = input.nextLine();
            System.out.print("Informe a placa do veiculo: ");
            placa = input.nextLine();
            System.out.print("Informe a cor do veiculo: ");
            cor = input.nextLine();

            Veiculos veiculo = new Veiculos(marca, modelo, chassi, placa, cor);
            cadastro.cadastrarVeiculo(veiculo);

            System.out.print("Deseja continuar? ('s' para continuar): ");
            continuar = input.nextLine().equalsIgnoreCase("s");
        }
        cadastro.exibirTodosVeiculos();
        input.close();
    }
}