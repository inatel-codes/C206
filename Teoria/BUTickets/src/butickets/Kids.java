package butickets;

public class Kids extends VIP{
    // ATRIBUTOS
    private String docResponsavel;
    
    // METODO SOBRESCRITO
    @Override
    public float calculaTotalIngresso()
    {
        return super.calculaTotalIngresso() / 2; // DIVIDINDO O TOTAL DO INGRESSO DA CLASSE MAE POR 2
    }
    
    // METODO SOBRESCRITO
    @Override
    public void mostraInfos()
    {
        super.mostraInfos(); // CHAMANDO METODO DA CLASSE MAE
        System.out.println("Responsavel: " + docResponsavel);
    }
    
    // METODO SETTER
    public void setDocResponsavel(String docResponsavel) 
    {
        this.docResponsavel = docResponsavel;
    }
}
