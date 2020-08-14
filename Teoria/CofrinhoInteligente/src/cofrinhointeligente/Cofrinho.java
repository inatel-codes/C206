package cofrinhointeligente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {

    private List<Moeda> moedas = new ArrayList();

    public void addMoeda(Moeda m) {
        moedas.add(m);
    }

    public double getValorTotal() {
        double valorTotal = 0;

        for (int i = 0; i < moedas.size(); i++) {
            valorTotal = valorTotal + moedas.get(i).getValor();
        }

        return valorTotal;
    }

    public int getQuantMoedas() {
        return moedas.size();
    }

    public Moeda getMoedaMaiorValor() {
        return Collections.max(moedas);
    }

    public void ordenaMoedas() {
        Collections.sort(moedas);
    }

    public void mostraMoedas() {
        for (int i = 0; i < moedas.size(); i++) {
            System.out.print(moedas.get(i).getValor() + " ");
        }
    }

}
