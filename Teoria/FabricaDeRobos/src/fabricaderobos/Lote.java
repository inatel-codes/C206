package fabricaderobos;

import java.util.Date;

public class Lote {
    // ATRIBUTOS
    private static long lotNumberGenerator;
    private long lotNumber;
    private Date dataCriacao;
    private Robo [] robo;
    
    // CONSTRUTOR
    public Lote(){
        dataCriacao = new Date();
        lotNumberGenerator++;
        lotNumber = lotNumberGenerator;
    }
    
    // METODOS
    public void mostraRobosLote()
    {
        System.out.println("Serial do Lote: " + lotNumber);
        System.out.println("Data: " + dataCriacao);
        for (int i = 0; i < robo.length; i++) {
            if(robo[i] != null)
                robo[i].mostraConfigRobo();
        }
    }

    
    // METODO GET PARA MOSTRAR DADOS DESSA CLASSE EM OUTRAS CLASSES
    // METODO SET PARA SETAR DADOS NESSA CLASSE POR MEIO DE OUTRA CLASSE
    
    public Robo[] getRobo() {
        return robo;
    }

    public void setRobo(Robo[] robo) {
        this.robo = robo;
    }
    
    
}
