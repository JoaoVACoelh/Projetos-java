import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) 
    {
        int num;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Informe um número para saber a tabuada dele: ");
        num = input.nextInt();
        
        for(int i = 1; i < 11; i++){
            System.out.println("Resultado de: " + num + " * " + i + " = " + num * i);
        }
        input.close();
    }
    
}
