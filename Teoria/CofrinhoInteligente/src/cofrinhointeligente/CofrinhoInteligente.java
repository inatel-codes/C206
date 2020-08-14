package cofrinhointeligente;

public class CofrinhoInteligente {

    public static void main(String[] args) {
        Moeda m1 = new Moeda(0.10f);
        Moeda m2 = new Moeda(0.10f);
        Moeda m3 = new Moeda(0.50f);
        Moeda m4 = new Moeda(0.25f);
        Moeda m5 = new Moeda(1);
        Moeda m6 = new Moeda(1);
        Moeda m7 = new Moeda(1);
        
        Cofrinho c = new Cofrinho();
        
        c.addMoeda(m1);
        c.addMoeda(m2);
        c.addMoeda(m3);
        c.addMoeda(m4);
        c.addMoeda(m5);
        c.addMoeda(m6);
        c.addMoeda(m7);
        
        System.out.println("A. Valor total: " + c.getValorTotal());
        System.out.println("B. Quantidade de moedas: " + c.getQuantMoedas());
        System.out.println("C. Moeda de maior valor: " + c.getMoedaMaiorValor().getValor());
        System.out.println("D. Moedas ordenadas: ");
        c.ordenaMoedas();
        c.mostraMoedas();
    }
    
}
