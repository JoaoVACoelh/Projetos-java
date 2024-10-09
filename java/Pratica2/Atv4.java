package Pratica2;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) 
    {       
        double peso,altura,imc;
        Scanner input = new Scanner(System.in);  
          
        System.out.println("Informe seu peso em KG: ");
        peso = input.nextDouble();
        System.out.println("Informe sua altura em METROS: ");
        altura = input.nextDouble();

        imc = peso/Math.pow(altura,2);

        if (imc < 20)   
            System.out.println("Abaixo do Peso");
        else if (imc >= 20 && imc < 25)
            System.out.println("Peso ideal");
        else if (imc >= 25 && imc < 30)
            System.out.println("Sobrepeso");
        else if (imc >= 30 && imc < 40)
            System.out.println("Obesidade");
        else
            System.out.println("Obesidade Mórbida");
        input.close();
    }
    
}
