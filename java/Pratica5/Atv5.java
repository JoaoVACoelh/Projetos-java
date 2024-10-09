package Pratica5;

import javax.swing.JOptionPane;

public class Atv5 {
    public static void main(String[] args) 
    {
        double num,numMaior = 0,numMenor = 0;
        String input = "";
        
        do{
            try{
            input = JOptionPane.showInputDialog(null,"Informe um número: ","SISTEMA",JOptionPane.QUESTION_MESSAGE);
            num = Integer.parseInt(input);

            if(num > numMaior)
                numMaior = num;
            else if (num < numMenor)
                numMenor = num;

            int resp = JOptionPane.showOptionDialog(null,"Deseja continuar?","SISTEMA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sim", "Nao"},"s");
            if (resp == JOptionPane.YES_OPTION) 
                input = "s";
            else{
                input = "n";
                JOptionPane.showMessageDialog(null,"O maior número é: " + numMaior,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"O menor número é: " + numMenor,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE);
            }

        }while (input.equalsIgnoreCase("s"));
    }
    
}
