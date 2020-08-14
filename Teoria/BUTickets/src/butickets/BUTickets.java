package butickets;

public class BUTickets {

    public static void main(String[] args) {
        Camarote c1 = new Camarote();
        c1.valorIngresso = 1000;
        c1.setTamanhoCamiseta("GG");
        
        Camarote c2 = new Camarote();
        c2.valorIngresso = 1000;
        c2.setTamanhoCamiseta("P");
        
        VIP v1 = new VIP();
        v1.valorIngresso = 700;
        v1.tamanhoAbada = "M";
        
        Kids k1 = new Kids();
        k1.valorIngresso = 300;
        k1.tamanhoAbada = "PP";
        k1.setDocResponsavel("MG784954");
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addIngresso(c1);
        carrinho.addIngresso(c2);
        carrinho.addIngresso(v1);
        carrinho.addIngresso(k1);
        
        carrinho.mostraDetalhesCompra();
    }
    
}
