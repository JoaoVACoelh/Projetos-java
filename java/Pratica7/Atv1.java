package Pratica7;

import java.util.Random;

public class Atv1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("Elementos nas posições de linha par e coluna ímpar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j += 2) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta:");
        imprimirMatriz(transporMatriz(matriz));

        System.out.println("Matriz com diagonais trocadas:");
        trocarDiagonais(matriz);
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] transporMatriz(int[][] matriz) {
        int[][] transposta = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }

    public static void trocarDiagonais(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
    }
}