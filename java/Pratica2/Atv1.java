package Pratica2;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) 
    {
        int nota;
        Scanner input = new Scanner(System.in);       

        System.out.println("Informe a sua nota: ");
        nota = input.nextInt();

        if (nota >= 7) System.out.println("VOCÊ FOI APROVADO");
        else System.out.println("VOCÊ FOI REPROVADO");    
        input.close();
    }
}
