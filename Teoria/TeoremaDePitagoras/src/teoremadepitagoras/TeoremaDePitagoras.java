package teoremadepitagoras;

import java.util.Scanner;

public class TeoremaDePitagoras {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         //Variáveis
         int x1;
         int x2;
         int y1;
         int y2;
         double dist;
         
         System.out.print("Entre com os valores (x1,y1): ");
         x1 = teclado.nextInt();
         y1 = teclado.nextInt();
         System.out.print("Entre com os valores (x2,y2): ");
         x2 = teclado.nextInt();
         y2 = teclado.nextInt();
         
         //Calculo da distancia
         double deltaX = Math.pow((x2-x1), 2);
         double deltaY = Math.pow((y2-y1), 2);
         dist = Math.sqrt((deltaX + deltaY));
         
         System.out.println("Distancia: " + dist);
         
         //Calcule Ponto Médio
         float pontoMedX = (x1+x2)/2; 
         float pontoMedY = (y1+y2)/2; 
         
         int medX = Math.round(pontoMedX); 
         int medY = Math.round(pontoMedY);
         System.out.println("Ponto Médio: (" + medX + " , " + medY + ")" );
         
         
         
    }
    
}
