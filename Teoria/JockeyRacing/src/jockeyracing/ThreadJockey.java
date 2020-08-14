package jockeyracing;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadJockey extends Thread{
    //Atributos
    private JLabel label;
    private JFrame pista;
    private int id;
    private boolean fim = false;
    
    public ThreadJockey(JLabel l, JFrame f, int i)
    {
        this.label = l;
        this.pista = f;
        this.id = i;
        
    }
    
    @Override
    public void run()
    {
        Random r = new Random();
        int n = 0;
        
        while(!fim)
        {
            //Numero aleatorio de 0 a 5 para o cavalinho andar
           n = r.nextInt(6);
           
           // Se a posição x do cavalinho + 170, que é o tamanho da figura for menor q a largura da pista
           if(label.getX() + 170 < pista.getWidth())
           {
               // Seta a localição = posição no eixo x mais o numero aleatorio n, e a posição do eixo Y é fixa
               label.setLocation(label.getX() + n , label.getY());
               // Reprintar o label na tela 
               pista.repaint();
               
               try 
               {
                   Thread.sleep(50);
               } catch (InterruptedException ex)
               {
                   Logger.getLogger(ThreadJockey.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           }
           else
           {
               fim = true; 
              
           }
           
        }
        
        JOptionPane.showMessageDialog(pista, "Cavalinho " + id + " chegou!");
    }
       
}
