package aula6_exercicio2;

public class Produtos {

    String nome;
    String descricao;
    String fabricante;
    float preco;
    
    public void mostraProdutos()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Preço: " + this.preco);
    }
}
