package Pratica2;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) 
    {       
        int nota1,nota2,nota3,med;
        Scanner input = new Scanner(System.in);  
        
        System.out.println("Informe suas três notas: ");
        nota1 = input.nextInt();
        nota2 = input.nextInt();
        nota3 = input.nextInt();

        if (nota1 <= 10 && nota1 >= 0 && nota2 <= 10 && nota2 >= 0 && nota3 <= 10 && nota3 >= 0)
        {
            med = (nota1 + nota2 + nota3)/3;
            if(med >= 0 && med < 3)
                System.out.println("REPROVADO");
            else if (med >= 3 && med < 7)   
                System.out.println("RECUPERAÇÂO");
            else
                System.out.println("APROVADO");
        }
        else
            System.out.println("NOTAS INVALIDAS");
        input.close();
    }
}
