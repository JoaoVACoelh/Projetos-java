package Pratica3;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) 
    {  
        double specT = 0,spec2 = 0,spec4 = 0,spec5 = 0,spec7 = 0,spec12 = 0;
        int canal = 1;
        Scanner input = new Scanner(System.in); 

        while (canal > 0)
        {
            System.out.println("Informe o número do canal: (2,4,5,7,12)");
            canal = input.nextInt();
            if(canal == 0 )
            {   
                System.out.println("Percentual de espectadores do canal 2 com base no total: " + ((spec2 * 100)/ specT) + "%");
                System.out.println("Percentual de espectadores do canal 4 com base no total: " + ((spec4 * 100)/ specT) + "%");
                System.out.println("Percentual de espectadores do canal 5 com base no total: " + ((spec5 * 100)/ specT) + "%");
                System.out.println("Percentual de espectadores do canal 7 com base no total: " + ((spec7 * 100)/ specT) + "%");
                System.out.println("Percentual de espectadores do canal 12 com base no total: " + ((spec12 * 100)/ specT) + "%");
                System.out.println("Encerrando programa");
                break;
            }else
            switch (canal) {
                case 2: 
                    System.out.println("Informe o numero de espectadores: ");
                    spec2 = input.nextInt();
                    specT += spec2;
                    break;
                case 4: 
                    System.out.println("Informe o numero de espectadores: ");
                    spec4 = input.nextInt();
                    specT += spec4;
                    break;
                case 5: 
                    System.out.println("Informe o numero de espectadores: ");
                    spec5 = input.nextInt();
                    specT += spec5;
                    break;
                case 7: 
                    System.out.println("Informe o numero de espectadores: ");
                    spec7 = input.nextInt();
                    specT += spec7;
                    break;
                case 12: 
                    System.out.println("Informe o numero de espectadores: ");
                    spec12 = input.nextInt();
                    specT += spec12;
                    break;
                default:
                    System.out.println("Canal invalido");
                    break;
            }
        }
        input.close();
    }
    
}
