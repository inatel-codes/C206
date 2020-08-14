package aula6_exercicio3;

public class Fornecedores {
    String cnpj;
    String endereco;
    Contatos [] contato;
    
    public void mostraInfo()
    {
        System.out.println("FORNECEDOR: ");
        System.out.println("CNPJ: "+ cnpj);
        System.out.println("Endereco: " + endereco);
        
        for (int i = 0; i < contato.length; i++) {
            if(contato[i] != null)
            {
                System.out.println("CONTATO " + i);
                System.out.println("Nome: " + contato[i].nome);
                System.out.println("Email: " + contato[i].email);
                System.out.println("Telefone: " + contato[i].telefone);
                System.out.println("Data de Nascimento: " + contato[i].dataNascimento);
                System.out.println("**************************");
            }
            
        }
    }
}
