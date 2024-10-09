package Pratica2;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) 
    {
        int entrada;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um código de 1 a 5");
        entrada = input.nextInt();

        if(entrada == 1)
            System.out.println("Sapato | R$99,99");
        else if(entrada == 2)
            System.out.println("Bolsa | R$103,89");
        else if(entrada == 3) 
            System.out.println("Camisa | R$49,98");
        else if(entrada == 4)
            System.out.println("Calça | R$89,72");
        else if(entrada == 5)
            System.out.println("Blusa | R$97,35");
        else 
            System.out.println("Código de produto não existente no estoque.");
        input.close();   
    }
}
