import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) 
    {
        double dolar,valorP;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a cotação do dolar: ");
        dolar = input.nextDouble();
        System.out.println("Informe o valor possuido de dolares: ");
        valorP = input.nextDouble();
        
        System.out.println("Você possui R$" + (valorP * dolar));
        input.close();
    }
}
