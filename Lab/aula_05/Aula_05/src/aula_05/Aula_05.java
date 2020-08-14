package aula_05;

public class Aula_05 {

    public static void main(String[] args) {
        
        /*
        // Alocando espaço na memoria para o objeto f1
        Funcionario f1 = new Funcionario();
        // Alocando espaço na memoria para o objeto f2
        Funcionario f2 = new Funcionario();
        
        // Atribuindo valores para o obejeto f1
        f1.cpf = "111.111.111-11";
        f1.nome = "Alex";
        f1.salario = 8500f;
        
        // Atribuindo valores para o objeto f2
        f2.cpf = "222.222.222-22";
        f2.nome = "Alysson";
        f2.salario = 5450f;
        
        // Mostrando informações funcionario f2
        System.out.println(f2.nome); // nome do objeto f1
        System.out.println(f2.cpf);
        System.out.println(f2.salario);
        
        f2.tiraFerias(); // chamando metodo tiraFerias para o objeto f2
        
        f1.consulta(f2); // Passando por referencia
        
        // Mostrando as informações trocadas do funcionario f2
        System.out.println(f2.nome); // nome do objeto f1
        System.out.println(f2.cpf);
        System.out.println(f2.salario);
        */
        
        // Criando e instanciando um objeto caneta
        Caneta minhaCaneta = new Caneta();
        
        minhaCaneta.marca = "BIC";
        minhaCaneta.carga = 90;
        minhaCaneta.cor = "Azul";
        minhaCaneta.espessuraDaPonta = 0.7f;
        minhaCaneta.tampa = true;
        
        minhaCaneta.mostraInfo();
        
        minhaCaneta.rabiscar();
        minhaCaneta.rabiscar();
        
        minhaCaneta.mostraInfo();
        
        Funcionario f = new Funcionario();
        f.minhaCanetaFuncionario.carga = 100;
  
        f.minhaCanetaFuncionario.mostraInfo();
    }
    
}
