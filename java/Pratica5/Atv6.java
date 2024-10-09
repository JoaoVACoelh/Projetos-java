package Pratica5;

import javax.swing.JOptionPane;

public class Atv6 {
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
            if (quant == 10)
                JOptionPane.showOptionDialog(null,"A idade Media é: "+ idade/10,"RESULTADO",JOptionPane.NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"SAIR"},"");
            }catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE);
            }
            catch(IllegalArgumentException e)
            {
                JOptionPane.showOptionDialog(null,e.getMessage(),"SISTEMA",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SAIR"},"");
            }}while (quant < 10);
        }
}
