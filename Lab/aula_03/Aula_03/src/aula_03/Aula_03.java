package aula_03;

import java.util.Scanner;

public class Aula_03 {

    public static void main(String[] args) {
        
        /*
        // Variavel de referência (String)
        String palavra;
        
        // Variavel que armazena valores
        int a;
        
        double salario = 573.94;
        // Fazer o casting
        float numero1 = (float) 573.94;
        // Colocar f no final do valor da variavel
        float numero2 = 643.43f;
        
        // Declarando uma constante
        final float SALARIO_MENSAL = 839.59f;
        float precoMoto = 15000.00f;
        
        int nMeses; // numero de meses que consigo comprar uma moto
        
        nMeses = (int) (precoMoto/SALARIO_MENSAL);
        System.out.println("nMeses = " + nMeses);
        */
  
        /*
        
        // Declarando a classe para entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;
        
        // Fazendo a entrada de dados
        System.out.print("Primeiro numero: ");
        num1 = teclado.nextInt();
        
        System.out.print("Segundo numero: ");
        num2 = teclado.nextInt();
        
        teclado.nextLine();
        
        soma = num1 + num2;
        
        System.out.println("Soma = " + soma);
        */
        
        String palavra = "Laboratorio POO";
        
        // Colocando tudo em maiusculo
        palavra = palavra.toUpperCase();
        System.out.println(palavra);
        
        // Pegando tamanho da String (conta espaco)
        int tam = palavra.length();
        System.out.println(tam);
       
    }
    
}
