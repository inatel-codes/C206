package aula9_exercicio1;

import java.util.Scanner;

public class Sedan extends Carro {

    private int portaMalas;

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    @Override
    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porta Malas: ");
        portaMalas = teclado.nextInt();
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
        System.out.println("SEDAN ENCONTRADO: ");
        System.out.println("Porta Malas: " + portaMalas);
        System.out.println("Valor: " + valor);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("*************************************");
    }
}
