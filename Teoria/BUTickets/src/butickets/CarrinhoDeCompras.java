package butickets;

public class CarrinhoDeCompras {
    // ATRIBUTOS
    private String loginCliente;
    private Ingresso [] arrayIngresso;

    // CONSTRUTOR
    public CarrinhoDeCompras() 
    {
        arrayIngresso = new Ingresso[10];
    }
    
    // METODO SETTER
    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }
    
    // METODO GET
    public Ingresso[] getIngresso() {
        return arrayIngresso;
    }
    
    // METODO SETTER
    public void setIngresso(Ingresso[] ingresso) {
        this.arrayIngresso = ingresso;
    }
    
    // METODOS
    public void addIngresso(Ingresso ing)
    {
        for (int i = 0; i < arrayIngresso.length; i++) {
            if(arrayIngresso[i] == null)
            {
                arrayIngresso[i] = ing;
                break;
            }
            
        }
    }
    
    public void mostraDetalhesCompra()
    {
        for (int i = 0; i < arrayIngresso.length; i++) {
            if(arrayIngresso[i] != null)
            {
                arrayIngresso[i].mostraInfos();
                System.out.println("***********************************************");
            }
            
        }
    }
}
