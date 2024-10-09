package Pratica2;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) 
    {
        int lado1,lado2,lado3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe os valores dos lados do triangulo: ");
        lado1 = input.nextInt();
        lado2 = input.nextInt();
        lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3)
            System.out.println("TRIANGULO EQUILATERO");
        else if (lado1 == lado2 && lado2 != lado3 || lado1 != lado2 && lado2 == lado3 || lado1 == lado3 && lado2 != lado1)
            System.out.println("2 LADOS IGUAIS");
        else 
            System.out.println("3 LADOS DIFERENTES");
        input.close();
    }
    
}
