package jkeylogger;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JKeyLogger {

    public static void main(String[] args) {
        // Capturar infos do teclado
        Scanner teclado = new Scanner(System.in);

        String[] palavras = {"roubo", "bomba", "sequestro", "terrorismo"};

        boolean achou = false;

        try {
            // Permite escrever em tempo real no arquivo
            PrintStream ps = new PrintStream("logPolicia.txt");
            while (teclado.hasNextLine()) {
                String texto = teclado.nextLine();
                texto = texto.toLowerCase();
                
                if(!achou){
                    for (int i = 0; i < palavras.length; i++) {
                        if (texto.contains(palavras[i])) {
                            achou = true;
                            break;
                        }
                    }
                }
                else
                {
                    ps.println(texto);
                }
            }
            
            
            ps.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro = " + ex);
        }

    }

}
