package promocaopizzahut;

public abstract class Unidade {
    // ATRIBUTOS
    protected String endereco;
    protected String nomeResponsavel;
    
    public Pizza [] vende = new Pizza[3]; // ARRAY DE PIZZAS
    
    // METODOS
    public void mostraPizzas()
    {
        for (int i = 0; i < vende.length; i++) {
            if(vende[i] != null)
            {
                vende[i].mostraIngredientes();
                System.out.println("Preço: R$" + vende[i].preco);
                String brinde = vende[i].mostraBrinde();
                System.out.println("Brinde: " + brinde);
                System.out.println("*************************");
            }
        }
    }
    
}
