package empresa;

public class Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Diretor();
        Funcionario f2 = new Gerente();
        
        /* Como Funcionario é uma classe abstrata ele nao pode ser instanciado 
        Funcionario f = new Funcionario(); 
        */
        
        f2.baterPonto();
    }
    
}
