package butickets;

public class VIP extends Ingresso{
    // ATRIBUTOS
    protected String tamanhoAbada;
    
    // METODO SOBRESCRITO
    @Override
    public void mostraInfos()
    {
        super.mostraInfos(); // CHAMANDO METODO DA CLASSE MAE
        System.out.println("Tamanho do Abada: " + tamanhoAbada);
    }
    
    // METODO SETTER
    public void setTamanhoAbada(String tamanhoAbada) {
        this.tamanhoAbada = tamanhoAbada;
    }
}
