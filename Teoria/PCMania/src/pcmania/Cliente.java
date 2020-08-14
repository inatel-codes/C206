package pcmania;

public class Cliente {
    // ATRIBUTOS (SIMPLES)
    public String nome;
    public long cpf;
    
    // ATRIBUTOS (ASSOCIAÇÃO)
    Computador [] computadorCliente; // AGREGAÇÃO
    
    // METODOS
    public float calculaTotalCompra()
    {
        float total = 0;
        
        // Somando todos os preços dos computadores que o cliente comprou
        for (int i = 0; i < computadorCliente.length; i++) {
            if(computadorCliente[i] != null)
                total = total + computadorCliente[i].preco;    
        }
        
        return total;
    }
    
}
