package fabricaderobos;

public class FabricaDeRobos {

    public static void main(String[] args) {
        Robo [] robots = new Robo[100];
        
        // CRIANDO UM NOVO ROBO
        Robo robo1 = new Robo(true);
        robo1.corpo.setCor("Laranja");
        robo1.corpo.setTipo("Bolinha");
        robo1.processador.setMarca("Intel");
        robo1.processador.setFrequenciaProcessamento(750);
        
        // CRIANDO UM NOVO ROBO
        Robo robo2 = new Robo(false);
        robo2.corpo.setCor("Branco e Laranja");
        robo2.corpo.setTipo("Esteira");
        
        robots[0] = robo1;
        robots[1] = robo2;
        
        Lote lote1 = new Lote();
        lote1.setRobo(robots);
        
        lote1.mostraRobosLote();
    }
    
}
