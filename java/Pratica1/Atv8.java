import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) 
    {
        double peso;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso em KG: ");
        peso = input.nextDouble();

        System.out.println("Seu peso caso você engorde 15%: " + (peso/100) * 115);
        System.out.println("Seu peso caso você emagreça 20%: " + (peso/100) * 80);
        input.close();
    }
    
}
