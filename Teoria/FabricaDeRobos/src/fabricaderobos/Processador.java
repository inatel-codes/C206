package fabricaderobos;

public class Processador {
    // ATRIBUTOS
    private String marca;
    private float frequenciaProcessamento;

    // METODO GET PARA MOSTRAR DADOS DESSA CLASSE EM OUTRAS CLASSES
    // METODO SET PARA SETAR DADOS NESSA CLASSE POR MEIO DE OUTRA CLASSE
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getFrequenciaProcessamento() {
        return frequenciaProcessamento;
    }

    public void setFrequenciaProcessamento(float frequenciaProcessamento) {
        this.frequenciaProcessamento = frequenciaProcessamento;
    }
    
    
}
