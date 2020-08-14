package aula9_exercicio2;

public class Geladeira extends Mercadoria{
    private int quantPortas;
    private int tamLitros;
    private boolean isInox;

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    public int getTamLitros() {
        return tamLitros;
    }

    public void setTamLitros(int tamLitros) {
        this.tamLitros = tamLitros;
    }

    public boolean isIsInox() {
        return isInox;
    }

    public void setIsInox(boolean isInox) {
        this.isInox = isInox;
    }
    
    @Override
    public void cadastrar() {
        
    }

    @Override
    public void mostraInfo() {
        System.out.println("GELADEIRA: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade de portas: " + quantPortas);
        System.out.println("Tamanho (em litros): " + tamLitros);
        System.out.println("É de inox? " + isInox);
    }
}
