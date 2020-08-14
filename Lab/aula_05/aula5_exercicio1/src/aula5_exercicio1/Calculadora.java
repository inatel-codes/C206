package aula5_exercicio1;

public class Calculadora {
    float numero1;
    float numero2;
    float resultado;
    
    public void soma()
    {
        resultado = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }
    public void subtracao()
    {
        resultado = numero1 - numero2;
        System.out.println(numero1 + " - " + numero2 + " = " + resultado);
    }
    public void multiplicacao()
    {
        resultado = numero1 * numero2;
        System.out.println(numero1 + " x " + numero2 + " = " + resultado);
    }
    public void divisao()
    {
        resultado = numero1 / numero2;
        System.out.println(numero1 + " / " + numero2 + " = " + resultado);
    }
}
