package Pratica6;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double[] num = new double[10];
        
        System.out.println("Informe 10 números:");
        for (int i = 0; i < num.length;i++){
            num[i] = input.nextInt();
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        double menor = num[0];
        double maior = num[0];
        for (double numero : num) {
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);    
        input.close();
    }
}