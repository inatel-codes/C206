package aula_06;

public class Aula_06 {

    public static void main(String[] args) {

        /*
        // Declarando array
        int[] meuArray;
        
        // Definindo tamanho da array
        meuArray = new int[5];
        
        meuArray[0] = 20;
        
        System.out.println(meuArray[0]);
       
        double [] ArrayDouble = new double[5];
        
        String[] arrayString = new String[10];
        arrayString[0] = "POO";
        
        System.out.println(arrayString[0]);
        
        // Matriz
        int[][] matriz = new int[5][5];
        
        String[][] matrizStr = new String[5][5];
        
        matriz[0][0] = 50;
        System.out.println(matriz[0][0]);
        
        int [][][] matriz3d = new int [5][5][5];
         */
        
        
        // ARRAY COM OBJETO
        /*
        Caneta[] arrayCanetas = new Caneta[3];

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        arrayCanetas[0] = c1;

        arrayCanetas[1] = new Caneta();
        arrayCanetas[1].cor = "Preto";

        System.out.println(arrayCanetas[0].cor);
        System.out.println(arrayCanetas[1].cor);
        */
        

        // ARRAY
        /*
        int[] valoresArray = {10, 20, 30};
        
        // fori
        for (int i = 0; i < valoresArray.length; i++) {
            System.out.println(valoresArray[i]);

        }
        
        // fore
        for (int i : valoresArray) {
            System.out.println(i);
            
        }
        
        String[] nome = {"POO", "LAB", "JAVA"};
        
        // fore com String
        for (String string : nome) {
            System.out.println(string);
        }
        */
        
        
        // MATRIZ
        /*
        int [][] mat = {{1}, {2}};
        
        System.out.println(mat[1][0]);
         */
        
        Caneta[] minhasCanetas = new Caneta[5];
        
        for (int i = 0; i < minhasCanetas.length; i++) {
            minhasCanetas[i] = new Caneta();
        }
        
        minhasCanetas[0].cor = "Azul";
        minhasCanetas[0].marca = "BIC";
        minhasCanetas[0].carga = 100;
        minhasCanetas[0].tampa = true;
        
        minhasCanetas[1].cor = "Preto";
        minhasCanetas[1].marca = "Compactor";
        minhasCanetas[1].carga = 80;
        minhasCanetas[1].tampa = true;
        
        minhasCanetas[2].cor = "Vermelho";
        minhasCanetas[2].marca = "BIC";
        minhasCanetas[2].carga = 20;
        minhasCanetas[2].tampa = false;
        
        /*
        for (Caneta minhasCaneta : minhasCanetas) {
            minhasCaneta.mostraInfo();
            System.out.println("******************************");
        }
        */
        
        for (int i = 0; i <= 2; i++) {
             minhasCanetas[i].mostraInfo();
             System.out.println("*******************");
            
        }
    }
}
