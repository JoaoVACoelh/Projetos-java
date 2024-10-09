package Pratica3;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) 
    {  
        int matricula = 1,nota1,nota2,nota3,med;
        Scanner input = new Scanner(System.in);  

        while (matricula > 0)
        {
            System.out.println("Informe a matrícula do aluno: ");
            matricula = input.nextInt();
            if(matricula < 0)
            {   
                System.out.println("PROGAMA ENCERRADO");
                break;
            }

            System.out.println("Informe a primeira nota: ");
            nota1 = input.nextInt();
            System.out.println("Informe a segunda nota: ");
            nota2 = input.nextInt();
            System.out.println("Informe a terceira nota: ");
            nota3 = input.nextInt();

            med = (nota1 + nota2 + nota3)/3;
            if(med >= 70)   
                System.out.println("APROVADO");
            else if(med >= 60 && med < 70)
                System.out.println("RECUPERAÇÃO");
            else    
                System.out.println("REPROVADO");
        }
        input.close();
    }
    
}
