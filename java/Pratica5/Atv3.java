package Pratica5;

import javax.swing.JOptionPane;

public class Atv3 { 
    public static void main(String[] args) 
    {
        int num,fatorial = 1;
        String input = "";

        do {
            try{
                input = JOptionPane.showInputDialog("Informe um número para saber o seu fatorial: ");
                num = Integer.parseInt(input);

                if (num < 0)
                {
                    throw new IllegalArgumentException("Numero invalido.");
                }
                switch (num) {
                    case 0 :                     
                        int resp = JOptionPane.showConfirmDialog(null,"O fatorial de "+ num +" é "+"1" ,"Resultado",JOptionPane.INFORMATION_MESSAGE);
                        if (resp == JOptionPane.YES_OPTION)
                            input = "sim";
                        else
                            input = "n"; 
                        break;
                    default: 
                        for (int i = num;i > 0; i--)
                        {
                            fatorial *= i;
                        }
                        int resp1 = JOptionPane.showConfirmDialog(null,"O fatorial de "+ num +" é "+ fatorial,"Resultado",JOptionPane.INFORMATION_MESSAGE);
                        if (resp1 == JOptionPane.YES_OPTION){
                            input = "sim";
                            fatorial = 1;
                        }
                        else
                            input = "n"; 
                    break;
                }
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                catch(IllegalArgumentException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
                }}while (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("sim"));
        }
    }
    
