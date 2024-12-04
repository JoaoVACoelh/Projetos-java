package Pratica13;

import java.util.Scanner;

public class Circulo {
    private int x, y;
    private double raio;

    public Circulo() {
        this(0, 0, 0);
    }
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        x += x1;
    }

    public void moveY(int y1) {
        y += y1;
    }

    public void aumenta(double n) {
        raio *= n;
    }

    public void exibirInformacoes() {
        System.out.println("Centro: (" + x + ", " + y + ")");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}


class CirculoMain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.print("Digite a coordenada x do centro: ");
        int x = input.nextInt();
        System.out.print("Digite a coordenada y do centro: ");
        int y = input.nextInt();
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover  2 - Aumentar  3 - Imprimir  4 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de unidades para mover no eixo X: ");
                    int dx = input.nextInt();
                    System.out.print("Digite a quantidade de unidades para mover no eixo Y: ");
                    int dy = input.nextInt();
                    circulo.moveX(dx);
                    circulo.moveY(dy);
                    break;
                case 2:
                    System.out.print("Digite o fator de aumento do raio: ");
                    double fator = input.nextDouble();
                    circulo.aumenta(fator);
                    break;
                case 3:
                    circulo.exibirInformacoes();
                    break;
                case 4:
                    System.out.println("Fechando Sistema");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        input.close();
    }
}