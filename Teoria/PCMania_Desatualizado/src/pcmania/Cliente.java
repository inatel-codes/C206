package pcmania;

public class Cliente {
     // ATRIBUTOS
    public String nome;
    public long cpf;
    Computador[] clientComprou;
    
    // METODOS
    public float calculaTotalCompra()
    {
        float total = 0;
        
        for (int i = 0; i < clientComprou.length; i++) 
        {
            if(clientComprou[i] != null)
                total = total + clientComprou[i].preco; 
        }
        
        return total;
    }
}
