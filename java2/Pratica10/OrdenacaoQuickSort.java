package Pratica10;

import java.util.Scanner;

public class OrdenacaoQuickSort {

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
        int meio = (inicio + fim) / 2;
        mergeSort(vetor, inicio, meio);
        mergeSort(vetor, meio + 1, fim);
        merge(vetor, inicio, meio, fim);

        for (int i = 0; i < vetor.length; ++i)
            System.out.print(vetor[i] + " ");
            System.out.println();
        }
      }

      private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
      
        int left[] = new int[n1];
        int right[] = new int[n2];
      
        for (int i = 0; i < n1; ++i) {
          left[i] = vetor[inicio + i];
        }
        for (int j = 0; j < n2; ++j) {
          right[j] = vetor[meio + 1 + j];
        }
      
        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
          if (left[i] <= right[j]) {
            vetor[k] = left[i];
            i++;
          } else {
            vetor[k] = right[j];
            j++;
          }
          k++;
        }
      
        while (i < n1) {
          vetor[k] = left[i];
          i++;
          k++;
        }
      
        while (j < n2) {
          vetor[k] = right[j];
          j++;
          k++;
        }
      }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
        int pi = partition(vetor, inicio, fim);
        quickSort(vetor, inicio, pi - 1);
        quickSort(vetor, pi + 1, fim);

        for (int i = 0; i < vetor.length; ++i)
            System.out.print(vetor[i] + " ");
            System.out.println();
        }
    }

    private static int partition(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivot) {
                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }

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
                System.out.println("4. QuickSort");
                System.out.println("5. MergeSort");
                int opcao = input.nextInt(); 
        
                switch (opcao) {
                    case 1:
                        OrdenacaoQuickSort.bolha(vetor);
                        break;
                    case 2:
                        OrdenacaoQuickSort.selecao(vetor);
                        break;
                    case 3:
                        OrdenacaoQuickSort.insercao(vetor);
                        break;
                    case 4:
                        OrdenacaoQuickSort.quickSort(vetor,  0, vetor.length - 1);
                        break;
                    case 5:
                        OrdenacaoQuickSort.mergeSort(vetor, 0, vetor.length - 1);
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