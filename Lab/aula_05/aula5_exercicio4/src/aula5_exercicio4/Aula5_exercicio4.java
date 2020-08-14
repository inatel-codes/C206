package aula5_exercicio4;

public class Aula5_exercicio4 {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        empresa1.nome = "Inatel";
        empresa1.cnpj = "12345678910";
        empresa1.contato = "inatel@inatel.br";
        empresa1.telefone = "(35) 3456-7898";
        
        CadastroPropaganda propaganda1 = new CadastroPropaganda();
        propaganda1.id = 1;
        propaganda1.nomeProjeto = "Language of the future";
        propaganda1.tituloCampanha = "Language JAVA is the best";
        propaganda1.custo = 25;
        propaganda1.autor = empresa1;  
        
        propaganda1.mostrarInformacoes();
    }
    
}
