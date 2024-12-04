package Pratica12;

import java.util.Scanner;

public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

    /**
    Construtor para inicializar uma conta
     */
    public ContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    /**
    Realiza um saque na conta
     */
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    /**
    Realiza um depósito na conta
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
    Consulta o saldo da conta
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
    Exibe os dados da conta
     */
    public String exibir() {
        return "Agência: " + agencia + "\n" +
               "Conta: " + numero + "\n" +
               "Saldo: R$ " + String.format("%.2f", saldo);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = input.nextInt(); 
        System.out.print("Digite o número da agência: ");
        int agencia = input.nextInt();

        ContaCorrente conta = new ContaCorrente(numero, agencia);

        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println(conta.exibir());

        System.out.print("Digite o valor para saque: ");
        double valorSaque = input.nextDouble();
        try {
            conta.sacar(valorSaque);
            System.out.println(conta.exibir());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        input.close();
    }
}