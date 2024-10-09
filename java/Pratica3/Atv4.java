package Pratica3;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) 
    {       
        double salario = 1,salarioT = 0;
        int quant = 0,filhos, filhosT = 0;
        Scanner input = new Scanner(System.in);  

        while(salario > 0)
        {
            System.out.println("Informe seu salario: ");
            salario = input.nextDouble();
            if (salario <= 0)
            {
                System.out.println("Media salarial dos habitantes: " + (salarioT/quant));
                System.out.println("Media de filhos dos habitantes: " + (filhosT/quant));
                System.out.println("Encerrando programa.");
                break;
            }else
            {
                System.out.println("Informe a quantidade de filhos: ");
                filhos = input.nextInt();
                
                salarioT += salario;
                filhosT += filhos;
                quant++;
            }
        }
        input.close();
    }
    
}
