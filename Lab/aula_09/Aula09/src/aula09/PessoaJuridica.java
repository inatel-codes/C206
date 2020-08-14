
package aula09;

public class PessoaJuridica extends Conta{

    
    @Override
    public void mostraInfo() {
    }

    @Override
    public void mudaNomeConta() {
    }

    @Override
    public void dataAcesso() {
    }

    @Override
    public void validaAcesso() {
    }

    @Override
    public void mudarSenha(int novaSenha) {
        // Podemos referenciar o atributo da classe mãe com o this
        this.senha = novaSenha;
        // Ou com o super
        super.senha = novaSenha;
    }
    
}













