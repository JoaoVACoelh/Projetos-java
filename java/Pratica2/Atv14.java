package Pratica2;

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) 
    {
        int cod;
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Escolha o codigo do comando para saber sua fução:\n1- git clone  2- git fetch  3-git pull");
        cod = input.nextInt();

        switch (cod) {
            case 1: System.out.println("GIT CLONE - é um utilitário de linha de comando que é usado para\nselecionar um repositório existente e criar um clone ou cópia do repositório de destino");
                break;
            case 2: System.out.println("GIT FETCH - é usado para buscar as alterações mais recentes de um \nrepositório remoto para o repositório local");
                break;
            case 3: System.out.println("GIT PULL - serve para recuperar e baixar o conteúdo de um repositório \nremoto e atualizar o repositório local assim que ele for baixado");
                break;
            default:System.out.println("Codigo invalido");
                break;
        }
        input.close();
    }
    
}
