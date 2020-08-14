package aula08;

/**
 *
 * @author Samuel
 */
public class Funcionario extends Pessoa {
    // Classe filha pois extende de Pessoa
    
    public int registro;
    public String sexo;
    
    public void mostraInfo(){
        // Super - referência a classe mãe
        // This - referência a classe atual
        
        System.out.println("Nome: " + super.getNome());
        System.out.println("Registro: " + this.registro);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Salario: " + super.salario);
    }
    
    public void mostraInfo( String nome ){
        
    }
}














