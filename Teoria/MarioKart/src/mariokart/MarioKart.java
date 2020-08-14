package mariokart;

public class MarioKart {

    public static void main(String[] args) {
        
        // CRIANDO PILOTO 1
        Piloto p1 = new Piloto();
        p1.nome = "Mario";
        p1.vilao = false;
        
        // CRIANDO KART 1
        Kart k1 = new Kart();
        k1.nome = "Blue Falcon";
        k1.piloto = p1;
        k1.motor.cilindradas = "150";
        k1.motor.velocidadeMaxima = 135;
     
        // CRIANDO PILOTO 2
        Piloto p2 = new Piloto();
        p2.nome = "Bowser Koopa";
        p2.vilao = true;
        
        // CRIANDO KART 2
        Kart k2 = new Kart();
        k2.nome = "Egg1";
        k2.piloto = p2;
        k2.motor.cilindradas = "100";
        k2.motor.velocidadeMaxima = 115;
        
        // CHAMANDO OS METODOS DAS CLASSES
        
        System.out.println("Informações do Kart: ");
        System.out.println("Nome: " + k1.nome);
        System.out.println("Informações do Piloto: ");
        System.out.println("Nome: " + k1.piloto.nome);
        if(k1.piloto.vilao == true)
            System.out.println("É vilão!");
        else
            System.out.println("Não é vilão!");
        System.out.println("Informações do Motor: ");
        System.out.println("Cilindradas: " + k1.motor.cilindradas);
        System.out.println("Velocidade Maxima: " + k1.motor.velocidadeMaxima + "\n");
        
        p2.soltaSuperPoder();
        k1.pular();
        k1.soltarTurbo();
        p1.soltaSuperPoder();
        
    }
    
}
