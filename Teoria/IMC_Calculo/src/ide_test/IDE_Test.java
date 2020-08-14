package ide_test;

import java.util.Scanner;

public class IDE_Test 
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        
        //loop infinito
        for(;;){
            
            //lendo um valor int (id)
            System.out.print("id: ");
            int id = ler.nextInt();

            //lendo uma string com espaço (nome)
            System.out.print("Nome: ");
            String nome = ler.next();

            //lendo uma string sem espaço (email)
            System.out.print("Email: ");
            String email = ler.next();

            //lendo um valor float (peso)
            System.out.print("Seu Peso (em kg): ");
            float peso = ler.nextFloat();

            //lendo um valor float (altura)
            System.out.print("Sua Altura(em metros): ");
            float altura = ler.nextFloat();

            //atribuindo o imc da pessoa a variavel imc
            float imc = peso/(altura*altura);

            //mostrando o imc e mostrando se esta pessoa esta saudavel ou nao
            System.out.print("Seu IMC é " + imc + " e você está ");

            if(imc < 17)
            {
                System.out.println("muito abaixo do peso");
            }

            else if(imc > 17 && imc < 18.49)
            {
                System.out.println("abaixo do peso");
            }

            else if(imc > 18.5 && imc < 24.99)
            {
                System.out.println("com peso normal");
            }

            else if(imc > 25 && imc < 29.99)
            {
                System.out.println("acima do peso");
            }

            else if(imc > 30 && imc < 34.99)
            {
                System.out.println("com obesidade I");
            }

            else if(imc > 35 && imc < 39.99)
            {
                System.out.println("com obesidade II(severa)");
            }

            else if(imc > 40)
            {
                System.out.println("com obesidade III(morbida)");
            }
        
            System.out.println(" ");
            
            System.out.println("Deseja calcular mais algum IMC(1-Sim/2-Nao)");
            System.out.print("Opcao: ");
            int op = ler.nextInt();
            
            System.out.println(" ");
            
            if(op == 2)
            {
                break;
            }
              
        }
    }
    
}
