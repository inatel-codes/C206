package aula3_exercicio;

import java.util.Scanner;

public class Aula3_exercicio {

    public static void main(String[] args) {
        
        // Declarando a classe Scanner
        Scanner teclado = new Scanner(System.in);
        
        // QUESTAO 1
        /*
        int opcao;
        
        System.out.println("1 - Logica E");
        System.out.println("2 - Logica OU");
        
        System.out.print("Opção: ");
        opcao = teclado.nextInt();
            
        switch (opcao) 
        {
            case 1:
                System.out.println("V V  V");
                System.out.println("V F  F");
                System.out.println("F V  F");
                System.out.println("F F  F");
                break;
            case 2:
                System.out.println("V V  V");
                System.out.println("V F  V");
                System.out.println("F V  V");
                System.out.println("F F  F");
                break;
            default:
                System.out.println("Entrada inválida!");
        }
        */
        
        // QUESTAO 2
        /*
        int a;
        int b;
        int c;
        int d;
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        
        // 5 6 7 8 - valores  nao aceitos
        // 2 3 2 6 - valores aceitos
        
        if(((b > c) && (d > a)) && ((c+d) > (a+b)) && ((c >= 0) && (d >= 0)) && (a%2 == 0))
        {
            System.out.println("Valores aceitos");
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
        */
        
        // QUESTAO 3
        /*
        float altura;
        int peso;
        float imc;
        
        System.out.print("Altura: ");
        altura = teclado.nextFloat();
        System.out.print("Peso: ");
        peso = teclado.nextInt();
        
        imc = peso/(altura*altura);
        
        if(imc <= 18.5)
            System.out.println("Abaixo do peso");
        else if(imc >= 18.6 && imc <= 24.9)
            System.out.println("Peso ideal");
        else if(imc >= 25 && imc <= 29.9)
            System.out.println("Levemente acima do peso");
        else if(imc >= 30 && imc <= 34.9)
            System.out.println("Obesidade de grau I");
        else if(imc >= 35 && imc <= 39.9)
            System.out.println("Obesidade de grau II");
        else if(imc >= 40)
            System.out.println("Obesidade de grau III");
        */
        
        // QUESTAO 4
        int num1;
        int num2;
        String opcao;
        
        System.out.print("Numero 1: ");
        num1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        num2 = teclado.nextInt();
        
        teclado.nextLine();
        System.out.print("Operação desejada: ");
        opcao = teclado.nextLine();
        opcao = opcao.toLowerCase();
        
        switch (opcao) 
        {
            case "soma":
                System.out.println(num1 + num2);
                break;
                
            case "subtracao":
                System.out.println(num1 - num2);
                break;
                
            case "multiplicacao":
                System.out.println(num1 * num2);
                break;
                
            case "divisao":
                System.out.println(num1 / num2);
                break;    
                
             case "exponencial":
                System.out.println(Math.pow(num1, num2));
                break;  
                
            default:
                System.out.println("Entrada inválida!");
        }
        
    }
    
}
