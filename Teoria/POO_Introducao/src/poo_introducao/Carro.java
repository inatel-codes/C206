package poo_introducao;

public class Carro {
    // ATRIBUTOS (CARACTERISTICAS)
    String chassi;
    String modelo;
    int ano;
    
    // METODOS (AÇÕES)
    public void acelerar()
    {
        System.out.println("O carro " + modelo + " está andando!");
    }
    
    public void frear()
    {
        System.out.println("O carro " + modelo + " está freando!");
    }
    
    public void buzinar()
    {
        System.out.println("O carro " + modelo + " está buzinando!");
    }
}
