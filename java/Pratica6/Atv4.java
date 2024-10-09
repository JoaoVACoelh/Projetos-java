package Pratica6;

import java.util.Scanner;

public class Atv4 {
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

        System.out.println("\nElementos nas posições pares:");
        for (int i = 0; i < num.length; i += 2) {
            System.out.print(num[i] + " ");
        } 
        input.close();
    }
}