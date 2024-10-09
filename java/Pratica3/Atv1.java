package Pratica3;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) 
    {
        int cod = 0,nota = 1,falta,notaT = 0,notaMaior = 0,notaMenor = 0,nota90 = 0,reprovado = 0;
        Scanner input = new Scanner(System.in);  

        while (nota > 0){
            System.out.println("Informe a nota total do aluno: ");
            nota = input.nextInt();
            if (nota < 0)
            {
                System.out.println("A quantidade de alunos que obtiveram nota final maior ou igual a 90: " + nota90);
                System.out.println("A quantidade de alunos que foram reprovados por nota (nota menor que 70)\nou por falta (quantidade de faltas maior ou igual a 20): " + reprovado);
                System.out.println("A maior nota da turma: " + notaMaior);
                System.out.println("A menor nota da turma: " + notaMenor);
                System.out.println("A media da turma é: " + (notaT/cod));
                break;
            }
            System.out.println("Informe a quantidade de falta do aluno: ");
            falta = input.nextInt();

            if(nota >= 90)
                nota90++;
            else if (nota < 70 || falta >= 20)  
                reprovado++;
            else if (notaMaior < nota)
                notaMaior = nota;
            else if (notaMenor > nota)
                notaMenor = nota;
            
            notaT += nota;
            cod++;
        };
        input.close();
    }
    
}
