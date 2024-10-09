package Pratica5;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) 
    {
        String sexo;
        int peso,pesq = 0,pesq1 = 0, quant = 0;
        Scanner input = new Scanner(System.in);     
        do{
        System.out.println("Informe seu Peso: ");
        peso = input.nextInt();
        System.out.println("Informe seu sexo: ");
        sexo = input.next();

        if (sexo.equalsIgnoreCase("m")){
            if(peso >= 60 && peso <= 80)
            {
                pesq += 1;
            }
        }

        if (sexo.equalsIgnoreCase("f")){
            if(peso >= 50 && peso <= 70)
            {
                pesq1 += 1;
            }
        }

        quant += 1;
        }while(quant < 10);
        if(quant == 10)
        System.out.println("Quantidade de mulheres de 50 a 70 KG: " + pesq1);
        System.out.println("Quantidade de homens de 60 a 80 KG: " + pesq);
        input.close();
    }
    
}
