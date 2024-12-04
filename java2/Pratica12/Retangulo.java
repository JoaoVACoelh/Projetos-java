package Pratica12;

import java.util.Scanner;

public class Retangulo {
    private float altura, largura;

    /**
    Construtor que permite inicializar a altura e largura com valores específicos.
     */
    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    /**
    Obtém a altura do retângulo.
     */
    public float getAltura() {
        return altura;
    }

    /**
    Define a altura do retângulo.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    Obtém a largura do retângulo.
     */
    public float getLargura() {
        return largura;
    }

    /**
    Define a largura do retângulo.
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }

    /**
    Calcula a área do retângulo.
     */
    public float calculaArea() {
        return altura * largura;
    }

    /**
    Calcula o perímetro do retângulo.
     */
    public float calculaPerimetro() {
        return 2 * (altura + largura);
    }

    /**
    Exibe as informações do retângulo em formato textual.
     */
    public String exibe() {
        return "Altura: " + altura + "\n" +
               "Largura: " + largura + "\n" +
               "Área: " + calculaArea() + "\n" +
               "Perímetro: " + calculaPerimetro();
    }

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a altura do retângulo: ");
        float altura = input.nextFloat();
        System.out.print("Informe a largura do retângulo: ");
        float largura = input.nextFloat();

        Retangulo retangulo = new Retangulo(altura, largura);
        System.out.println(retangulo.exibe());
        input.close();
    }
}