package aula6_exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Aula6_exercicio1 {

    public static void main(String[] args) {
        int[] arrayInt = {10, 1, 9, 5, 2, 4, 3}; // CRIANDO ARRAY E JA DEFININDO SEUS VALORES 
        
        // MOSTRANDO ARRAY NAO ORDENADO
        System.out.print("Array não ordenado: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println("");

        int op;
        // ESCOLHENDO A OPCAO DE ORDENAR EM ORDEM CRESCENTE OU DECRESCENTE
        System.out.println("1 - Ordenar em ordem crescente;");
        System.out.println("2 - Ordenar em ordem decrescente.");
        Scanner teclado = new Scanner(System.in);
        op = teclado.nextInt();
        switch (op) {
            case 1:
                // ORDENA O ARRAY EM ORDEM CRESCENTE E MOSTRA ELE
                Arrays.sort(arrayInt);
                System.out.print("Array ordenado em ordem crescente: ");
                for (int i = 0; i < arrayInt.length; i++) {
                    System.out.print(arrayInt[i] + " ");
                }
                System.out.println("");
                break;
            case 2:
                // ORDENA O ARRAY EM ORDEM CRESCENTE E MOSTRA DE TRAS PARA FRENTE
                Arrays.sort(arrayInt);
                System.out.print("Array ordenado em ordem crescente: ");
                for (int i = arrayInt.length-1; i >= 0; i--) {
                    System.out.print(arrayInt[i] + " ");
                }
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

}
