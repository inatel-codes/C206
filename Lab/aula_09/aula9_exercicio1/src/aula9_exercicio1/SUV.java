package aula9_exercicio1;

import java.util.Scanner;

public class SUV extends Carro{
    private String tracao;
    
    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Tração: ");
        tracao = teclado.nextLine();
        System.out.print("Valor: ");
        valor = teclado.nextDouble();
        System.out.print("Cor: ");
        teclado.nextLine(); // IGNORAR INT
        cor = teclado.nextLine();
        System.out.print("Ano: ");
        ano = teclado.nextInt();
        System.out.println("CADASTRADO COM SUCESSO!");
    }
    
    @Override
    public void mostraInfo() {
        System.out.println("SUV ENCONTRADO: ");
        System.out.println("Tração: " + tracao);
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("*************************************");
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
