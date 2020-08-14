package temalivre;

/**
 *
 * @author Vanessa Swerts
 * @since 17/06/2019
 * 
 */
public class Tecnico {
    
    //Atributos
    private String nome;
    private String idade;
    /**
     * Método para lista as informações do técnico
     *  @author Vanessa 
     *  @since 17/06/2019
     */
    public void mostraInfosTecnico()
    {
        System.out.println("***********");
        System.out.println("Nome tecnico: " + nome);
        System.out.println("Idade tecnico: " + idade);
        
    }
           
    //Getter e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
    
}
