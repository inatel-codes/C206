package trabalhadorbrasileiro;

public class Trabalhador {
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;
    
    public void recebeAumento(float valor) 
    {
        System.out.println("Salario atual: " + salario);
        System.out.println("Valor de aumento: " + valor);
        salario = salario + valor;
        System.out.println("Salario atualizado: " + salario);
    }
    
    public float calculaGanhoAnual()
    {
        return salario*12;
    }
    
    public void mostraInfosFuncionario()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
