package Pratica6;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        System.out.println("Informe 10 números do primeiro vetor:");
        for (int i = 0; i < vetor1.length;i++){
            vetor1[i] = input.nextInt();
        }
        System.out.println("Informe 10 números do segundo vetor:");
        for (int i = 0; i < vetor1.length;i++){
            vetor2[i] = input.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Números digitados no vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        
        System.out.println("\nNúmeros digitados no vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        
        System.out.println("\nNúmeros somados do vetor 3: ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        input.close();
    }
}