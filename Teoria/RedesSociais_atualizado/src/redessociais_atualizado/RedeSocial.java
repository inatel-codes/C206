package redessociais_atualizado;

public abstract class RedeSocial{
    protected String senha;
    protected int numAmigos;
    
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void curtirPublicacao();

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
