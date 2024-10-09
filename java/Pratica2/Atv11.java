package Pratica2;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) 
    {
        int dias;
        Scanner input = new Scanner(System.in);    

        System.out.println("Informe o total de dias da estadia: ");
        dias = input.nextInt();

        if(dias < 15)
            System.out.println("O valor a ser pago: R$" + (dias * 500) + (dias * 15));
        else if (dias == 15)
            System.out.println("O valor a ser pago: R$" + (dias * 500) + (dias * 10));
        else if (dias > 15)
            System.out.println("O valor a ser pago: R$" + (dias * 500) + (dias * 5));
        else 
            System.out.println("Quantidade de dias informada incorretamente.");
        input.close();
    }
}
