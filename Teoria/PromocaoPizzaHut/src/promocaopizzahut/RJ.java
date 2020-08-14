package promocaopizzahut;

public class RJ extends Unidade{
    @Override
    public void mostraPizzas()
    {
        System.out.println("Pizzas do Rio de Janeiro: " + "\n");
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
