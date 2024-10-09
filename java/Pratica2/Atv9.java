package Pratica2;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) 
    {  
        double velI;
        int tempo, planeta;
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um planeta e informe seu código: \n1-Mercúrio 2-Vênus 3-Terra 4-Marte 5-Júpiter 6-Saturno 7-Urano 8-Netuno 9-Plutão");
        planeta = input.nextInt();

        System.out.println("Informe a velocidade inicial da bola em M/S: ");
        velI = input.nextDouble();
        System.out.println("Informe o tempo que será verificado: ");
        tempo = input.nextInt();


        switch (planeta) {
            case 1: System.out.println("A velocidade da bola no instante informado será: " + (velI - (3.7 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((3.7 * tempo),2)/2)));
                break;
            case 2: System.out.println("A velocidade da bola no instante informado será: " + (velI - (8.8 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((8.8 * tempo),2)/2)));
                break;
            case 3: System.out.println("A velocidade da bola no instante informado será: " + (velI - (9.8 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((9.8 * tempo),2)/2)));
                break;
            case 4: System.out.println("A velocidade da bola no instante informado será: " + (velI - (3.8 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((3.8 * tempo),2)/2)));
                break;
            case 5: System.out.println("A velocidade da bola no instante informado será: " + (velI - (26.4 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((26.4 * tempo),2)/2)));
                break;
            case 6: System.out.println("A velocidade da bola no instante informado será: " + (velI - (11.5 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((11.5 * tempo),2)/2)));
                break;
            case 7: System.out.println("A velocidade da bola no instante informado será: " + (velI - (9.3 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((9.3 * tempo),2)/2)));
                break;
            case 8: System.out.println("A velocidade da bola no instante informado será: " + (velI - (12.2 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((12.2 * tempo),2)/2)));
                break;
            case 9: System.out.println("A velocidade da bola no instante informado será: " + (velI - (0.6 * tempo)));
            System.out.println("A altura da bola no instante informado será: " + (velI * tempo - (Math.pow((0.6 * tempo),2)/2)));
                break;
            default: System.out.println("PLANETA INVALIDO");
                break;
        }
        input.close();
    }
}
