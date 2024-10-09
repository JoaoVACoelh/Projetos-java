import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) 
    {
        double raio;
        Scanner input = new Scanner(System.in);   

        System.out.println("Informe o raio de uma esfera: ");
        raio = input.nextDouble();

        System.out.println("O comprimento da esfera será: " + (2 * 3.14 * raio));
        System.out.println("A área da esfera será: " + (3.14 * Math.pow(raio, 2)));
        System.out.println("O volume da esfera será: " + (4 * 3.14 * Math.pow(raio, 3))/3);
        input.close();
    }
    
}
