package horadodesespero;

import java.util.Scanner;

public class HoraDoDesespero {

    public static void main(String[] args) {
        
        float npa;
        float np3;
        
        // Classe scanner
        Scanner teclado = new Scanner(System.in);
        
        // Entrando com a NPA
        System.out.print("NPA: ");
        npa = teclado.nextFloat();
        
        // Se passou direto
        if(npa >= 60)
            System.out.println("Aprovado!");
        // Se reprovou
        else if(npa < 30)
            System.out.println("Reprovado!");
        // Se ficou de NP3
        else
        {
            System.out.println("Ficou de NP3 ");
            System.out.print("Nota da NP3: ");
            np3 = teclado.nextFloat();
            
            npa = (npa+np3)/2;
            
            if(npa >= 50)
                System.out.println("Aprovado na NP3!");
            else
                System.out.println("Reprovado de NP3!");   
        }  
    }
}
