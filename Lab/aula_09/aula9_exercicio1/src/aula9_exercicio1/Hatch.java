package aula9_exercicio1;

import java.util.Scanner;

public class Hatch extends Carro {

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porta: ");
        portas = teclado.nextInt();
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
        System.out.println("HATCH ENCONTRADO!");
        System.out.println("Portas: " + portas);
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}
