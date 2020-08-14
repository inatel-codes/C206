package javapets;

public class AnimalPet {
   
    // ATRIBUTOS
    String nome;
    String especie;
    String som;
    String comida;
    int idade;
    
    // METODOS
    public void comer()
    {
        System.out.println("O " + especie + " " + nome + " está comendo!");
    }
    
    public void dormir(int horas)
    {
        System.out.println("O " + especie + " " + nome + " está dormindo à " + horas + " horas");
    }
    
    public void movimentar(int metros)
    {
        System.out.println("O " + especie + " " + nome + " se movimentou " + metros + " metros");
    }
    
    public void fazerBarulho()
    {
        System.out.println(som);
    }
}
