package meuprograma;

public class MeuPrograma {
    
    public static void main(String[] args) {
        // Criando uma primeira pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.rg = "12345678910";
        
        // Criando uma primeira conta para associar com a primeira pessoa
        Conta c1 = new Conta();
        c1.agencia = "0872-9";
        c1.numero = 887878;
        c1.cliente = p1; // Associando a pessoa com a conta
    }
    
}
