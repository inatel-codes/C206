package mariokart;

public class Kart {
    
    // ATRIBUTOS
    String nome;
    Piloto piloto;
    Motor motor;  
    
    // CONSTRUTOR
    public Kart()
    {
        motor = new Motor();
    }
    
    // METODOS
    public void pular()
    {
        System.out.println("O Kart de " + piloto.nome + " está pulando");
    }
    
    public void soltarTurbo()
    {
        System.out.println("O Kart de " + piloto.nome + " está soltando turbo");
    }
    
    public void fazerDrift()
    {
        System.out.println("O Kart de " + piloto.nome + " está fazendo drift");
    }
}
