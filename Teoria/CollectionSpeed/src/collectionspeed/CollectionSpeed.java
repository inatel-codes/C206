package collectionspeed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionSpeed {

    public static void main(String[] args) {
            
            // Criando diferente tipos de coleções 
            List<Integer> lista = new ArrayList<>();
            Set<Integer> conjunto = new HashSet<>();
            Map<Integer, Integer> mapa = new HashMap();
            
            long x = 9;
            
            List <String> c = new ArrayList<>();
            
            Scanner t = new Scanner(System.in);
            //t.nextBoolean();
            // Variavél para controle 
            int total = 100000; 
            
            //Variaveis que guardarão o tempo
            long tempInicio;
            long tempFinal; 
            //Variaveis que guardarão o tempo de cada teste
            long tiLista;
            long tiConjunto;
            long tiMapa;
            long tbLista;
            long tbConjunto;
            long tbMapa;
             
            // ****************** INSERINDO NÚMEROS ********************
            
            
            //A. Lista 
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números na lista 
            for (int i = 0; i < total; i++) 
            {
                lista.add(i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tiLista = tempFinal - tempInicio;
            
            //B. Conjunto
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números no conjunto 
            for (int i = 0; i < total; i++) 
            {
                conjunto.add(i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tiConjunto = tempFinal - tempInicio;
            
            //C. Mapa
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números no mapa 
            for (int i = 0; i < total; i++) 
            {
                mapa.put(i,i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tiMapa = tempFinal - tempInicio;
            
            // ***************** BUSCANDO ************
            
            //A. Lista 
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números na lista 
            for (int i = 0; i < total; i++) 
            {
                lista.contains(i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tbLista = tempFinal - tempInicio;
            
            //B. Conjunto
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números no conjunto 
            for (int i = 0; i < total; i++) 
            {
                conjunto.contains(i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tbConjunto = tempFinal - tempInicio;
            
            //C. Mapa
            
            // Pegando o tempo inicial
            tempInicio = System.currentTimeMillis();
            //Inserindo números no mapa 
            for (int i = 0; i < total; i++) 
            {
                mapa.containsKey(i);
                //mapa.containsValue(i);
            }
            
            // Pegando o tempo final 
            tempFinal =  System.currentTimeMillis();
            //Calculando a duração para inserir 200.000 número na lista 
            tbMapa = tempFinal - tempInicio;
            
            
            // ********* EXIBINDO RESULTADOS **********
            
            System.out.println("RESULTADOS: ");
            System.out.println("TEMPO INSERÇÃO: " 
                        + "\n" + "Lista: " + tiLista
                    + "\n" + "Conjunto: " + tiConjunto
                    + "\n" + "Mapa: " + tiMapa );
            System.out.println("****************");
            System.out.println("TEMPO BUSCA: " 
                        + "\n" + "Lista: " + tbLista
                    + "\n" + "Conjunto: " + tbConjunto
                    + "\n" + "Mapa: " + tbMapa );
            
            
    }
    
}
