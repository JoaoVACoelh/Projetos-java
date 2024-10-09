package Pratica7;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[][] matrizA = new int[2][2], matrizB = new int[2][2], matrizSoma = new int[2][2];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = input.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}