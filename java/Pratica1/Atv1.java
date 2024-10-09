import java.util.Scanner;

public class Atv1{
    public static void main(String[]args)
    {
        Double num1,num2,num3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe três numeros para serem somados:");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        System.out.println("A média dos três numeros é: " + (num1 + num2 + num3)/3);
        input.close();
    }
}