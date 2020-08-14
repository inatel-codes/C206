package aula5_exercicio1;

import java.util.Scanner;

public class Aula5_exercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();
        System.out.print("Numero 1: ");
        calc.numero1 = teclado.nextFloat();
        System.out.print("Numero 2: ");
        calc.numero2 = teclado.nextFloat();
        
        calc.soma();
        calc.subtracao();
        calc.multiplicacao();
        calc.divisao();
    }
    
}
