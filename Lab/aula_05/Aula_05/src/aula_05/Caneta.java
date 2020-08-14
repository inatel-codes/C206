package aula_05;

public class Caneta {
    String cor;
    boolean tampa;
    String marca;
    int carga;
    float espessuraDaPonta;
    
    public void rabiscar()
    {
        System.out.println("Rabiscando...");
        carga = carga - 10;
    }
    
    public void colorir()
    {
        System.out.println("Colorindo...");
    }
    
    public void tampar()
    {
        if(tampa)
            System.out.println("Caneta tem tampa");
       
        else
            System.out.println("Caneta nao tem tampa");
    }
    
    public void destampar()
    {
        System.out.println("Caneta destampada");
    }
    
    void atirarBolinha()
    {
        System.out.println("Tiro!");
    }
    
    public void mostraInfo()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Espessura: " + espessuraDaPonta);
        System.out.println("Tem Tampa? " + tampa);
        System.out.println("Carga: " + carga);
    }
}
