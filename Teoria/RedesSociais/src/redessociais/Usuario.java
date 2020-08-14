package redessociais;

public class Usuario {
    // ATRIBUTOS
    private String nome;
    private String email;
    public RedeSocial [] usa;
    
    // CONSTRUTOR
    public Usuario() 
    {
        usa = new RedeSocial[4];
    }
    
    public Usuario(RedeSocial [] redesSociais) 
    {
        usa = redesSociais;
    }
    
    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
