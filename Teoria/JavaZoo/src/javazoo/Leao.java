package javazoo;

public class Leao extends Animal{
    private float tamanhoJuba;
    
    public void fazBarulho()
    {
        System.out.println("O leão está fazendo barulho!");
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
    
    
}
