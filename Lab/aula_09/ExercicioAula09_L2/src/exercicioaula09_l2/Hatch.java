package exercicioaula09_l2;

public class Hatch extends Carro{
    
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void cadastrar() {
        System.out.println("Hatch Cadastrado");
    }

    @Override
    public void mostraInfo() {
        System.out.println("HATCH ENCONTRADO: ");
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$" + valor);
        System.out.println("Portas: " + this.portas);
        System.out.println("*************************************");
    }
    
}
















