package Pratica2;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) 
    {
        int a,b,c;
        double delta;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A,B e C: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        delta = (Math.pow(b, 2) - (4 * a * c));

        if (a == 0 && b == 0 && c == 0)
            System.out.println("Igualdade confirmada: 0 = 0");
        else if (a == 0 && b == 0 && c != 0)
            System.out.println("Coeficientes informados incorretamente");
        else if (a == 0 && b != 0)
            System.out.println("Esta é uma equação de primeiro grau e o resultado será: " + (-1 * c)/b);
        else
        {
            System.out.println("Esta é uma equação de segundo grau.");
            if(delta < 0)
                System.out.println("Esta equação não possui raizes reais.");
            else if (delta == 0)
                System.out.println("Esta equação possui duas raízes reais iguais e o resulta será: " + (-1 * b)/(2 * a));
            if (delta > 0)
            {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Primeira raiz: " + ((-1 * b) + delta)/(2 * a));
                System.out.println("Segunda raiz: " + ((-1 * b) - delta)/(2 * a));
            }
            input.close();
        }
    }
    
}
