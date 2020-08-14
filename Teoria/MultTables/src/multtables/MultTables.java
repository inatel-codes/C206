
package multtables;

import java.util.Scanner;

public class MultTables {

    public static void main(String[] args) {
        
        int numero;
        int inicio;
        int fim;
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Numero: ");
        numero = teclado.nextInt();
        
        System.out.print("Inicio: ");
        inicio = teclado.nextInt();
        
        System.out.print("Fim: ");
        fim = teclado.nextInt();
        
        for(int i = inicio; i<fim; i++)
        {
            System.out.println(numero + "*" + i + " = " + numero*i);
        }
        
        
        
    }
    
}
