package javazoo;

public class Coruja extends Animal{
    private int alturaVoo;
    
    public void fazBarulho()
    {
        System.out.println("A coruja está fazendo barulho!");
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }
    
    
}
