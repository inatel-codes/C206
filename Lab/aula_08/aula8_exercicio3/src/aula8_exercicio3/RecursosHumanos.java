package aula8_exercicio3;

public class RecursosHumanos extends Comum{
    Comum [] funcionarios;

    public RecursosHumanos() {
        funcionarios = new Comum[100];
    }
    
    
    public void VisualizarFuncionarios()
    {
        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null)
            {
                System.out.println("Nome: " + funcionarios[i].nome);
                System.out.println("CPF: " + funcionarios[i].cpf);
                System.out.println("Matricula " + funcionarios[i].matricula); 
                System.out.println("Salario" + funcionarios[i].salario);
                System.out.println("************************");
            }
            
        }
    }
}
