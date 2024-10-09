package Pratica2;

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) 
    {
        int apt,dias;
        Scanner input = new Scanner(System.in);    
        
        System.err.println("Informe o tipo do apartamento: 1- Apto Simple  2- Apto Duplo");
        apt = input.nextInt();
        System.out.println("Informe a quantidade de dias de hospedagem: ");
        dias = input.nextInt();

        if (apt == 1)
        {
            if(dias < 10)
                System.out.println("A cobrança diaria será de: R$100,00");
            else if(dias >= 10 && dias <= 15)
                System.out.println("A cobrança diaria será de: R$90,00");
            else if (dias > 15)
                System.out.println("A cobrança diaria será de: R$80,00");
            else 
                System.out.println("Dias informados incorretamente.");
        }
        else if (apt == 2)
        {
            if(dias < 10)
                System.out.println("A cobrança diaria será de: R$100,00");
            else if(dias >= 10 && dias <= 15)
                System.out.println("A cobrança diaria será de: R$90,00");
            else if (dias > 15)
                System.out.println("A cobrança diaria será de: R$80,00");
            else 
                System.out.println("Dias informados incorretamente.");
        }
        else    
            System.out.println("Tipo de apartamento informado incorretamente.");
        input.close();
    }
    
}
