package Pratica8;

import java.util.Arrays;
import java.util.Scanner;

public class Atv2{
    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        Arrays.sort(vetor);

        while (continuar) {
            System.out.println("Digite o número a ser pesquisado (ou 0 para sair):");
            int numeroBuscado = scanner.nextInt();
            if (numeroBuscado == 0) {
                continuar = false;
                break;
            }

            int esquerda = 0, direita = vetor.length - 1, comparacoes = 0;
    
            while (esquerda <= direita) {
                int meio = esquerda + (direita - esquerda) / 2;
                comparacoes++;
    
                if (vetor[meio] == numeroBuscado) {
                    System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + meio + " e foi realizado " + comparacoes + " comparações");
                    break;
                } else if (vetor[meio] < numeroBuscado) {
                    esquerda = meio + 1;
                } else if (vetor[meio] > numeroBuscado){
                    direita = meio - 1;
                }else{
                    System.out.println("O número " + numeroBuscado + " não foi encontrado.");
                }
            }
        }
        scanner.close();
    }
}
