
package aula09;

public class Aula09 {

    public static void main(String[] args) {
       
        // Polimorfismo
        Conta c1 = new PessoaFisica();
        Validacao v = new PessoaFisica();
        PessoaFisica pf = new PessoaFisica();
        
        // Classes abstratas -> Não podem ser instanciadas, geralmente usada junto com polimorfismo
        // Interfaces -> Não é uma classe, é onde declaramos métodos abstratos (obrigatoriamente devem ser reescritos)
    }
    
}
