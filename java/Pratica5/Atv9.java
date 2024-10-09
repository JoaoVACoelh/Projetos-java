package Pratica5;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) 
    {
        int num;
        Scanner input = new Scanner(System.in);  

        System.out.println("Informe um número: ");
        num = input.nextInt();

        for(int i = 1;i < num; i++)
        {
            if((i % 2) != 0){
                System.out.println("Numero impar: " + i);
            }
        }   
        input.close();
    }
}
