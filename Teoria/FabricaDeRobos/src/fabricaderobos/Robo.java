package fabricaderobos;

public class Robo {
    // ATRIBUTOS
    private static long serialNumberGenerator = 0;
    private long serialNumber;
    Processador processador;
    Corpo corpo;
    
    // CONSTRUTOR
    public Robo(boolean temProcessador)
    {
        // ROBO PODE OU NAO TER PROCESSADOR
        if(temProcessador)
            processador = new Processador();
        
        // ROBO TEM UM CORPO
        corpo = new Corpo();
        
        // INCREMENTANDO O serialNumberGenerator
        serialNumberGenerator++;
        serialNumber = serialNumberGenerator;
    }
    
    // METODOS
    public void mostraConfigRobo()
    {
        System.out.println("INFORMAÇÕES DO ROBO: ");
        System.out.println("Numero de serial: " + serialNumber);
        if(processador != null)
        {
            System.out.println("Processador " + processador.getMarca() + " (" + processador.getFrequenciaProcessamento() + " Mhz)");
        }
        
        System.out.println("Corpo " + corpo.getTipo() + " " + corpo.getCor());
        System.out.println("***************************************");
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Corpo getCorpo() {
        return corpo;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }
    
    
}

