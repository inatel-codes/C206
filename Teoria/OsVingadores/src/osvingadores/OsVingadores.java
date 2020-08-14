package osvingadores;

import java.util.Scanner;

public class OsVingadores {

    public static void main(String[] args) {
        
        // Criando a arma do vingador Homem de Ferro
        Arma arm1 = new Arma();
        arm1.nome = "Mark 42";
        arm1.poder = 100;
        arm1.resistencia = 50;
        arm1.descricao = "Armadura homem de ferro";
        
        // Criando o vingador Homem de Ferro
        Vingador v1 = new Vingador();
        v1.nome = "Tony Stark";
        v1.pontosDeVida = 95;
        v1.armaVingador = arm1;
        
        int sair = 0; // Variavel auxiliar para sair do programa
        
        while(sair != 1)
        {
            int op;
            
            // Menu de opcoes para usar no programa
            Scanner teclado = new Scanner(System.in); // Declarando a Classe Scanner
            System.out.println(" ");
            System.out.println("0 - Sair do programa;");
            System.out.println("1 - Dar dano no vingador;");
            System.out.println("2 - Fazer o vingador usar sua arma;");
            System.out.println("3 - Mostrar todas as inforações da arma.");
            System.out.print("Opção: ");
            
            op = teclado.nextInt(); // Opção de entrada
        
            switch (op) {
                case 0:
                    sair = 1;
                    break;
                    
                case 1:
                    v1.tomaDano();
                    break;

                case 2:
                    v1.usaArma();
                    break;
                case 3:
                    arm1.mostraInfosArma();
                    break;
                default:
                    System.out.println("Entrada Invalida!");
            }
        }
      
        
        
        
        
        
        
        
        
        
    }
    
}
