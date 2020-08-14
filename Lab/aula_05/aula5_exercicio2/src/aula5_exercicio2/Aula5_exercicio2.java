package aula5_exercicio2;

public class Aula5_exercicio2 {

    public static void main(String[] args) {
        Cadastro mat1 = new Cadastro();
        mat1.codigoMaterial = 1;
        mat1.codigoSerie = 1234;
        mat1.nomeMaterial = "Faróis Traseiros";
        mat1.categoriaMaterial = "Sei la";
        mat1.quantidade = 250;
        
        mat1.mostrarInformacoes();
    }
    
}
