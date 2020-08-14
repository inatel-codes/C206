package pcmania;

public class Computador {
    // ATRIBUTOS (SIMPLES)
    public String marca;
    public float preco;
    
    // ATRIBUTOS (AGREGAÇÃO)
    MemoriaUSB memoria;
    
    // ATRIBUTOS (COMPOSIÇÃO)
    SistemaOperacional sistema = new SistemaOperacional(); 
    HardwareBasico [] hardware = new HardwareBasico[3]; 

    // CONSTRUTOR
    public Computador() {
        for (int i = 0; i < hardware.length; i++) {
            hardware[i] = new HardwareBasico();
        }
    }
   
    // METODOS
    public void mostraPCConfigs()
    {
        System.out.println("\n" + "Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println(hardware[0].nome + " (" + hardware[0].capacidade + " Mhz)");
        System.out.println(hardware[1].capacidade + " Gb" + " de " + hardware[1].nome);
        System.out.println(hardware[2].capacidade + " de " + hardware[2].nome);
        System.out.println("Sistema Operacional " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade);
    }
    
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        memoria = musb;
    }
}
