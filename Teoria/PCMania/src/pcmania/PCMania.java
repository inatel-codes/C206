package pcmania;

import java.util.Scanner;

public class PCMania {

    public static void main(String[] args) {
        // DADOS DA PROMOÇÃO 1
        
        // Criando Memória USB por Agregação (Caso o computador seja destruido, a Memoria USB ainda existirá)
        MemoriaUSB memoria1 = new MemoriaUSB(); 
        memoria1.nome = "Pen-drive";
        memoria1.capacidade = 16;
        
        // Criando um novo computador
        Computador computador1 = new Computador();
        computador1.marca = "Positivo";
        computador1.preco = 1300.00f;
        
        computador1.addMemoriaUSB(memoria1); // CHAMANDO METODO ADDMEMORIA PARA ADICIONAR A MEMORIA USB AO COMPUTADOR   
        
        // Criando Sistema Operacional por Composição (Caso o computador seja destruiído o sistema tambem será)
        computador1.sistema.nome = "Linux Ubuntu";
        computador1.sistema.tipo = 32;
        
        // Criando os hardwares basicos por Composição (Caso o computador seja destruido o sistema tambem será)
        computador1.hardware[0].nome = "Prentium Core i3";
        computador1.hardware[0].capacidade = 1200;
        computador1.hardware[1].nome = "Memória RAM";
        computador1.hardware[1].capacidade = 4;
        computador1.hardware[2].nome = "HD";
        computador1.hardware[2].capacidade = 500;
        
        // DADOS DA PROMOÇÃO 2
        
        // Criando Memória USB por Agregação (Caso o computador seja destruido, a Memoria USB ainda existirá)
        MemoriaUSB memoria2 = new MemoriaUSB();
        memoria2.nome = "Pen-drive";
        memoria2.capacidade = 32;
        
        // Criando um novo computador
        Computador computador2 = new Computador();
        computador2.marca = "Acer";
        computador2.preco = 1800.00f;
        
        computador2.addMemoriaUSB(memoria2); // CHAMANDO METODO ADDMEMORIA PARA ADICIONAR A MEMORIA USB AO COMPUTADOR
        
        // Criando Sistema Operacional por Composição (Caso o computador seja destruiído o sistema tambem será)
        computador2.sistema.nome = "Windows 8";
        computador2.sistema.tipo = 64;
        
        // Criando os hardwares basicos por Composição (Caso o computador seja destruido o sistema tambem será)
        computador2.hardware[0].nome = "Prentium Core i5";
        computador2.hardware[0].capacidade = 2260;
        computador2.hardware[1].nome = "Memória RAM";
        computador2.hardware[1].capacidade = 8;
        computador2.hardware[2].nome = "HD";
        computador2.hardware[2].capacidade = 1;
        
        // DADOS DA PROMOÇÃO 3
        
        // Criando Memória USB por Agregação (Caso o computador seja destruido, a Memoria USB ainda existirá)
        MemoriaUSB memoria3 = new MemoriaUSB();
        memoria3.nome = "HD Externo";
        memoria3.capacidade = 1;
        
        // Criando um novo computador
        Computador computador3 = new Computador();
        computador3.marca = "Vaio";
        computador3.preco = 2800.00f;
        
        computador3.addMemoriaUSB(memoria3); // CHAMANDO METODO ADDMEMORIA PARA ADICIONAR A MEMORIA USB AO COMPUTADOR
        
        // Criando Sistema Operacional por Composição (Caso o computador seja destruiído o sistema tambem será)
        computador3.sistema.nome = "Windows 10";
        computador3.sistema.tipo = 64;
        
        // Criando os hardwares basicos por Composição (Caso o computador seja destruido o sistema tambem será)
        computador3.hardware[0].nome = "Prentium Core i7";
        computador3.hardware[0].capacidade = 3500;
        computador3.hardware[1].nome = "Memória RAM";
        computador3.hardware[1].capacidade = 16;
        computador3.hardware[2].nome = "HD";
        computador3.hardware[2].capacidade = 2;
        
        // PARTE DA COMPRA
        
        // Variaveis auxiliares
        boolean sairDaLoja = false;
        int opcao;
        Scanner teclado = new Scanner(System.in); // Declarando a Classe Scanner
        
        // CLIENTE 
        Cliente client = new Cliente();
        client.nome = "Alexander Augusto";
        client.cpf = 123456789;
        
        Computador [] clientComprou = new Computador[100]; // Criando Array de clientes para guardar os computadores que ele comprou
        client.computadorCliente = clientComprou; // Apontando o array clientComprou para o array que está na classe Cliente
        
        // Só sairá do while quando a variavel sairDaLoja for igual a true
        while(sairDaLoja == false)
        {
            System.out.println("\n" + "PC Mania - Bem Vindo!");
            System.out.println("[1] Visualizar Promoção 1;");
            System.out.println("[2] Visualizar Promomoção 2;");
            System.out.println("[3] Visualizar Promoção 3;");
            System.out.println("[0] Sair da Loja.");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 0:
                    sairDaLoja = true;
                    System.out.println("Finalizando tudo...");
                    break;
                case 1:
                    computador1.mostraPCConfigs(); // Mostrando configurações do computador 1
                    System.out.println("\n" + "Deseja comprar este Computador?");
                    System.out.println("[1] Sim / [2] Não");
                    System.out.print("Opção: ");
                    opcao = teclado.nextInt();
                    
                    if(opcao == 1)
                    {
                        // Varrendo todo array de compras do cliente e alocando uma nova compra em uma espaço vazio
                        for (int i = 0; i < clientComprou.length; i++) {
                            if(clientComprou[i] == null)
                            {
                                clientComprou[i] = computador1;
                                break;
                            } 
                        }
                        
                        System.out.println("Obrigado! Você acaba de aquirir o computador da promoção 1.");
                    }
                    break;
                    
                case 2:
                    computador2.mostraPCConfigs(); // Mostrando configurações do computador 2
                    System.out.println("\n" + "Deseja comprar este Computador?");
                    System.out.println("[1] Sim / [2] Não");
                    System.out.print("Opção: ");
                    opcao = teclado.nextInt();
                    
                    if(opcao == 1)
                    {
                        // Varrendo todo array de compras do cliente e alocando uma nova compra em uma espaço vazio
                        for (int i = 0; i < clientComprou.length; i++) {
                            if(clientComprou[i] == null)
                            {
                                clientComprou[i] = computador2;
                                break;
                            } 
                        }
                        
                        System.out.println("Obrigado! Você acaba de aquirir o computador da promoção 2.");
                    }
                    break;
                    
                case 3:
                    computador3.mostraPCConfigs(); // Mostrando configurações do computador 3
                    System.out.println("\n" + "Deseja comprar este Computador?");
                    System.out.println("[1] Sim / [2] Não");
                    System.out.print("Opção: ");
                    opcao = teclado.nextInt();
                    
                    if(opcao == 1)
                    {
                        // Varrendo todo array de compras do cliente e alocando uma nova compra em uma espaço vazio
                        for (int i = 0; i < clientComprou.length; i++) {
                            if(clientComprou[i] == null)
                            {
                                clientComprou[i] = computador3;
                                break;
                            } 
                        }
                        
                        System.out.println("Obrigado! Você acaba de aquirir o computador da promoção 3.");
                    }
                    break;
                    
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        
        System.out.println("\n" + "DADOS DO CLIENTE: ");
        System.out.println("Nome: " + client.nome);
        System.out.println("CPF: " + client.cpf);
        System.out.println("\n" + "COMPRAS: ");
        // Varrendo todo array de compras do cliente e mostrando todos os computadores que ele comprou 
        for (int i = 0; i < clientComprou.length; i++) {
            if(clientComprou[i] != null)
                clientComprou[i].mostraPCConfigs();  
        }
        System.out.println("\n" + "TOTAL DA COMPRA: R$" + client.calculaTotalCompra());
    }
    
}
