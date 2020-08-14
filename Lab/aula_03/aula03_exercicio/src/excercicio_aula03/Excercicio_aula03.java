package excercicio_aula03;

import java.util.Scanner;

public class Excercicio_aula03 {

    public static void main(String[] args) {
        
        // Exercicio 5
        /*
        Scanner teclado = new Scanner(System.in);
        
        int np1;
        int np2;
        int media;
        
        System.out.print("NP1: ");
        np1 = teclado.nextInt();
        System.out.print("NP2: ");
        np2 = teclado.nextInt();
        
        media = (np1+np2)/2;
        
        System.out.println("Media = " + media);
        */
        
        /*
        // Exercicio 6
        final float SALARIO_MINIMO = 998.00f;
        final float PRECO_HORA_TRABALHO = 9.30f;
        
        float gerente;
        float engenheiro;
        float servicosTerceirizados;
        
        gerente = 3*SALARIO_MINIMO;
        engenheiro = 7*SALARIO_MINIMO;
        servicosTerceirizados = (8*PRECO_HORA_TRABALHO)*30;
        
        System.out.println("Salario do Gerente = R$ " + gerente);
        System.out.println("Salario do Engenheiro = R$ " + engenheiro);
        System.out.println("Salario dos Servicos Terceirizados = R$ " + servicosTerceirizados);
        */
        
        final float PASSAGEM_ONIBUS = 2.75f;
        
        System.out.print("Valor em reais: ");
        Scanner teclado = new Scanner(System.in);
        
        float valorReais = teclado.nextInt();
        int possiveisViagens = (int) (valorReais/PASSAGEM_ONIBUS);
        
        System.out.println("Total de viagens = " + possiveisViagens + " viagens");
       
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
