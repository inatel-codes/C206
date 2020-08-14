package aula8_exercicio3;

public class Aula8_exercicio3 {

    public static void main(String[] args) {
        Comum [] funcionarios = new Comum[100];
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.funcionarios = funcionarios;
        
        funcionarios[0] = new RecursosHumanos();
        funcionarios[1] = new RecursosHumanos();
        
        funcionarios[0].nome = "Miguel Angelo";
        funcionarios[0].cpf = "111.111.111-11";
        funcionarios[0].matricula = 4342;
        funcionarios[0].salario = 3500;
        
        funcionarios[1].nome = "Alfredo";
        funcionarios[1].cpf = "222.222.222-22";
        funcionarios[1].matricula = 4544;
        funcionarios[1].salario = 4345;
        
        Gestor gestor = new Gestor();
        gestor.nome = "Alex";
        gestor.cpf = "333.333.333-33";
        gestor.matricula = 1333;
        gestor.salario = 8500;
        gestor.gratificacaoAnual = 1400; 
                
    }

}
