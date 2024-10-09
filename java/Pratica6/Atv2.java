package Pratica6;

import java.util.Scanner;

public class Atv2 {
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

        System.out.println("\nPosições dos números negativos:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}