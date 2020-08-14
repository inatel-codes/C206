package butickets;

public class Camarote extends Ingresso{
    // ATRIBUTOS
    private String tamanhoCamiseta;

    // METODO SOBRESCRITO
    @Override
    public void mostraInfos()
    {
        super.mostraInfos(); // CHAMANDO METODO DA CLASSE MAE
        System.out.println("Camiseta: " + tamanhoCamiseta);        
    }
    
    // METODO SETTER
    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }
    
}
