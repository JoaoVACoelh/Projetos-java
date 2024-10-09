import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) 
    {
        double salario;
        Scanner input = new Scanner(System.in);   

        System.out.println("Informe o seu salario: ");
        salario = input.nextDouble();

        System.out.println("Seu novo salario teve um aumento de 25% e agora será " + (salario/100) * 125);
        input.close();
    }
}
