package Pratica13;

import java.util.Scanner;

public class CadastroPessoa {
    private String nome;

    public CadastroPessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PessoaFisica extends CadastroPessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class PessoaJuridica extends CadastroPessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

class Cadastro {
    private CadastroPessoa[] pessoas;
    public int contador;

    public Cadastro(int tamanhoMaximo) {
        pessoas = new CadastroPessoa[tamanhoMaximo];
        contador = 0;
    }

    public void cadastrarPessoa(CadastroPessoa pessoa) {
        if (contador < pessoas.length) {
            pessoas[contador] = pessoa;
            contador++;
            System.out.println("Pessoa cadastrada com sucesso!");
        } else {
            System.out.println("Capacidade máxima de pessoas atingida.");
        }
    }

    public void exibirTodos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            if (pessoas[i] instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCpf());
            } else if (pessoas[i] instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCnpj());
            }
            System.out.println("------------------------");
        }
    }
}

class RegistroPessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(10);

        boolean continuar = true;

        while (continuar && cadastro.contador < 10) {
            System.out.println("Digite 1 para cadastrar uma pessoa física");
            System.out.println("Digite 2 para cadastrar uma pessoa jurídica");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("CPF: ");
                    String cpf = input.nextLine();

                    PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
                    cadastro.cadastrarPessoa(pessoaFisica);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = input.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = input.nextLine();
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
                    cadastro.cadastrarPessoa(pessoaJuridica);

                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.print("Deseja continuar? ('s' para continuar): ");
            continuar = input.nextLine().equalsIgnoreCase("s");
        }
        cadastro.exibirTodos();
        input.close();
    }
}