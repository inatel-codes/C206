package aula5_exercicio4;

public class CadastroPropaganda {
    int id;
    String nomeProjeto;
    String tituloCampanha;
    float custo;
    Empresa autor;
    
    public void mostrarInformacoes()
    {
        System.out.println("INFORMACOES DA PROPAGANDA " + tituloCampanha.toUpperCase());
        System.out.println("Nome do Projeto: " + nomeProjeto);
        System.out.println("Titulo da campanha: " + tituloCampanha);
        System.out.println("Custo: " + custo);
        System.out.println("Autor da campanha: " + autor.nome);
    }
}
