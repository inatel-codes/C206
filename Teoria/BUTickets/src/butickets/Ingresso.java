package butickets;

import java.util.Date;

public class Ingresso {
    // ATRIBUTOS
    private static long numberGenerator = 0;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao = 5;
    protected Date dataHoraCompra;
    
    // CONSTRUTOR
    public Ingresso() {
        // GERANDO UM NUMERO DE INGRESSO AUTOMATICO
        numberGenerator++;
        numero = numberGenerator;
        dataHoraCompra = new Date();
    }
    
    // METODOS
    public float calculaTotalIngresso()
    {
        return valorIngresso + taxaCartao;
    }
    
    public void mostraInfos()
    {
        System.out.println("Numero do ingresso: " + numero);
        System.out.println("Valor do ingresso: " + valorIngresso);
        System.out.println("Data da compra: " + dataHoraCompra);
    }
}
