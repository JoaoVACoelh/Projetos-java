package Pratica4;

import javax.swing.JOptionPane;

public class Atv2 {
    public static void main(String[] args) 
    {
        String input;
        int dinheiro,cent,dez,uni;

        do{
        input = JOptionPane.showInputDialog("Informe o seu saldo: ");
        dinheiro = Integer.parseInt(input);

        if(dinheiro > 999){
            dinheiro = dinheiro % 1000;
        }

        cent = dinheiro / 100;
        dez = (dinheiro % 100)/ 10;
        uni = dinheiro % 10;

        JOptionPane.showConfirmDialog(null,"A soma do saldo inverso: " +  (dinheiro + (uni * 100 + dez * 10 + cent)));
        JOptionPane.showConfirmDialog(null,"A multiplicação pela sua posição: " + (cent + dez * 2 + uni * 3));
        
        int resp = JOptionPane.showConfirmDialog(null,"O digito verificador do saldo será: " + (cent + dez * 2 + uni * 3) % 10);
        
        if (resp == JOptionPane.YES_OPTION)
        input = "sim";
        else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
        input = "não";
        } while (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("sim"));
        
    }    
}
