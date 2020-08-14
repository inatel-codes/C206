package poo_introducao;

public class POO_Introducao {

    public static void main(String[] args) {
       
        // NOVO OBJETO (NEW)
        Carro carro1 = new Carro(); // CRIANDO OBJETO CARRO 1
        carro1.chassi = "1234-5";
        carro1.ano = 2000;
        carro1.modelo = "Fiat Uno";
        
        // NOVO OBJETO (NEW)
        Carro carro2 = new Carro(); // CRIANDO OBJETO CARRO 2
        carro2.chassi = "6789-0";
        carro2.ano = 2019;
        carro2.modelo = "New Beatle";
        
        System.out.println("Carro 1: " + 
                carro1.modelo);
        carro1.acelerar();
        
        System.out.println("Carro 2: " + 
                carro2.modelo);
        carro2.acelerar();
    }
    
}
