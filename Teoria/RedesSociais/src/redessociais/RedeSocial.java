package redessociais;

public abstract class RedeSocial{
    // ATRIBUTOS
    protected String senha;
    protected int numAmigos;
    
    // METODOS
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void curtirPublicacao();

    // GETTERS AND SETTERS
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigos() {
        return numAmigos;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }
    

            
}
