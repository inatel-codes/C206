package aula_06;

public class Caneta {
    // Atributos
    String cor;
    boolean tampa;
    String marca;
    int carga;
    
    // Metodos
    public void rabiscar(){
        System.out.println("Rabiscando...");
    }
    
    public void escrever(){
        System.out.println("Escrevendo...");
    }
    
    public void mostraInfo(){
        System.out.println("Carga: " + this.carga);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampa? " + this.tampa);
        System.out.println("Marca: " + this.marca);
    }
    
}
