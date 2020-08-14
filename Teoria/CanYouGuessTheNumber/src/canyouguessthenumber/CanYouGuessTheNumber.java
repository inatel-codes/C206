
package canyouguessthenumber;

import java.util.Random;
import java.util.Scanner;

public class CanYouGuessTheNumber {

    
    public static void main(String[] args) {
        
        int num;
        int numAleatorio;
        int tentativa = 0;
        
        // Declarando a classe Random para gerar um numero aleatorio
        Random randomGenerator = new Random();
        
        // Sortando um numero aleatorio de 1 a 10
        numAleatorio = randomGenerator.nextInt(10)+1;
        
        // Declarando a classe Scanner
        Scanner teclado = new Scanner(System.in);
       
        // Enquanto nao advinhar o numero nao sai do while
        while(true)
        {
            System.out.print("Escolha um Numero: ");
            num = teclado.nextInt();
            
            tentativa++;
            
            if(num == numAleatorio)
            {
                System.out.println("Parabens! Voce acertou.");
                System.out.println("Numero de tentativas: " + tentativa);
                break;
            }
            
            else
               System.out.println("Voce errou!");  
        }
    }
}
