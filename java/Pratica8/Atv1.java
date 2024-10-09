package Pratica8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc, resultado = -1;;
        int[] vetor = new int[10]; 

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(10);  

        }

        Arrays.sort(vetor);
        do {
            System.out.println("Informe o tipo de busca que deseja usar: \n1- Sequencial 2- Sequencial com Sentinela 3- Encerrar Aplicação");
            opc = input.nextInt();

            System.out.println("Informe o número que deseja buscar: ");
            int pesq = input.nextInt();

            if (opc == 1) {
                for (int i = 0; i < 10; i++) {
                    if (vetor[i] == pesq) {
                        resultado = i;
                        break;
                    }
                }
            }else if (opc == 2) {
                vetor[9] = pesq;
                int i;
                for (i = 0; vetor[i] != pesq; i++) ;
                if (i < 10) {
                    resultado = i;
                }
            }

            if (resultado != -1) {
                System.out.println("O valor " + pesq + " foi encontrado na posição " + resultado);
            } else {
                System.out.println("O valor " + pesq + " não foi encontrado no vetor.");
            }

        } while (opc != 3);

        System.out.println("Números digitados:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }

        input.close();
    }
}