package osvingadores;

public class Vingador {
    String nome;
    int pontosDeVida;
    Arma armaVingador;
    
    // Metodo que faz um vingador usar sua arma
    public void usaArma(){
        if(pontosDeVida > 0)
        {
            if(armaVingador.resistencia > 0)
            {
                armaVingador.resistencia = armaVingador.resistencia - 2;
                System.out.println("O Vingador usou sua arma, ela agora possui uma resistencia igual a " + armaVingador.resistencia);
                System.out.println("A arma do vingador aguenta mais " + armaVingador.resistencia/2 + " rodadas");  
            }
            
            else
                System.out.println("O vingador nao pode mais usar sua arma!");
            
        }
        
        else
            System.out.println("O Vingador está morto, ele nao pode usar sua espada!");
        
     
    }
    
    // Metodo que faz um vingador tomar dano
    public void tomaDano(){
        pontosDeVida = pontosDeVida - 5;
        
        if(pontosDeVida > 0)
        {
            System.out.println("O Vingador tomou dano, seu total de vida agora é: " + pontosDeVida);
            System.out.println("O vingador aguenta mais " + pontosDeVida/5 + " rodadas");
        }
        else
            System.out.println("O Vingador morreu");
         
    }
}
