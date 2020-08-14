package gorangers;
    
import java.util.Scanner;

public class GoRangers {

    public static void main(String[] args) {
       
       // Variaveis
       int viloes_ano1;
       int viloes_ano2;
       int viloes_ano3;
       
       // Declarando a Classe Scanner
       Scanner teclado = new Scanner(System.in);
       
       // Entrada de dados
       System.out.print("Ano 1: ");
       viloes_ano1 = teclado.nextInt();
       
       System.out.print("Ano 2: ");
       viloes_ano2 = teclado.nextInt();
       
       System.out.print("Ano 3: ");
       viloes_ano3 = teclado.nextInt();
       
       // Calculos
       int total = viloes_ano1 + viloes_ano2 + viloes_ano3;
       float media = total/3;
       
       // Saida de dados
       System.out.println("Total de vilões: " + total);
       System.out.println("Media dos vilões: " + media);
        
    }
    
}
