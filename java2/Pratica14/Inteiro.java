package Pratica14;

import java.util.Scanner;

public class Inteiro {

    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return multiplicacao(a, potencia(a, b - 1));
        }
    }

    public int divisao(int a, int b) {
        int resultado = 0;
        while (a >= b) {
            a -= b;
            resultado++;
        }
        return resultado;
    }

    public int resto(int a, int b) {
        return a - divisao(a, b) * b;
    }

    public boolean par(int a) {
        return resto(a, 2) == 0;
    }
}

class CalcInteiros {
    public static void main(String[] args) {
        Inteiro inteiro = new Inteiro();
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("- Menu -");
            System.out.println("1 - Multiplicação 2 - Potência  3 - Divisão  4 - Par  5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            System.out.println();

            System.out.print("Digite o primeiro número: ");
            int a = input.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = input.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + inteiro.multiplicacao(a, b));
                    break;
                case 2:
                    System.out.println("Resultado: " + inteiro.potencia(a, b));
                    break;
                case 3:
                    System.out.println("Resultado: " + inteiro.divisao(a, b));
                    break;
                case 4:
                    System.out.println("Resultado: " + inteiro.par(a));
                    break;
                case 5:
                    System.out.println("Finalizando Sistena");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
        input.close();
    }
}