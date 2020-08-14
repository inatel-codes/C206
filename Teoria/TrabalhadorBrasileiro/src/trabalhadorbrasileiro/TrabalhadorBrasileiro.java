package trabalhadorbrasileiro;

public class TrabalhadorBrasileiro {

    public static void main(String[] args) {
        // Variavel para armazenar o ganho anual
        float ganhoAnual;
        
        // Alocando espaço na memoria para novos objetos
        Trabalhador trabalhador1 = new Trabalhador();
        Trabalhador trabalhador2 = new Trabalhador();
        
        // Criando primeiro objeto (Alexander)
        trabalhador1.nome = "Alexander";
        trabalhador1.profissao = "Desenvolvedor";
        trabalhador1.salario = 10000;
        trabalhador1.rg = "MG-1983283";
        trabalhador1.dataNascimento = "11/01/1999";
        
        // Criando segundo objeto (Vanessa)
        trabalhador2.nome = "Vanessa";
        trabalhador2.profissao = "MC Donald's";
        trabalhador2.salario = 2500;
        trabalhador2.rg = "MG-1230494";
        trabalhador2.dataNascimento = "02/10/1996";
        
        // Mostrando informacao do primeiro trabalhador
        System.out.println("Informações do trabalhador " + trabalhador1.nome);
        trabalhador1.mostraInfosFuncionario();
        
        // Mostrando o ganho anual do trabalhador 1
        ganhoAnual = trabalhador1.calculaGanhoAnual();
        System.out.println("Ganho Anual: " + ganhoAnual);
        
        // Mostrando informacao do segundo trabalhador
        System.out.println("\n" + "Informações do trabalhador " + trabalhador2.nome + "\n");
        trabalhador2.mostraInfosFuncionario();
        
        // Mostrando ganho anual do trabalhador 2
        ganhoAnual = trabalhador2.calculaGanhoAnual();
        System.out.println("Ganho Anual: " + ganhoAnual); 
       
        trabalhador2.recebeAumento(1); // trabalhadro 2 recebeu aumento
        
        
    }
    
}
