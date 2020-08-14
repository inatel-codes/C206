package exercicio3_aula05;

public class Exercicio3_Aula05 {

    public static void main(String[] args) {
        // Criando carro c1
        Carro c1 = new Carro();
        // Criando carro c2
        Carro c2 = new Carro();
        
        c1.cor = "Prata";
        c1.marca = "Fiat";
        c1.modelo = "Uno com escada";
        c1.velMax = 300;
        c1.velAtual = 0;
        c1.motor.potencia = 150;
        c1.motor.tipo = "v8";
        
        c1.mostraInfo();
        c1.ligar();
        c1.acelerar(60);
        c1.desligar();
    }
}
