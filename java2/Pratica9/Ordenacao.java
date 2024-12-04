package Pratica9;

import java.util.Scanner;

public class Ordenacao {

    public static void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;

                    for (int num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
    }

    public static void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (vetor[j] < vetor[min_idx])
                    min_idx = j;
            int temp = vetor[min_idx];
            vetor[min_idx] = vetor[i];
            vetor[i] = temp;

            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;

            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

                do{
                int[] vetor = new int[10];
                System.out.println("Digite 10 números para serem ordenados:");
                for (int i = 0; i < 10; i++) {
                    vetor[i] = input.nextInt();
                }
        
                System.out.println("Escolha o método de ordenação:");
                System.out.println("1. Bolha");
                System.out.println("2. Seleção");
                System.out.println("3. Inserção");
                int opcao = input.nextInt(); 
        
                switch (opcao) {
                    case 1:
                        Ordenacao.bolha(vetor);
                        break;
                    case 2:
                        Ordenacao.selecao(vetor);
                        break;
                    case 3:
                        Ordenacao.insercao(vetor);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        return;
                }
                System.out.print("Deseja continuar? (s/n): ");
                continuar = input.next().charAt(0);
            } while (continuar == 'S' || continuar == 's');
            
    input.close();
    }
}