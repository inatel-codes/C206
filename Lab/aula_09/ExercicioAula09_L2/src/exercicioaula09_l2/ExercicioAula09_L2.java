package exercicioaula09_l2;

public class ExercicioAula09_L2 {

    public static void main(String[] args) {
        
        Carro c1 = new SUV();
        Carro c2 = new Sedan();
        Carro c3 = new Hatch();
        Carro c4 = new SUV();
        Carro c5 = new SUV();
        
        Carro[] arrayCarros = new Carro[5];

        arrayCarros[0] = c1;
        arrayCarros[1] = c2;
        arrayCarros[2] = c3;
        arrayCarros[3] = c4;
        arrayCarros[4] = c5;
        
        
     
        // SUV
        SUV carroSUV = (SUV) c1;
        c1.ano = 2019;
        c1.cor = " SUV Preto";
        c1.valor = 33_000;
        carroSUV.setTracao("4x4");
        
        //Sedan
        Sedan carroSedan = (Sedan) c2;
        carroSedan.ano = 2009;
        carroSedan.cor = "Sedan Branco";
        carroSedan.valor = 55_000;
        carroSedan.setPortaMalas(50);

        // Hatch
        Hatch carroHatch = (Hatch) c3;
        carroHatch.ano = 2015;
        c3.cor = "Hatch Prata";
        carroHatch.valor = 10_000;
        carroHatch.setPortas(4);

        SUV carroSUV2 = (SUV) c4;
        c4.ano = 2019;
        c4.cor = "SUV Preto";
        c4.valor = 33_000;
        carroSUV2.setTracao("8x8");

        int cont = 0;
        for (Carro arrayCarro : arrayCarros) {

            if (arrayCarro instanceof SUV) {
                System.out.println("SUV encontrada !!");
                cont++;
                SUV suvAux = (SUV) arrayCarro;
                suvAux.mostraInfo();
                System.out.println("-----------------");

                ((SUV) arrayCarro).mostraInfo();
            } else if (arrayCarro instanceof Hatch) {
                System.out.println("Hatch Encontrado !!");
                System.out.println("-----------------");
            }

        }

        System.out.println("Numero de SUV: " + cont);
    }

}
