import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) 
    {
        double cat1,cat2,hip;
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque abaixo os valores dos catetos: ");
        cat1 = Math.pow(input.nextDouble(),2);
        cat2 = Math.pow(input.nextDouble(),2);

        hip = Math.sqrt(cat1 + cat2);
        System.out.printf("O valor da hipotenusa será: %.2f", hip);
        input.close();
    }
}

