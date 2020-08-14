package aula9_exercicio1;

import java.util.Scanner;

public class Aula9_exercicio1 {

    public static void main(String[] args) { 
        Carro suv = new SUV();
        Carro sedan = new Sedan();
        Carro hatch = new Hatch();
        
        Carro [] arrayCarro = new Carro[100];

        int op;
        Scanner teclado = new Scanner(System.in);
        int sair = 0;

        while (sair != 1) {
            System.out.println("\n" + "0 - Sair");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Mostrar Informações");
            System.out.print("Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 0:
                    sair = 1;
                    break;

                case 1:
                    System.out.println("1 - SUV");
                    System.out.println("2 - Sedan");
                    System.out.println("3 - Hatch");
                    System.out.print("Opção: ");

                    op = teclado.nextInt();

                    if (op == 1) 
                    {
                        for (int i = 0; i < arrayCarro.length; i++) {
                            if(arrayCarro[i] == null)
                            {
                                arrayCarro[i] = suv;
                                SUV carroSUV = (SUV) suv;
                                carroSUV.cadastrar();
                                break;
                            }                   
                        }
                        
                    } 
                    
                    else if (op == 2) 
                    {
                        for (int i = 0; i < arrayCarro.length; i++) {
                            if(arrayCarro[i] == null)
                            {
                                arrayCarro[i] = sedan;
                                Sedan carroSedan = (Sedan) sedan;
                                carroSedan.cadastrar(); 
                                break;
                            }                   
                        }
                        
                    } 
                    
                    else if (op == 3) 
                    {
                        for (int i = 0; i < arrayCarro.length; i++) {
                            if(arrayCarro[i] == null)
                            {
                                arrayCarro[i] = hatch;
                                Hatch carroHatch = (Hatch) hatch;
                                carroHatch.cadastrar();
                                break;
                            }                   
                        }
                    }

                    break;

                case 2:
                    
                    for (int i = 0; i < arrayCarro.length; i++) {
                        if(arrayCarro[i] != null)
                        {
                            if(arrayCarro[i] instanceof SUV)
                            {
                                SUV aux = (SUV) arrayCarro[i];
                                aux.mostraInfo();
                            }
                            else if(arrayCarro[i] instanceof Sedan)
                            {
                                Sedan aux = (Sedan) arrayCarro[i];
                                aux.mostraInfo();
                            }
                            else if(arrayCarro[i] instanceof Hatch)
                            {
                                Hatch aux = (Hatch) arrayCarro[i];
                                aux.mostraInfo();
                            }
                        }      
                    }                                     
                    break;

                default:
                    System.out.println("Entrada inválida!");
                    break;
            }
        }
    }

}
