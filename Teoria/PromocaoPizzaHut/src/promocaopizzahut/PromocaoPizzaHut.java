package promocaopizzahut;

public class PromocaoPizzaHut {

    public static void main(String[] args) {
        Pizza brasileira = new Brasileira();
        brasileira.preco = 20;
        
        Pizza pepperoni = new Pepperoni();
        pepperoni.preco = 15;
        
        Pizza supreme = new Supreme();
        supreme.preco = 25;
        
        Unidade sp = new SP();
        sp.endereco = "Rua de Sao Paulo, 01";
        sp.nomeResponsavel = "João";
        sp.vende[0] = brasileira;
        sp.vende[1] = pepperoni;
        sp.vende[2] = supreme;
        
        Unidade bh = new BH();
        bh.endereco = "Rua de Belo Horizonte, 02";
        bh.nomeResponsavel = "José";
        bh.vende[0] = pepperoni;
        bh.vende[1] = supreme;
        
        Unidade rj = new RJ();
        rj.endereco = "Rua do Rio de Janeiro";
        rj.nomeResponsavel = "Joel";
        rj.vende[0] = brasileira;
        rj.vende[1] = pepperoni;
        
        sp.mostraPizzas();
        bh.mostraPizzas();
        rj.mostraPizzas();
    }

}
