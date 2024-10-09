import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) 
    {
        double celsius;
        Scanner input = new Scanner(System.in);    

        System.out.println("Informe a temperatura em Celsius: ");
        celsius = input.nextDouble();

        System.out.println("A temperatura em fahrenheit: " + (celsius * 1.8)+ 32);
        input.close();
    }
    
}
