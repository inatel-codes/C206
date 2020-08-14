package divisaosegura;

import javax.swing.JOptionPane;

public class DivisaoSegura {

    public static void main(String[] args) {
        // VARIAVEIS QUE GUARDARÃO OS NUMEROS
        int num1;
        int num2;

        try 
        {
            // INPUT DIALOG PARA LER INFORMAÇÕES
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo numero:"));

            float result = num1 / num2; 

            // SHOW MESSAGE DIALOG PARA MOSTRAR INFORMAÇÕES
            JOptionPane.showMessageDialog(null, "A divisão de " + num1 + " por " + num2 + " é: " + result);
            
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "ERRO! Favor entrar com um número!");
        } catch(ArithmeticException e2){
            JOptionPane.showMessageDialog(null, "ERRO! Não existe divisão por zero!");
        }

    }

}
