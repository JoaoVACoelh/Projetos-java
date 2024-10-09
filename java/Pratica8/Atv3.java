package Pratica8;

import java.util.Arrays;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da primeira sequência: ");
        int tamanhoA = input.nextInt();
        System.out.print("Digite o tamanho da segunda sequência: ");
        int tamanhoB = input.nextInt();
        int[] sequenciaA = new int[tamanhoA];
        int[] sequenciaB = new int[tamanhoB];

        System.out.println("Digite os elementos da primeira sequência:");
        for (int i = 0; i < tamanhoA; i++) {
            sequenciaA[i] = input.nextInt();
        }

        System.out.println("Digite os elementos da segunda sequência:");
        for (int i = 0; i < tamanhoB; i++) {
            sequenciaB[i] = input.nextInt();
        }
        Arrays.sort(sequenciaA);
        Arrays.sort(sequenciaB);

        int[] conjuntoA = removerDuplicatas(sequenciaA);
        int[] conjuntoB = removerDuplicatas(sequenciaB);

        int[] conjuntoC = uniao(conjuntoA, conjuntoB);
        
        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C (união): " + Arrays.toString(conjuntoC));
        input.close();
    }

    public static int[] removerDuplicatas(int[] vetor) {
        int[] temp = new int[vetor.length];
        Arrays.sort(temp);
        int j = 0;
        temp[0] = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (Arrays.binarySearch(temp, 0, j, vetor[i]) < 0) {
                temp[j++] = vetor[i];
            }
        }
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }

    public static int[] uniao(int[] vetor1, int[] vetor2) {
        
        int[] result = new int[vetor1.length + vetor2.length];
        int i = 0, j = 0, k = 0;
        while (i < vetor1.length && j < vetor2.length) {
            if (vetor1[i] < vetor2[j]) {
                result[k++] = vetor1[i++];
            } else if (vetor1[i] > vetor2[j]) {
                result[k++] = vetor2[j++];
            } else {
                result[k++] = vetor1[i++];
                j++;
            }
        }
        while (i < vetor1.length) {
            result[k++] = vetor1[i++];
        }
        while (j < vetor2.length) {
            result[k++] = vetor2[j++];
        }
        return Arrays.copyOf(result, k);
    }
}