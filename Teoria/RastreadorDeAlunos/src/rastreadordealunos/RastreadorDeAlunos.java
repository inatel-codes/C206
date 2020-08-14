package rastreadordealunos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RastreadorDeAlunos {

    public static void main(String[] args) {
        boolean sair = false;
        
        while(sair == false)
        {
            
            int contGEB = 0, contGEC = 0, contGEA = 0, contGET = 0;
            String op = JOptionPane.showInputDialog("Entre com uma opção: \n [1] Numero de alunos; \n [2] Buscar aluno; \n [0] Sair.");

            try {
                InputStream is = new FileInputStream("emails.txt"); // APONTA PARA O ARQUIVO E LÊ UM FLUXO DE BYTES
                InputStreamReader isr = new InputStreamReader(is); // TRANSFORMANDO OS BYTES EM CARACTERES
                BufferedReader br = new BufferedReader(isr); // TRANSFORMANDO OS CARACTERES EM PALAVRAS

                if(op.equals("1"))
                {
                    String linha = br.readLine(); // LENDO UMA LINHA DO ARQUIVO

                    // LENDO TODOS EMAILS DENTRO DO ARQUIVO ATE ENCONTRAR UMA LINHA EM BRANCO
                    while(linha != null)
                    {
                        if(linha.contains("@get"))
                        {
                            contGET++;
                        }
                        else if(linha.contains("@gec"))
                        {
                            contGEC++;
                        }
                        else if(linha.contains("@geb"))
                        {
                            contGEB++;
                        }
                        else if(linha.contains("@gea"))
                        {
                            contGEA++;
                        }

                        linha = br.readLine(); // PULA PRA PROXIMA LINHA
                    }

                    JOptionPane.showMessageDialog(null, "Numero de alunos:" + "\n Telecom: " + contGET + "\n Computação: " + contGEC + "\n Biomédica: " + contGEB + "\n Automação: " + contGEA);
                }
                else if(op.equals("2"))
                {
                    String email = JOptionPane.showInputDialog("Qual email procura?");
                    String linha = br.readLine();
                    boolean achou = false;

                    while(linha != null)
                    {
                        if(email.equals(linha))
                        {
                            JOptionPane.showMessageDialog(null, "Email encontrado!");
                            achou = true;
                            break;
                        }

                        linha = br.readLine(); // PULA PRA PROXIMA LINHA DO ARQUIVO
                    }

                    if(achou == false)
                    {
                        JOptionPane.showMessageDialog(null, "Email não encontrado!");
                    }
                }

                else if(op == "0")
                {
                    sair = true;
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao ler o aquivo!");
            } catch (IOException ex) {
                Logger.getLogger(RastreadorDeAlunos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
