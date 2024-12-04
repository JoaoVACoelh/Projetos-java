package Pratica14;

import java.util.Scanner;

public class Produto {
    public static int ultimoId = 0;
    private int id;
    private String nome;
    private double preco;

    public Produto() {
        this.id = ++ultimoId;
        this.nome = "Nome não informado";
        this.preco = 0.0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco >= 0 ? preco : 0;
    }

    public void exibe() {
        System.out.println("- Produto - ");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }

    public void reajustaPreco(double percentual) {
        preco *= (1 + percentual / 100);
    }
}

class ProdCad{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro produto: ");
        String nome1 = input.nextLine();
        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = input.nextDouble();

        Produto produto1 = new Produto(nome1, preco1);

        System.out.print("Digite o nome do segundo produto: ");
        input.nextLine();
        String nome2 = input.nextLine();
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = input.nextDouble();

        Produto produto2 = new Produto(nome2, preco2);

        System.out.print("Digite o percentual de reajuste para o primeiro produto: ");
        double reajuste = input.nextDouble();
        produto1.reajustaPreco(reajuste);

        System.out.println("\nInformações dos produtos:");
        produto1.exibe();
        produto2.exibe();

        System.out.println("\nÚltimo ID gerado: " + Produto.ultimoId);
        input.close();
    }
}