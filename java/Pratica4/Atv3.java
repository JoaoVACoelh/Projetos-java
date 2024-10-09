package Pratica4;

import javax.swing.JOptionPane;

public class Atv3 {
    public static void main(String[] args) 
    {
        String input,sexo;
        int idade, nota;
        double salario;

        do{
            try {
                input = JOptionPane.showInputDialog("Informe sua nota: (0 a 10)");
                nota = Integer.parseInt(input);
                if (nota < 0 || nota > 10) {
                    throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
                }

                input = JOptionPane.showInputDialog("Informe seu salário: ");
                salario = Double.parseDouble(input);
                if (salario < 0) {
                    throw new IllegalArgumentException("Salário não pode ser negativo.");
                }

                sexo = JOptionPane.showInputDialog("Informe seu sexo: (M ou F)");
                if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    throw new IllegalArgumentException("Sexo deve ser M ou F.");
                }

                input = JOptionPane.showInputDialog("Informe sua idade: (0 a 120)");
                idade = Integer.parseInt(input);
                if (idade < 0 || idade > 120) {
                    throw new IllegalArgumentException("Idade deve estar entre 0 e 120.");
                }

                JOptionPane.showMessageDialog(null,"DADOS INSERIDOS CORRETAMENTE, encerrando programa");
                input = "n";
                }
                catch (NumberFormatException e) 
                {
                    int resp = JOptionPane.showConfirmDialog(null, "Digite apenas números para nota, salário e idade.");
                    if (resp == JOptionPane.YES_OPTION)
                    input = "sim";
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Informe dados corretos antes de encerrar.");
                    input = "s";
                    }
                }
                catch (IllegalArgumentException e)
                {
                    int resp = JOptionPane.showConfirmDialog(null, e.getMessage());
                    if (resp == JOptionPane.YES_OPTION)
                    input = "sim";
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Informe dados corretos antes de encerrar.");
                    input = "s";
                    }
                }
            }while (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("sim"));
                
        }
    
    }

