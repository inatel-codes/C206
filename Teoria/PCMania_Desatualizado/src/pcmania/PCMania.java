package pcmania;

import java.util.Scanner;

public class PCMania {

    public static void main(String[] args) {

        // HARDWARE DA PROMOCAO 1
        HardwareBasico hardware1_p1 = new HardwareBasico();
        hardware1_p1.nome = "Pentium Core i3";
        hardware1_p1.capacidade = 1200;

        HardwareBasico hardware2_p1 = new HardwareBasico();
        hardware2_p1.nome = "Memória RAM";
        hardware2_p1.capacidade = 4;

        HardwareBasico hardware3_p1 = new HardwareBasico();
        hardware3_p1.nome = "HD";
        hardware3_p1.capacidade = 500;

        // HARDWARE DA PROMOCAO 2
        HardwareBasico hardware1_p2 = new HardwareBasico();
        hardware1_p2.nome = "Pentium Core i5";
        hardware1_p2.capacidade = 2260;

        HardwareBasico hardware2_p2 = new HardwareBasico();
        hardware2_p2.nome = "Memória RAM";
        hardware2_p2.capacidade = 8;

        HardwareBasico hardware3_p2 = new HardwareBasico();
        hardware3_p2.nome = "HD";
        hardware3_p2.capacidade = 1;

        // HARDWARE DA PROMOCAO 3
        HardwareBasico hardware1_p3 = new HardwareBasico();
        hardware1_p3.nome = "Pentium Core i7";
        hardware1_p3.capacidade = 3500;

        HardwareBasico hardware2_p3 = new HardwareBasico();
        hardware2_p3.nome = "Memória RAM";
        hardware2_p3.capacidade = 16;

        HardwareBasico hardware3_p3 = new HardwareBasico();
        hardware3_p3.nome = "HD";
        hardware3_p3.capacidade = 2;

        // SISTEMA OPERACIONAL DA PROMOCAO 1
        SistemaOperacional system_p1 = new SistemaOperacional();
        system_p1.nome = "Linux Ubuntu";
        system_p1.tipo = 32;

        // SISTEMA OPERACIONAL DA PROMOCAO 2
        SistemaOperacional system_p2 = new SistemaOperacional();
        system_p2.nome = "Windows 8";
        system_p2.tipo = 64;

        // SISTEMA OPERACIONAL DA PROMOCAO 3
        SistemaOperacional system_p3 = new SistemaOperacional();
        system_p3.nome = "Windows 10";
        system_p3.tipo = 64;

        // MEMORIA USB DA PROMOCAO 1
        MemoriaUSB memory_p1 = new MemoriaUSB();
        memory_p1.nome = "Pen-drive";
        memory_p1.capacidade = 16;

        // MEMORIA USB DA PROMOCAO 2
        MemoriaUSB memory_p2 = new MemoriaUSB();
        memory_p2.nome = "Pen-drive";
        memory_p2.capacidade = 32;

        // MEMORIA USB DA PROMOCAO 3
        MemoriaUSB memory_p3 = new MemoriaUSB();
        memory_p3.nome = "HD Externo";
        memory_p3.capacidade = 1;

        // COMPUTADOR DA PROMOCAO 1
        Computador computador1 = new Computador();
        computador1.marca = "Positivo";
        computador1.preco = 1300.00f;
        computador1.memory = memory_p1;
        computador1.system = system_p1;

        // CRIANDO ARRAY PARA GUARDAR O HARDWARE BASICO DA PROMOCAO 1
        HardwareBasico[] hardwareArray_p1 = new HardwareBasico[3];
        // APONTANDO O ARRAY hardware QUE ESTA NA CLASSE PARA O ARRAY hardwareArray_p1
        computador1.hardware = hardwareArray_p1;
        // COLOCANDO OS OBJETOS NO ARRAY
        hardwareArray_p1[0] = hardware1_p1;
        hardwareArray_p1[1] = hardware2_p1;
        hardwareArray_p1[2] = hardware3_p1;

        // COMPUTADOR DA PROMOCAO 2
        Computador computador2 = new Computador();
        computador2.marca = "Acer";
        computador2.preco = 1800.00f;
        computador2.memory = memory_p2;
        computador2.system = system_p2;

        // CRIANDO ARRAY PARA GUARDAR O HARDWARE BASICO DA PROMOCAO 2
        HardwareBasico[] hardwareArray_p2 = new HardwareBasico[3];
        // APONTANDO O ARRAY hardware QUE ESTA NA CLASSE PARA O ARRAY hardwareArray_p2
        computador2.hardware = hardwareArray_p2;
        // COLOCANDO OS OBJETOS NO ARRAY
        hardwareArray_p2[0] = hardware1_p2;
        hardwareArray_p2[1] = hardware2_p2;
        hardwareArray_p2[2] = hardware3_p2;

        // COMPUTADOR DA PROMOCAO 3
        Computador computador3 = new Computador();
        computador3.marca = "Vaio";
        computador3.preco = 2800.00f;
        computador3.memory = memory_p3;
        computador3.system = system_p3;

        // CRIANDO ARRAY PARA GUARDAR O HARDWARE BASICO DA PROMOCAO 3
        HardwareBasico[] hardwareArray_p3 = new HardwareBasico[3];
        // APONTANDO O ARRAY hardware QUE ESTA NA CLASSE PARA O ARRAY hardwareArray_p3
        computador3.hardware = hardwareArray_p3;
        // COLOCANDO OS OBJETOS NO ARRAY
        hardwareArray_p3[0] = hardware1_p3;
        hardwareArray_p3[1] = hardware2_p3;
        hardwareArray_p3[2] = hardware3_p3;

        Scanner teclado = new Scanner(System.in);
        Cliente client = new Cliente();
        System.out.print("Seu nome: ");
        client.nome = teclado.nextLine();
        System.out.print("CPF: ");
        client.cpf = teclado.nextLong();

        Computador[] comp = new Computador[10];
        client.clientComprou = comp;

        int op = 1;
        int compra;

        while (op != 0) {
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = teclado.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                case 1:
                    computador1.mostraPCConfigs();
                    System.out.println("Finalizar Compra?");
                    System.out.println("[1]Sim / [2]Não");
                    System.out.print("Opção: ");
                    compra = teclado.nextInt();
                    if (compra == 1) {
                        for (int i = 0; i < comp.length; i++) {
                            if (comp[i] == null) {
                                comp[i] = computador1;
                                break;
                            }
                        }
                    }

                    break;
                case 2:
                    computador2.mostraPCConfigs();
                    System.out.println("Finalizar Compra?");
                    System.out.println("[1]Sim / [2]Não");
                    System.out.print("Opção: ");
                    compra = teclado.nextInt();
                    if (compra == 1) {
                        for (int i = 0; i < comp.length; i++) {
                            if (comp[i] == null) {
                                comp[i] = computador2;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    computador3.mostraPCConfigs();
                    System.out.println("Finalizar Compra?");
                    System.out.println("[1]Sim / [2]Não");
                    System.out.print("Opção: ");
                    compra = teclado.nextInt();
                    if (compra == 1) {
                        for (int i = 0; i < comp.length; i++) {
                            if (comp[i] == null) {
                                comp[i] = computador3;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

        System.out.println("\n" + "DADOS DO CLIENTE: ");
        System.out.println("Nome: " + client.nome);
        System.out.println("CPF: " + client.cpf);
        System.out.println("COMPUTADORES COMPRADOS: ");
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] != null) {
                comp[i].mostraPCConfigs();
            }
        }
        System.out.println("\n" + "TOTAL DA COMPRA: R$" + client.calculaTotalCompra());
    }
}
