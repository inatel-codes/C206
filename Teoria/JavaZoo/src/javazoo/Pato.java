package javazoo;

public class Pato extends Animal{
    private float tamanhoBico;
    
    public void fazBarulho()
    {
        System.out.println("O pato está fazendo barulho!");
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
    
    
}
