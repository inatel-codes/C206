package pokemonelementals;

import java.util.Scanner;

public class PokemonElementals {

    public static void main(String[] args) {
        
        String entrada;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Elemento: ");
        entrada = teclado.nextLine();
        
        entrada = entrada.toUpperCase();
        
        switch (entrada) {
            case "FOGO":
                System.out.println("Fraqueza: Água.");
                break;
            case "AGUA":
                System.out.println("Fraqueza: Eletricidade.");
                break;
            case "ELETRICIDADE":
                System.out.println("Fraqueza: Pedra.");
                break;
            case "PEDRA":
                System.out.println("Fraqueza: Gelo.");
                break;
            case "GELO":
                System.out.println("Fraqueza: Fogo.");
                break;
            case "PLANTA":
                System.out.println("Fraqueza: Fogo.");
                break;
            default:
                System.out.println("Elemento desconhecido! ");
        }         
    }
}
