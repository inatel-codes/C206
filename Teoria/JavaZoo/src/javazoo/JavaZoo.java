package javazoo;

public class JavaZoo {

    public static void main(String[] args) {        
        Peixe peixe = new Peixe();
        peixe.cor = "Cinza";
        peixe.nPatas = 0;
        peixe.nome = "Gabriel";
        peixe.setnBarbatanas(4);
        
        Leao leao = new Leao();
        leao.cor = "Laranja";
        leao.nPatas = 0;
        leao.nome = "Alex";
        leao.setTamanhoJuba(20);
        
        Pato pato = new Pato();
        pato.cor = "Branco";
        pato.nPatas = 2;
        pato.nome = "Vanezza";
        pato.setTamanhoBico(5);
        
        Coruja coruja = new Coruja();
        coruja.cor = "Marrom";
        coruja.nPatas = 0;
        coruja.nome = "Brendhon";
        coruja.setAlturaVoo(10);
        
        Animal [] animaisDoZoo = new Animal[4];
        
        animaisDoZoo[0] = peixe;
        animaisDoZoo[1] = leao;
        animaisDoZoo[2] = pato;
        animaisDoZoo[3] = coruja; 
        
        Zoologico zoo = new Zoologico();
        zoo.setNome("Inatel"); 
        zoo.setEndereco("Av. João de Camargo");
        zoo.setAnimais(animaisDoZoo);
        
        for (int i = 0; i < zoo.getAnimais().length; i++) {
            if(zoo.getAnimais()[i] != null)
            {
                // INFORMACOES COMUNS DE CADA ANIMAL
                System.out.println("Nome: " + zoo.getAnimais()[i].nome);
                System.out.println("Numero de patas: " + zoo.getAnimais()[i].nPatas);
                System.out.println("Cor: " + zoo.getAnimais()[i].cor);
                
                // INFORMACOES ESPECIFICAS DE CADA ANIMAL
                if(zoo.getAnimais()[i] instanceof Coruja)
                {
                    Coruja corujaAux = (Coruja) zoo.getAnimais()[i];
                    System.out.println("Altura do Voo: " + corujaAux);
                }
                else if(zoo.getAnimais()[i] instanceof Peixe)
                {
                    Peixe peixeAux = (Peixe) zoo.getAnimais()[i];
                    System.out.println("Numero de barbatanas: " + peixeAux);
                }
                else if(zoo.getAnimais()[i] instanceof Pato)
                {
                    Pato patoAux = (Pato) zoo.getAnimais()[i];
                    System.out.println("Tamanho do bico: " + patoAux);
                }
                else if(zoo.getAnimais()[i] instanceof Leao)
                {
                    Leao leaoAux = (Leao) zoo.getAnimais()[i];
                    System.out.println("Tamanho da juba: " + leaoAux);
                }
                
                System.out.println("************************************************");
            }
            
        }
    }
    
}
