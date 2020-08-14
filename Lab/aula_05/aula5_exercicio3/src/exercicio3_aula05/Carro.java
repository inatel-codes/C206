
package exercicio3_aula05;

public class Carro {
    // Atributos do carro
    String cor;
    String marca;
    String modelo;
    double velMax;
    double velAtual;
    Motor motor = new Motor(); // Classe Motor
    
    public void ligar()
    {
        System.out.println("Ligando o carro ");
    }
    
    public void acelerar(double velocidade)
    {
        velAtual = velAtual + velocidade;
        System.out.println("O carro acelerou, velocidade Atual: " + velAtual + " km/h");
    }
    
    public void desligar()
    {
        System.out.println("Desligando o carro");
    }
    
    public void mostraInfo()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Maxima: " + velMax + " km/h");
        System.out.println("Velocidade Atual: " + velAtual + " km/h");
    }
}
