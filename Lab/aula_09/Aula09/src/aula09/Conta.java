
package aula09;

// Classes abstratas não podem ser instanciadas !! Conta c = new Conta();

// A palavra implements diz que esta classe está usando todos os métodos da interface Validacao
public abstract class Conta implements Validacao{
    
    // Como a classe Conta é abstrata, ela não precisa reescrever os métodos da interface
    // Porém, suas classes filhas terão obrigratoriamente reescrever os métodos
    
    // Atributos
    public int id;
    public int agencia;
    public int senha;
    
    // Métodos
    
    // Métodos abstratos obrigatóriamente terão que ser reescritos (Override)
    // Pelas classes filhas, portanto só é necessário definir seu nome, retorno e modifcador de acesso.
    public abstract void mudarSenha(int novaSenha);
    
    //
   
}






















