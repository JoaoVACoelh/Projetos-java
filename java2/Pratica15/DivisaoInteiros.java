package Pratica15;

import java.util.Scanner;

class Calculadora {
    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0 || dividendo < 0) {
            throw new ArithmeticException("Divisor não pode ser zero e dividendo deve ser positivo.");
        }
        return dividendo / divisor;
    }
}

public class DivisaoInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int dividendo = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int divisor = input.nextInt();

        try {
            int resultado = Calculadora.dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}