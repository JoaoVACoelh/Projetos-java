package Pratica2;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) 
    {
        double num1,num2;
        int opc;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        System.out.println("\nEscolha uma das opções:\n1- Soma 2- Multiplicação 3- Subtração 4- Divisão");
        opc = input.nextInt();

        if (opc == 1)
            System.out.println("A soma dos dois números: " + (num1 + num2));
        else if (opc == 2)  
            System.out.println("A multiplicação dos números é: " + (num1 * num2));
        else if (opc == 3){
            if(num1 == num2)
            {
                System.out.println("Números iguais: 0");
            }        
            else 
            {
                if(num1 > num2)
                {
                    System.out.println("Primeiro número maior que o segundo: " + (num1 - num2));
                }
                else if(num1 > num2)
                {
                    System.out.println("Segundo número maior que o primeiro: " + (num2 - num1));
                }
            }
        }
        else if (opc == 4)
        {
            if (num1 == 0 || num2 == 0)
                System.out.println("Divisão impossivel");
            else    
                System.out.println("Divisão do primeiro número pelo segundo: " + (num1/num2));
        }
        input.close();
    }
    
}
