package aula5_exercicio2;

public class Cadastro {
    int codigoSerie;
    int codigoMaterial;
    String nomeMaterial;
    String categoriaMaterial;
    int quantidade;
    
    public void mostrarInformacoes()
    {
        System.out.println("INFORMACOES DO MATERIAL " + nomeMaterial.toUpperCase() + ": ");
        System.out.println("Codigo de Serie: " + codigoSerie);
        System.out.println("Codigo do Material: " + codigoMaterial);
        System.out.println("Nome do Material: " + nomeMaterial);
        System.out.println("Categoria do Material: " + categoriaMaterial);
        System.out.println("quantidade: " + quantidade);
    }
}
