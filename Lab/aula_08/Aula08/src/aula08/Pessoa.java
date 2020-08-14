package aula08;

/**
 *
 * @author Samuel
 */
public class Pessoa {
    // Classe mãe
    
    // Atributos da classe mãe
    // Todos os atributos e métodos são herdados para as classes filhas
    
    // Private não temos acesso direto nas classes filhas
    private String nome;
    private int cpf;
    private int idade;
    
    // Protected nós temos acesso direto a esta variável ou método
    protected int salario;
    
    // Métodos a serem herdados
    protected void fazerNiver(){
        System.out.println(" Parabens !");
    }
    
    protected int recebeAumento(){
        System.out.println("Metodo da mãe");
        return salario + 500;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}















