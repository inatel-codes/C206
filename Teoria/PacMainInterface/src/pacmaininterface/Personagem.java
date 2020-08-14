package pacmaininterface;

public abstract class Personagem implements Movel{
    // ATRIBUTOS
    protected String cor;
    protected int posicaoX;
    protected int posicaoY;

    // METODOS
    @Override
    public void movePraCima() {
        //System.out.println("O personagem moveu para cima!");
        posicaoX--;
    }

    @Override
    public void movePraBaixo() {
        //System.out.println("O personagem moveu para baixo!");
        posicaoX++;
    }

    @Override
    public void movePraDireita() {
        //System.out.println("O personagem moveu para direita!");
        posicaoY++;
    }

    @Override
    public void movePraEsquerda() {
        //System.out.println("O personagem moveu para a esquerda!");
        posicaoY--;
    }
}
