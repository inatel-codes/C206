package aula8_exercicio1;

public class PessoaJuridica extends Conta{
    private String cnpj;
    private String nome;
    private float saldo;
    private float limiteFinanciamento;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimiteFinanciamento() {
        return limiteFinanciamento;
    }

    public void setLimiteFinanciamento(float limiteFinanciamento) {
        this.limiteFinanciamento = limiteFinanciamento;
    }
}
