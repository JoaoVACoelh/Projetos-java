package Pratica5;

import javax.swing.JOptionPane;

public class Atv2 {
    public static void main(String[] args) 
    {
        String input;
        int inicial = 0,limite = 0;

        do{
            try{
            input = JOptionPane.showInputDialog("Informe um numero incial: ");
            inicial = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("Informe um numero limitador: ");
            limite = Integer.parseInt(input);

            if(inicial < 0)
            {
                throw new IllegalArgumentException("Número(s) informado(s) invalido(s).");
            }
            else if (inicial < limite)
            {
                throw new IllegalArgumentException("Número inicial invalido.");
            }
            for (int i = inicial + 1;i < limite;i++)
            {
                JOptionPane.showMessageDialog(null,"Os números existentes dentro do limite informado é: " + i);
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

