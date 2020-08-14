/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula09_l2;

public class SUV extends Carro{
    
    private String tracao;

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public void cadastrar() {
        System.out.println("Carro SUV cadastrado!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$" + valor);
        System.out.println("Tracao: " + this.tracao);
    }
    
}
