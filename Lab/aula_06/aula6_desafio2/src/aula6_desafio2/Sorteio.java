package aula6_desafio2;

import java.util.Random;

public class Sorteio {
    int numeroConcurso;
    String data;
    String local;
    float valor;
    int numerosSorteados;
    boolean ganhadores;
    
    public void sortear(int [] pessoasJogaram)
    {
        // Declarando a classe Random para gerar um numero aleatorio
        Random randomGenerator = new Random();
        numerosSorteados = randomGenerator.nextInt(1000);
        
        System.out.println(" ");
        System.out.println("RESULTADO DO SORTEIO " + (numeroConcurso+1) + ": ");
        for (int i = 0; i < 105; i++) {
            if(pessoasJogaram[i] == numerosSorteados)
            {
                System.out.println("Pessoa " + i + " ganhou!");
                ganhadores = true;
            }         
        }
        
        if(ganhadores == false)
            System.out.println("Ninguem ganhou o sorteio!"); 
        
        ganhadores = false;
    }
}
