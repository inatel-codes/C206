package aula_03;

import java.util.Scanner;

public class Aula_03 {

    public static void main(String[] args) {
        // Declarando a classe Scanner
        Scanner teclado = new Scanner(System.in);
        
        // IF 
        /*
        int a;
        int b;
        String maior;
        
        System.out.print("Primeiro valor: ");
        a = teclado.nextInt();
        
        System.out.print("Segundo valor: ");
        b = teclado.nextInt();
        
        // Comparando se um numero é maior que o outro
        if (a > b) 
        {
            
            maior = "A é maior que B";
        }
        
        else
        {
            maior = "A é menor ou igual a B";
        } 
        
        System.out.println(maior);
        
        // Operador ternario (if simplificado)
        maior = (a>b) ? "A é maior que B" : "A é menor ou igual a B";
        System.out.println(maior);
        */
        
        // While
        /*
        int cont = 0;
        
        while (cont <= 10) 
        {
            System.out.println("Java é legal");
            cont++;
        }
        */
        
        // Do-While
        /*
        int var;
        do 
        {
            System.out.print("Entre com um numero par: ");
            var = teclado.nextInt();
        } while(var%2 != 0);
        */
        
        // For
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Java é legal");
        }
        */
        
        // Switch
        int var;
        System.out.print("Entre com um numero: ");
        var = teclado.nextInt();
                
        switch (var) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
             System.out.println("Segunda");
             break;
            default:
                System.out.println("Numero invalido");
        } 
    }  
}
