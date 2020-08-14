package aula08;

/**
 *
 * @author Samuel
 */
public class Gerente extends Pessoa{
    // Classe filha pois extende de Pessoa

    
    // Atributos que somente esta classe terá, além dos atributos já herdados da classe Pessoa
    public int salarioExtra;
    
    // *** Sobrescrita de métodos *** 
    // Usamos a notação @Override
    @Override
    protected int recebeAumento(){
        // Podemos reescrever o método do zero, refazendo todo o código do método
        /*
        int x = super.salario + 500 + 300;
        System.out.println(" Reescrevendo o método ");
        return x;
        */
        
        // Ou podemos chamar o método já implementado dentro da classe mãe e poupar código
        return super.recebeAumento() + 300;

        // O atributo super faz referência a atributos/métodos da classe mãe
        // já o this faz referência a atributos/métodos da classe atual
        
        // Podemos usar o this para referenciar atributos da classe mãe dentro da classe filha
        // pois os atributos são herdados
        // exemplo: this.salario
        // exemplo: super.salario
    }
    
    
}
