package Pratica2;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os valores de cada lado para verificar se são válidos: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((b-c) < a && (b+c) > a && (a-c) < b && (a+c) > b && (a-b) < c && (a+b) > c)
        {
            System.out.println("Valores válidos");
            System.out.println("Primeiro lado: " + a);
            System.out.println("Segundo lado: " + b);
            System.out.println("Terceiro lado: " + c);
        }else
            System.out.println("Valores inválidos");
        input.close();
    }
    
}
