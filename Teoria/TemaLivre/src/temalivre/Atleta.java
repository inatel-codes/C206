package temalivre;

/**
 * 
 * @author Vanessa Swerts
 * @since 17/06/2019
 * @version 1.0
 * 
 */
public class Atleta {
    
    //Atributos
    private String nome;
    private String posicao;
    private int idade;

    /**
     *  Método responsável por listar as informações do atleta
     * @author Vanessa Swerts 
     * @since 17/06/2019
     */
    public void listaAtleta()
    {
        System.out.println("***********");
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Idade: " + idade);
                
    }
       
    
    /**
     * 
     * @author Vanessa Swerts
     * @since 17/06/2019
     */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
