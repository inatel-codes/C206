package aula6_desafio2;

import java.util.Random;

public class Aula6_desafio2 {

    public static void main(String[] args) {
        int[] pessoasJogaram;
        pessoasJogaram = new int[105];

        // Declarando a classe Random para gerar um numero aleatorio
        Random randomGenerator = new Random();

        Sorteio sorteio = new Sorteio();
        for (int i = 0; i < 105; i++) 
        {
            for (int j = 0; j < 105; j++) 
            {
                pessoasJogaram[j] = randomGenerator.nextInt(1000);
            }
            sorteio.numeroConcurso = i;
            sorteio.sortear(pessoasJogaram);
        }
    }

}
