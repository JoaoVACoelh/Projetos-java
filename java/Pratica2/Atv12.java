package Pratica2;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) 
    {
        String genero;
        int idade;
        Scanner input = new Scanner(System.in);       

        System.out.println("Informe a idade a ser verificada: ");
        idade = input.nextInt();
        System.out.println("Agora informe o gênero da pessoa (M / F): ");
        genero = input.nextLine();

        if(genero == "f" && genero == "F")
        {
            if (idade <= 18)    
                System.out.println("A mensalidade a ser paga será R$60,00");
            else if(idade > 18 && idade <= 25)
                System.out.println("A mensalidade a ser paga será R$90,00");
            else if(idade > 25 && idade <= 40)
                System.out.println("A mensalidade a ser paga será R$85,00");
            else if(idade > 40)
                System.out.println("A mensalidade a ser paga será R$80,00");
        }
        else if(genero == "m" && genero == "M")
        {
            if (idade <= 15)    
             System.out.println("A mensalidade a ser paga será R$60,00");
            else if(idade > 15 && idade <= 18)
                System.out.println("A mensalidade a ser paga será R$75,00");
            else if(idade > 18 && idade <= 30)
                System.out.println("A mensalidade a ser paga será R$90,00");
            else if(idade > 30 && idade <= 40)
                System.out.println("A mensalidade a ser paga será R$85,00");
            else if(idade > 40)
                System.out.println("A mensalidade a ser paga será R$80,00");
        }
        else
            System.out.println("Genero invalido");
        input.close();
    }
    
}
