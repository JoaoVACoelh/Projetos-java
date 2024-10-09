package Pratica6;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int sumnum = 0;
        
        System.out.println("Informe 10 números:");
        for (int i = 0; i < num.length;i++){
            num[i] = input.nextInt();
        }

        System.out.println("Números digitados:");
        for (int numero : num) {
            System.out.print(numero + " ");
            if (numero % 2 == 0) {
                sumnum += numero;
            }
        }
        System.out.println("\nA soma dos números pares é: " + sumnum);
        input.close();
    
        
    }
    
}
