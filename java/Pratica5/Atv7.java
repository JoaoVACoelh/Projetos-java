package Pratica5;

import javax.swing.JOptionPane;

public class Atv7 {
    public static void main(String[] args) 
    {
        double num,numMaior = 0,numMenor = 0,quant = 0;
        String input = "";
        
        do{
            try{
            input = JOptionPane.showInputDialog(null,"Informe um número: ","SISTEMA",JOptionPane.QUESTION_MESSAGE);
            num = Integer.parseInt(input);
            quant += 1;

            if(num > numMaior)
                numMaior = num;
            else if (num < numMenor)
                numMenor = num;

            if (quant == 10) {
                JOptionPane.showMessageDialog(null,"O maior número é: " + numMaior,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"O menor número é: " + numMenor,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Informe apenas números.","ERRO",JOptionPane.ERROR_MESSAGE);
            }

        }while (quant < 10);
    }
    
}
