
package aula_05;

public class Funcionario {

    // Atributos
    
    String nome;
    float salario;
    String cpf;
    Caneta minhaCanetaFuncionario = new Caneta();
    
    // Construtor
    public Funcionario() 
    {
        System.out.println("Funcionario efetivado!");
    }
    
    // Metodos
    public void tiraFerias()
    {
        System.out.println("O funcionario " + nome + " está de ferias");
    }
    
    public void consulta(Funcionario f)
    {
        f.cpf = cpf;
        f.nome = nome;
        f.salario = salario;
    }
  
}
