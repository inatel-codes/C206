package aula6_desafio1;

import java.util.Arrays;

public class Aula6_desafio1 {

    public static void main(String[] args) {
        String[] arrayString = {"Samuel", "Alexander", "RenZo", "Aguinaldo"};
        
        // MOSTRANDO ARRAY DESORDENADO
        System.out.print("Array desordenado: ");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println("");

        Arrays.sort(arrayString); // ORDENADO ARRAY EM ORDEM CRESCENTE
        
        // MOSTRANDO ARRAY EM ORDEM CRESCENTE
        System.out.print("Array ordenado: ");
        for (String string : arrayString) {
            System.out.print(string + " ");
        }
        System.out.println(" ");
    }

}
