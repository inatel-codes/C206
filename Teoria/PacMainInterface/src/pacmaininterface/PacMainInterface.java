package pacmaininterface;

import java.util.Random;
import java.util.Scanner;

public class PacMainInterface {

    public static void main(String[] args) throws InterruptedException {
        // CRIANDO UM PERSONAGEM PACMAN
        Personagem pacman = new PacMan();
        pacman.cor = "Amarelo";
        pacman.posicaoX = 6;
        pacman.posicaoY = 15;
        
        // ATRIBUINDO DADOS INICIAIS AO PACMAN
        PacMan pac = (PacMan) pacman;
        pac.setPontuacao(0);
        pac.setVidas(3);

        // CRIANDO O PRIMEIRO FANTASMA
        Personagem fantasma1 = new Inimigo();
        fantasma1.cor = "Vermelho";
        fantasma1.posicaoX = 0;
        fantasma1.posicaoY = 0;

        // CRIANDO O SEGUNDO FANTASMA
        Personagem fantasma2 = new Inimigo();
        fantasma2.cor = "Rosa";
        fantasma2.posicaoX = 0;
        fantasma2.posicaoY = 29;

        // CRIANDO O TERCEIRO FANTASMA
        Personagem fantasma3 = new Inimigo();
        fantasma3.cor = "Azul";
        fantasma3.posicaoX = 14;
        fantasma3.posicaoY = 0;

        // CRIANDO O QUARTO FANTASMA
        Personagem fantasma4 = new Inimigo();
        fantasma4.cor = "Laranja";
        fantasma4.posicaoX = 14;
        fantasma4.posicaoY = 29;

        Scanner teclado = new Scanner(System.in); // DECLARANDO A CLASSE SCANNER
        Random caminho = new Random(); // DECLARANDO A CLASSE RANDOM PARA GERAR NUMEROS ALEATORIOS
        // VARIAVEIS AUXILIARES PARA GUARDAR OS NUMEROS ALEATORIOS DO PACMAN E DOS FANTASMAS
        int auxPac; 
        int auxF1;
        int auxF2;
        int auxF3;
        int auxF4;

        String[][] mapa = new String[15][30]; // MATRIZ PARA GUARDAR O MAPA DO JOGO
        
        // PREENCHENDO O MAPA COM OS SIMBOLOS DE PONTUACAO
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 30; j++) {
                mapa[i][j] = "·";                
            }    
        }
        
        // ALOCANDO OS 4 FANTASMAS E O PACMAN NAS POSICOES INICIAIS
        mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "♦";
        mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "♣";
        mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "♠";
        mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "♥";
        mapa[pacman.posicaoX][pacman.posicaoY] = "©";
       
        // DANDO ESPACO 
        for (int i = 0; i < 300; i++) {
                System.out.print("\r\n");
        }
      
        // LOGICAS DO JOGO
        while (pac.getVidas() > 0) {
            // MOSTRANDO O CAMPO DE JOGO
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 30; j++) {

                    System.out.print(mapa[i][j] + " ");
                }
                System.out.println("");
            }
              
            // MOVENDO PACMAN
            auxPac = caminho.nextInt(4);
            switch (auxPac) 
            {
                // MOVENDO PARA CIMA
                case 0:
                    if(pacman.posicaoX > 0)
                    {
                        mapa[pacman.posicaoX][pacman.posicaoY] = " ";
                        pacman.movePraCima();
                        if(mapa[pacman.posicaoX][pacman.posicaoY] == "·")
                        {
                            ((PacMan) pacman).ganhaPonto();
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";                         
                        }
                        else if(mapa[pacman.posicaoX][pacman.posicaoY] == "♦" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♣" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♠" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♥"){
                            
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                            
                        }
                        else
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                         
                        
                    }
                    break;
                    
                // MOVENDO PARA BAIXO
                case 1:
                    if(pacman.posicaoX < 14)
                    {
                        mapa[pacman.posicaoX][pacman.posicaoY] = " ";
                        pacman.movePraBaixo();
                        if(mapa[pacman.posicaoX][pacman.posicaoY] == "·")
                        {
                            ((PacMan) pacman).ganhaPonto();
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                        }
                        else if(mapa[pacman.posicaoX][pacman.posicaoY] == "♦" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♣" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♠" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♥"){
                            
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                        
                    }
                    break;
                    
                // MOVENDO PARA ESQUERDA
                case 2:
                    if(pacman.posicaoY > 0)
                    {
                        mapa[pacman.posicaoX][pacman.posicaoY] = " ";
                        pacman.movePraEsquerda();
                        if(mapa[pacman.posicaoX][pacman.posicaoY] == "·")
                        {
                            ((PacMan) pacman).ganhaPonto();
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                        }
                        
                        else if(mapa[pacman.posicaoX][pacman.posicaoY] == "♦" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♣" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♠" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♥"){
                            
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                        
                        
                    }
                    break;
                
                // MOVENDO PARA DIREITA
                case 3:
                    if(pacman.posicaoY < 29)
                    {
                        mapa[pacman.posicaoX][pacman.posicaoY] = " ";
                        pacman.movePraDireita();
                        if(mapa[pacman.posicaoX][pacman.posicaoY] == "·")
                        {
                            ((PacMan) pacman).ganhaPonto();
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                        }
                        else if(mapa[pacman.posicaoX][pacman.posicaoY] == "♦" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♣" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♠" || 
                                mapa[pacman.posicaoX][pacman.posicaoY] == "♥"){
                            
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[pacman.posicaoX][pacman.posicaoY] = "©";
                    }
                    break;        
            }
            
            // MOVENDO FANTASMA 1
            auxF1 = caminho.nextInt(4);
            switch (auxF1) 
            {
                // MOVENDO PARA CIMA
                case 0:
                    if(fantasma1.posicaoX > 0)
                    {
                        mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "·";
                        fantasma1.movePraCima();
                        
                        if(mapa[fantasma1.posicaoX][fantasma1.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "♦";
                    }
                    break;
                    
                // MOVENDO PARA BAIXO
                case 1:
                    if(fantasma1.posicaoX < 14)
                    {
                        mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "·";
                        fantasma1.movePraBaixo();
                        if(mapa[fantasma1.posicaoX][fantasma1.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "♦";
                    }
                    break;
                    
                // MOVENDO PARA ESQUERDA
                case 2:
                    if(fantasma1.posicaoY > 0)
                    {
                        mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "·";
                        fantasma1.movePraEsquerda();
                        if(mapa[fantasma1.posicaoX][fantasma1.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "♦";
                    }
                    break;
                
                // MOVENDO PARA DIREITA
                case 3:
                    if(fantasma1.posicaoY < 29)
                    {
                        mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "·";
                        fantasma1.movePraDireita();
                        if(mapa[fantasma1.posicaoX][fantasma1.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma1.posicaoX][fantasma1.posicaoY] = "♦";
                    }
                    break;        
            }
            
            // MOVENDO FANTASMA 2
            auxF2 = caminho.nextInt(4);
            switch (auxF2) 
            {
                // MOVENDO PARA CIMA
                case 0:
                    if(fantasma2.posicaoX > 0)
                    {
                        mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "·";
                        fantasma2.movePraCima();
                        if(mapa[fantasma2.posicaoX][fantasma2.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "♣";
                        
                    }
                    break;
                    
                // MOVENDO PARA BAIXO
                case 1:
                    if(fantasma2.posicaoX < 14)
                    {
                        mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "·";
                        fantasma2.movePraBaixo();
                        if(mapa[fantasma2.posicaoX][fantasma2.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "♣";
                    }
                    break;
                    
                // MOVENDO PARA ESQUERDA
                case 2:
                    if(fantasma2.posicaoY > 0)
                    {
                        mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "·";
                        fantasma2.movePraEsquerda();
                        if(mapa[fantasma2.posicaoX][fantasma2.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "♣";
                    }
                    break;
                
                // MOVENDO PARA DIREITA
                case 3:
                    if(fantasma2.posicaoY < 29)
                    {
                        mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "·";
                        fantasma2.movePraDireita();
                        if(mapa[fantasma2.posicaoX][fantasma2.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma2.posicaoX][fantasma2.posicaoY] = "♣";
                    }
                    break;        
            }
            
            // MOVENDO FANTASMA 3
            auxF3 = caminho.nextInt(4);
            switch (auxF3) 
            {
                // MOVENDO PARA CIMA
                case 0:
                    if(fantasma3.posicaoX > 0)
                    {
                        mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "·";
                        fantasma3.movePraCima();
                        if(mapa[fantasma3.posicaoX][fantasma3.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "♠";
                        
                    }
                    break;
                    
                // MOVENDO PARA BAIXO
                case 1:
                    if(fantasma3.posicaoX < 14)
                    {
                        mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "·";
                        fantasma3.movePraBaixo();
                        if(mapa[fantasma3.posicaoX][fantasma3.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "♠";
                    }
                    break;
                    
                // MOVENDO PARA ESQUERDA
                case 2:
                    if(fantasma3.posicaoY > 0)
                    {
                        mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "·";
                        fantasma3.movePraEsquerda();
                        if(mapa[fantasma3.posicaoX][fantasma3.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "♠";
                    }
                    break;
                
                // MOVENDO PARA DIREITA
                case 3:
                    if(fantasma3.posicaoY < 29)
                    {
                        mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "·";
                        fantasma3.movePraDireita();
                        if(mapa[fantasma3.posicaoX][fantasma3.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma3.posicaoX][fantasma3.posicaoY] = "♠";
                    }
                    break;        
            }
            
            // MOVENDO FANTASMA 4
            auxF4 = caminho.nextInt(4);
            switch (auxF4) 
            {
                // MOVENDO PARA CIMA
                case 0:
                    if(fantasma4.posicaoX > 0)
                    {
                        mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "·";
                        fantasma4.movePraCima();
                        if(mapa[fantasma4.posicaoX][fantasma4.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "♥";
                    }
                    break;
                    
                // MOVENDO PARA BAIXO
                case 1:
                    if(fantasma4.posicaoX < 14)
                    {
                        mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "·";
                        fantasma4.movePraBaixo();
                        if(mapa[fantasma4.posicaoX][fantasma4.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "♥";
                    }
                    break;
                    
                // MOVENDO PARA ESQUERDA
                case 2:
                    if(fantasma4.posicaoY > 0)
                    {
                        mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "·";
                        fantasma4.movePraEsquerda();
                        if(mapa[fantasma4.posicaoX][fantasma4.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "♥";
                    }
                    break;
                
                // MOVENDO PARA DIREITA
                case 3:
                    if(fantasma4.posicaoY < 29)
                    {
                        mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "·";
                        fantasma4.movePraDireita();
                        if(mapa[fantasma4.posicaoX][fantasma4.posicaoY] == "©")
                        {   
                            ((PacMan) pacman).perdeVida();
                            Thread.sleep(2500);
                        }
                        else
                            mapa[fantasma4.posicaoX][fantasma4.posicaoY] = "♥";
                    }
                    break;        
            }
            
            // MOSTRANDO A PONTUACAO E O TOTAL DE VIDAS
            if(((PacMan) pacman).getVidas() > 0)
            {
                System.out.println("Pontuação: " + ((PacMan) pacman).getPontuacao() + "  Vidas: " + ((PacMan) pacman).getVidas());
            }
            else
            {
                System.out.println("GAME OVER!");
                System.out.println("Pontuação Maxima: " + ((PacMan) pacman).getPontuacao() + "  Vidas: " + ((PacMan) pacman).getVidas());
            }
            
            // PAUSANDO O JOGO PARA MELHOR VISUALIZAÇÃO
            for (double i = 0; i < 99999999; i++) {
                
            }
            
            if(((PacMan) pacman).getVidas() > 0)
            {
                // DANDO ESPAÇO
                for (int i = 0; i < 400; i++) {
                    System.out.print("\r\n");
                }
            }
               
        }
    }
}
