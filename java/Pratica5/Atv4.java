package Pratica5;

import javax.swing.JOptionPane;

public class Atv4 {
    public static void main(String[] args) 
    {
        int idade = 0,quant = 0;
        String input = "s";

        do{
            try{
            input = JOptionPane.showInputDialog(null,"Informe a sua idade para ser calculada a média: ","SISTEMA",JOptionPane.QUESTION_MESSAGE);
            idade += Integer.parseInt(input);
            quant += 1;

            if(Integer.parseInt(input) < 0)
            {
                throw new IllegalArgumentException("IDADE INVALIDA.");
            }

            int resp = JOptionPane.showOptionDialog(null,"Deseja continuar?","SISTEMA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sim", "Nao"},"Sim");
            if (resp == JOptionPane.YES_OPTION) 
            input = "s";
            else
            {
            input = "n";
            JOptionPane.showMessageDialog(null,"A idade Media é: "+ idade/quant,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            }

            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE);
            }
            catch(IllegalArgumentException e)
            {
                JOptionPane.showOptionDialog(null,e.getMessage(),"SISTEMA",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SAIR"},"");
            }}while (input.equalsIgnoreCase("s") || input.equalsIgnoreCase ("sim"));
    }
    
}
