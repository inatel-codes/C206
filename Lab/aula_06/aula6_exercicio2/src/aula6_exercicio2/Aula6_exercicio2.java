package aula6_exercicio2;

public class Aula6_exercicio2 {

    public static void main(String[] args) {
        Produtos[] meusProdutos = new Produtos[5]; // CRIANDO ESPAÇO NA MEMORIA PARA UM ARRAY DE PRODUTOS
        
        // INSTANCIANDO O ARRAY DE PRODUTOS
        for (int i = 0; i < meusProdutos.length; i++) {
            meusProdutos[i] = new Produtos();
        }
        
        // PREENCHENDO O ARRAY DE PRODUTOS
        meusProdutos[0].nome = "Caixa de Leite";
        meusProdutos[0].descricao = "Uma caixa de leite contendo 30 caixinhas de leite de 1 Litro";
        meusProdutos[0].fabricante = "Cooper Rita";
        meusProdutos[0].preco = (float) 60.00;
        
        meusProdutos[1].nome = "Pão Francês";
        meusProdutos[1].descricao = "7 pães de sal";
        meusProdutos[1].fabricante = "Mundial Pães";
        meusProdutos[1].preco = (float) 5.50;
        
        meusProdutos[2].nome = "Suco de Uva";
        meusProdutos[2].descricao = "3 garrafas de suco de uva natural";
        meusProdutos[2].fabricante = "Pergola";
        meusProdutos[2].preco = (float) 29.90;
        
        // MOSTRANDO AS INFORMACOES DA COMPRA DOS PRODUTOS E O PRECO TOTAL
        float precoTotal = 0;
        for (int i = 0; i < meusProdutos.length; i++) {
            if(meusProdutos[i].nome != null)
            {
                meusProdutos[i].mostraProdutos();
                System.out.println("**********************");
                precoTotal = precoTotal + meusProdutos[i].preco;
            }
        }
        System.out.println("Preço total à pagar: " + precoTotal);
    }
    
}
