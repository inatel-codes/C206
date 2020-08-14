package osvingadores;

public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;
    
    // Metodo que mostra todos os atributos de uma arma
    public void mostraInfosArma(){
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descrição: " + descricao);
    }
}
