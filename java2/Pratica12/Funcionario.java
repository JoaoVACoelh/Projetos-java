package Pratica12;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private String telefone;
    private String endereco;

    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void exibe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("------------------------");
    }
}

class Cadastro {
    private Funcionario[] funcionarios;
    int contador;

    /**
    Construtor da classe Cadastro, inicializando o vetor de funcionários.
     */
    public Cadastro(int tamanho) {
        funcionarios = new Funcionario[tamanho];
        contador = 0;
    }

    /**
    Adiciona um novo funcionário ao cadastro.
     */
    public void cadastrar(Funcionario funcionario) {
        if (contador < funcionarios.length) {
            funcionarios[contador] = funcionario;
            contador++;
            System.out.println("Funcionário cadastrado com sucesso!");
        } else {
            System.out.println("Capacidade máxima de funcionários atingida.");
        }
    }

    /**
    Exibe os dados de todos os funcionários cadastrados.
     */
    public void exibirTodos() {
        for (int i = 0; i < contador; i++) {
            funcionarios[i].exibe();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(10);
        String nome = "", cargo = "", enderec = "", telefone = "";
        int salario = 0, idade = 0;
        boolean continuar = true;

        while (continuar && cadastro.contador < 10) {

            System.out.print("Informe o nome do funcionário: ");
            nome = input.nextLine();
            System.out.print("Informe a idade do funcionário: ");
            idade = input.nextInt();
            input.nextLine();
            System.out.print("Informe o cargo do funcionário: ");
            cargo = input.nextLine();
            System.out.print("Informe o salário do funcionário: ");
            salario = input.nextInt();
            input.nextLine();
            System.out.print("Informe o telefone do funcionário: ");
            telefone = input.nextLine();
            System.out.print("Informe o endereço do funcionário: ");
            enderec = input.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, telefone, enderec);
            cadastro.cadastrar(funcionario);

            System.out.print("Deseja continuar? ('s' para continuar): ");
            continuar = input.nextLine().equalsIgnoreCase("s");
        }
        cadastro.exibirTodos();
        input.close();
    }
}