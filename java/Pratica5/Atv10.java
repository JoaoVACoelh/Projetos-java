package Pratica5;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) 
    {
        String sexo;
        int idade,pesq = 0,quant = 0;
        Scanner input = new Scanner(System.in);     
        do{
        System.out.println("Informe sua idade: ");
        idade = input.nextInt();
        System.out.println("Informe seu sexo: ");
        sexo = input.next();

        if (sexo.equalsIgnoreCase("F")){
            if(idade >= 20 && idade <= 40)
            {
                pesq += 1;
            }
        }
        quant += 1;
        }while(quant < 10);
        if(quant == 10)
        System.out.println("Quantidade de mulheres de 20 a 40 anos: " + pesq);
        input.close();
    }
}
