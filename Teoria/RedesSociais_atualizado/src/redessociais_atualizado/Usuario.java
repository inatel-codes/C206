package redessociais_atualizado;

public class Usuario {
    private String nome;
    private String email;
    public RedeSocial [] usa = new RedeSocial[4];
    
    public Usuario() 
    {
    }
    
    public Usuario(RedeSocial [] redesSociais) 
    {
        usa = redesSociais;
    }

    public String getNome() {
        return nome;
    }

    public RedeSocial[] getUsa() {
        return usa;
    }

    public void setUsa(RedeSocial[] usa) {
        this.usa = usa;
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
