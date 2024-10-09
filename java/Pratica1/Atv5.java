import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) 
    {   
        double dMaior,dMenor;
        Scanner input = new Scanner(System.in);   

        System.out.println("Informe a maior diagonal do losango: ");
        dMaior = input.nextDouble();
        System.out.println("Informe a menor diagonal do losango: ");
        dMenor = input.nextDouble();

        System.out.println("A área do losango é " + (dMaior * dMenor)/2);
        input.close();
    }
    
}
