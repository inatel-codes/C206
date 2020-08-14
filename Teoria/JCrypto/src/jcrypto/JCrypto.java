package jcrypto;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class JCrypto {

    public static void main(String[] args) {
        String mensagem;
        int mensagemInt;
        int k;
        char mensagemChar;
        String mensagemCriptografada = null;
        
        
        mensagem = JOptionPane.showInputDialog("Entre com uma mensagem: ");
        k = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de k: "));
        
        for (int i = 0; i < mensagem.length(); i++) {
            mensagemInt = mensagem.charAt(i);
            mensagemInt = mensagemInt - k;  
            mensagemChar = (char) mensagemInt;
            if(i == 0)
                mensagemCriptografada = String.valueOf(mensagemChar);
            else
                mensagemCriptografada = mensagemCriptografada + String.valueOf(mensagemChar);
         
        }
        
        OutputStream os;
        try {
            os = new FileOutputStream("mensagem.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            try {
                bw.write(mensagemCriptografada);
                bw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao escrever no arquivo!");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao escrever no arquivo!");
        }
        
        
        
    }

}
