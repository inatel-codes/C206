package aula8_exercicio1;

public class Aula8_exercicio1 {

    public static void main(String[] args) {
        // PESSOA FISICA
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf("111.111.111-11");
        pf.setNome("Alexander");
        pf.setSaldo(1000.00f);
        pf.agencia = 1234;
        pf.numIdentificao = 1;
        
        // PESSOA JURIDICA
        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("123454646");
        pj.setNome("RenZo");
        pj.setLimiteFinanciamento(5000);
        pj.agencia = 4321;
        pj.numIdentificao = 2;
        pj.setSaldo(9700.00f);
        
        System.out.println(pj.getNome());
        
    }

}
