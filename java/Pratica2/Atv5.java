package Pratica2;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) 
    {   
        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Defina o valor X: ");
        x = input.nextInt();

        if(x < -2)
            System.out.println("A função será [2x + 2] e a resposta será " + (2 * x) + 2);
        else if (x >= -2 && x < 3)
            System.out.println("A função será uma constante e a resposta será 3");
        else
            System.out.println("A função será negativa e a resposta será " + -1 * x);
        input.close();
    }
    
}
