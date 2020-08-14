package empresa;

// CLASSE ABSTRATA
public abstract class Funcionario {
    String nome;
    String pis;
    
    // METODO ABSTRATO (NAO PODE CONTER IMPLEMENTACOES) -> OBRIGA AS CLASSE FILHAS SOBRESCREVEREM ELE
    abstract void baterPonto();
    
}
