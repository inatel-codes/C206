package aula6_exercicio3;

public class Aula6_exercicio3 {

    public static void main(String[] args) {
        Contatos contato1 = new Contatos();
        contato1.nome = "João";
        contato1.email = "joao@email.com";
        contato1.telefone = "(35)98456-7685";
        contato1.dataNascimento = "11/09/1999";
        
        Contatos contato2 = new Contatos();
        contato2.nome = "Douglas";
        contato2.email = "douglas@email.com";
        contato2.telefone = "(35)98467-7643";
        contato2.dataNascimento = "01/01/1998";
        
        Contatos contato3 = new Contatos();
        contato3.nome = "Michel";
        contato3.email = "michel@email.com";
        contato3.telefone = "(35)98445-7482";
        contato3.dataNascimento = "29/10/1999";
        
        Fornecedores fornecedor1 = new Fornecedores();
        fornecedor1.cnpj = "12345678910";
        fornecedor1.endereco = "Avenida João de Camargo, 120";
        
        Contatos [] contatos = new Contatos[5];
        fornecedor1.contato = contatos;
       
        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;
        
        fornecedor1.mostraInfo();
               
    }
    
}
