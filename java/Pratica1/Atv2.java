import java.util.Scanner;

public class Atv2{
    public static void main(String[] args) 
    {
        int anoAtual,anoNasc;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o ano do seu nascimento: ");
        anoNasc = input.nextInt();
        System.out.println("Informe o ano atual: ");
        anoAtual = input.nextInt();

        System.out.println("Sua idade: " + (anoAtual - anoNasc));
        System.out.println("Sua idade em 2050: " + (2050 - anoNasc));
        input.close();
    }
}
