package Pratica5;

import javax.swing.JOptionPane;

public class Atv1 {
    public static void main(String[] args) 
    {
        String input;
        int inicio = 0;

        do{
            try{
            input = JOptionPane.showInputDialog("Informe um numero entre 7 a 20: ");
            inicio = Integer.parseInt(input);

            if(inicio > 20 || inicio < 7)
            {
                throw new IllegalArgumentException("Número informado invalido");
            }
            for (int i = inicio;i <= 20;i++)
            {
                JOptionPane.showMessageDialog(null,"A soma de (" + i + " + 20) é " + (i + 20));
                if (i == 20)
                {
                    int resp = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
                    if(resp == JOptionPane.YES_OPTION)
                    input = "sim";
                    else
                    input = "n";
                }
            }
            }
            catch (NumberFormatException e)
            {
                int resp = JOptionPane.showConfirmDialog(null,"Insira apenas numeros","ERRO",JOptionPane.ERROR_MESSAGE);
                if(resp == JOptionPane.YES_OPTION)
                input = "s";
                else
                input = "n";
            }
            catch (IllegalArgumentException e)
            {
                int resp = JOptionPane.showConfirmDialog(null,e.getMessage(),"ERRO",JOptionPane.ERROR_MESSAGE);
                if(resp == JOptionPane.YES_OPTION)
                input = "sim";
                else
                input = "n";
            }
        }while (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("sim"));

    }


}

