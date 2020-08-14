package testastring;

public class TestaString {

    public static void main(String[] args) {
        // Exemplos de variaveis primitivas
        byte numero; // 8 bits
        short numero2; // 16 bits
        int numero3; // 32 bits
        long numero4; // 64 bits
        float numero5; // 32 bits
        double numero6; // 64 bits
        char letra; // 16 bits
        
        // Classe String (contem varios recursos que facilitam a vida do programador)
        String palavra = "Alexander";
        
        System.out.println(palavra.length());
        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.contains("A"));
        
        
    }
    
}
