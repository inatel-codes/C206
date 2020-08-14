package javazoo;

public class Peixe extends Animal{
    private int nBarbatanas;
    
    public void fazBarulho()
    {
        System.out.println("O peixe está fazendo barulho!");
    }

    public int getnBarbatanas() {
        return nBarbatanas;
    }

    public void setnBarbatanas(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }
    
    
}
