import java.util.Scanner;

public class Atv7{
    public static void main(String[] args) 
    {
        double salariom,salariof;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do salario minimo: ");
        salariom = input.nextDouble();
        System.out.println("Informe o salario do funcionario: ");
        salariof = input.nextDouble();

        System.out.println("O salario do funcionario corresponde a: " + salariof/salariom + " salario mínimo");
        input.close();
    }
}