package pcmania;

public class Computador {
  // ATRIBUTOS
  public String marca;
  public float preco;
  MemoriaUSB memory;
  SistemaOperacional system = new SistemaOperacional();
  HardwareBasico[] hardware = new HardwareBasico[10];
  
  // METODOS
  public void mostraPCConfigs()
  {
      System.out.println("");
      System.out.println("PROMOÇÃO: ");
      System.out.println("Marca: " + marca);
      System.out.println("Preço: R$" + preco);
      System.out.println("Acompanha " + memory.nome + " de " + memory.capacidade);
      System.out.println("Sistema Operacional " + system.nome + " (" + system.tipo + ")");
      for (int i = 0; i < hardware.length; i++) 
      {
          if(hardware[i] != null)
          {
              System.out.println(hardware[i].nome + " (" + hardware[i].capacidade + ")");
          }  
      }
  }
  
  public void addMemoriaUSB(MemoriaUSB musb)
  {
      
  }
}
