package aula8_exercicio2;

public class Aula8_exercicio2 {

    public static void main(String[] args) {
        Smartphone smart = new Smartphone();
        smart.marca = "Samsung";
        smart.modelo = "Galaxy A7";
        smart.matriculaResponsavel = 1333;
        smart.setCentroCusto(1000);
        
        Notebook not = new Notebook();
        not.marca = "Asus";
        not.modelo = "Inspiring Innovation";
        not.matriculaResponsavel = 1234;
        not.setNumSerie(4565);
        
        System.out.println(not.marca);
        
    }

}
