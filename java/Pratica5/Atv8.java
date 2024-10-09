package Pratica5;

import javax.swing.JOptionPane;

public class Atv8 {
    public static void main(String[] args) 
    {   
        int num1,num2 = 0,resultado = 1;
        String input;
        do{
            try{

            input = JOptionPane.showInputDialog(null,"Informe o primeiro número: ","SISTEMA",JOptionPane.QUESTION_MESSAGE);

            num1 = Integer.parseInt(input);
            if (num1 <= 0){   
                throw new IllegalArgumentException("Número negativo.");
            }
            input = JOptionPane.showInputDialog(null,"Informe o segundo número: ","SISTEMA",JOptionPane.QUESTION_MESSAGE);

            num2 = Integer.parseInt(input);
            if (num2 <= 0){   
                throw new IllegalArgumentException("Número negativo.");
            }
            
            for(int i = 0;i < num2; i++)
            {
                resultado *= num1;
            }

            int resp = JOptionPane.showOptionDialog(null,"O resultado é: " + resultado,"RESULTADO",JOptionPane.INFORMATION_MESSAGE,JOptionPane.OK_CANCEL_OPTION,null,new Object[]{"CONTINUAR","SAIR"},"");
            if (resp == JOptionPane.OK_OPTION){
                resultado = 1;
                input = "s";
            }
            else
                input = "n";
            }
            catch(NumberFormatException e){
                int resp = JOptionPane.showOptionDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE,JOptionPane.OK_CANCEL_OPTION,null,new Object[]{"CONTINUAR","SAIR"},"");
                if (resp == JOptionPane.OK_OPTION)
                    input = "s";
                else
                    input = "n";
            }
            catch(IllegalArgumentException e)
            {
                int resp = JOptionPane.showOptionDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE,JOptionPane.OK_CANCEL_OPTION,null,new Object[]{"CONTINUAR","SAIR"},"n");
                if (resp == JOptionPane.OK_OPTION)
                    input = "s";
                else
                    input = "n";
        }}while (input.equalsIgnoreCase("s"));

    }
    
}
