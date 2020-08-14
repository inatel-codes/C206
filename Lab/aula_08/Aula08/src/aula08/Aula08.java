package aula08;

/**
 *
 * @author Samuel
 */
public class Aula08 {

    public static void main(String[] args) {
        // *** Herança ***
        /*
        Herança é quando uma classe vira mãe de outras classes, e suas filhas herdam
        seus atributos e métodos.
        Fazemos isso por meio da palavra extends
         */
        // Criando objetos filhos de Pessoa
        Pessoa p = new Pessoa();
        Gerente g = new Gerente();
        Funcionario f = new Funcionario();

        // Atribuindo alguns valores a atributos da classe mãe pela classe filha
        f.setNome("Samuel");
        g.salario = 100;

        // Invocando métodos
        int x = g.recebeAumento();
        int y = p.recebeAumento();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Instanciando um cliente (neto de Pessoa)
        Cliente ci = new Cliente();
        // Acessando atributos da classe Pessoa (vó)
        ci.getNome();
        ci.salario = 0;

        // *** Polimorfismo ***
        // Se Cliente, Funcionário e Gerente extendem de Pessoa, eles também podem ser Pessoas, certo?
        // Polimorfismo é uma maneira de referênciar um objeto de várias formas.
        Pessoa p1 = new Funcionario();
        Pessoa p2 = new Gerente();
        Pessoa p3 = new Cliente();

        // Porém não conseguimos acessar os atributos específicos de cada classe
        // Como por exemplo, não dá pra acessar o atributo registro da classe Funcionario, pois
        // ele está sendo referenciado como Pessoa e não como Funcionario.

//        p1.registro = 548;
        p1.salario = 50;

        // Para acessarmos este atributo é necessário criar uma variável auxiliar
        Funcionario func;
        // Fazemos o casting para que ela possa referenciar a Pessoa p1 como funcionário
        func = (Funcionario) p1;
        // E agora conseguimos alterar seus atributos de classe.
        func.registro = 222;
        func.sexo = "M";

        // -- Mas pra que tudo isso? --
        /*
        Uma das grandes vantagens é poder armazenar estes dados em um único Array.
        Criamos um Array de Pessoas e apartir dele iremos instanciar diferentes "tipos" de Pessoas
        */
        
        Pessoa[] minhasPessoas = new Pessoa[4];

        minhasPessoas[0] = new Gerente();
        minhasPessoas[1] = new Funcionario();
        minhasPessoas[2] = new Cliente();
        minhasPessoas[3] = new Funcionario();

        // Para ler uma pessoa como Gerente por exemplo:
        Gerente gAux = (Gerente) minhasPessoas[0];
        
        gAux.salarioExtra = 1000;
        minhasPessoas[0].salario = 300;
        gAux.setNome("Gerente 1");

        // Ler uma Pessoa como Funcionário
        Funcionario fAux = (Funcionario) minhasPessoas[1];
        
        fAux.registro = 777;
        fAux.sexo = "M";
        fAux.setNome("Funcionario 1");

        // -- Como recuperar então os atributos específicos de cada classe dentro do array? --
        /*
        Como nosso array é de Pessoas, devemos percorrer o array e perguntar se a posição é a classe desejada
        Fazemos isso através da palavra "instanceof", que basicamente significa "é um?"
        É recomendando usar o enhanced for (fore + TAB)
        */
        
        // Percorrendo o Array de Pessoas
        for (Pessoa minhasPessoa : minhasPessoas) {
            // Fazendo a comparação: esta posição do array é um Funcionário?
            if (minhasPessoa instanceof Funcionario) {
                // Se sim, cai dentro deste if e apartir daqui iremos tratar esta posição como Funcionário
                System.out.println("Dados do funcionario:");
                
                // Variável auxiliar
                Funcionario funcionarioAux;
                // Casting
                funcionarioAux = (Funcionario) minhasPessoa;
                // Tratamento de dados
                funcionarioAux.mostraInfo();
                funcionarioAux.registro = 548;
                funcionarioAux.sexo = "M";
                funcionarioAux.setNome("Samuel");
                funcionarioAux.setCpf(12548545);
                funcionarioAux.setIdade(21);
            }
        }
    }
}
