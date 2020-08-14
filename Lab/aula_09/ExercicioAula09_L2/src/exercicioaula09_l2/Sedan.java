package exercicioaula09_l2;

public class Sedan extends Carro{
    
    private int portaMalas;

    public int getPortaMalas() {
        return portaMalas;
    }
    
    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    @Override
    public void cadastrar() {
        System.out.println("Sedan Cadastrado!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$" + valor);
        System.out.println("Porta Malas: " + this.portaMalas);
    }
    
}















