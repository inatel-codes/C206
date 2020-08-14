package pacmaininterface;

public class PacMan extends Personagem{
    
    // ATRIBUTOS
    private int pontuacao;
    private int vidas;
    
    // METODOS
    public void perdeVida(){
        System.out.println("O PacMan perdeu vida!");
        vidas--;
    }
    
    public void ganhaPonto(){
        //System.out.println("O PacMan ganhou ponto!");
        pontuacao++;
    }
    
    // METODOS GET AND SETTER
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
