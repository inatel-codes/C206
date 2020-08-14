package temalivre;

/**
 *
 * @author Vanessa Swerts
 * @since 17/06/2019
 */
public class TemaLivre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Atleta a1 = new Atleta();
        Atleta a2 = new Atleta();
        Atleta a3 = new Atleta();
        
        a1.setNome("Marta");
        a1.setIdade(30);
        a1.setPosicao("Meia");
        
        a2.setNome("Cris");
        a2.setIdade(28);
        a2.setPosicao("Atacante");
        
        a3.setNome("Formiga");
        a3.setIdade(35);
        a3.setPosicao("Volante");
        
        Time team = new Time();
        team.setNome("Brasil");
        team.t1.setNome("Emilly");
        team.t1.setIdade("40");
        team.addAtleta(a1);
        team.addAtleta(a2);
        team.addAtleta(a3);
        
        team.mostraInfosTime();
        
        a1.listaAtleta();
        
        
        
        
        
        
        
        
        
        

    }
    
}
