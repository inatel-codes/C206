package aula9_exercicio2;

public class Fogao extends Mercadoria{
    private int quantBocas;
    private String tipoAcendimento;
    private String tipoGas;

    public int getQuantBocas() {
        return quantBocas;
    }

    public void setQuantBocas(int quantBocas) {
        this.quantBocas = quantBocas;
    }

    public String getTipoAcendimento() {
        return tipoAcendimento;
    }

    public void setTipoAcendimento(String tipoAcendimento) {
        this.tipoAcendimento = tipoAcendimento;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }
    
    @Override
    public void cadastrar() {
        System.out.println("Fogao cadastrado!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("FOGAO: ");
        System.out.println("Codigo: " + codigo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade de bocas: " + quantBocas);
        System.out.println("Tipo de acendimento: " + tipoAcendimento);
        System.out.println("Tipo de gas: " + tipoGas);
    }
}
