package javapets;

public class JavaPets {

    public static void main(String[] args) {

        // ALOCANDO OS OBJETOS NA MEMORIA
        AnimalPet animal1 = new AnimalPet();
        AnimalPet animal2 = new AnimalPet();
        AnimalPet animal3 = new AnimalPet();

        // CRIANDO OS TRES OBJETOS
        animal1.nome = "Nasus";
        animal1.especie = "Cachorro";
        animal1.idade = 2;
        animal1.comida = "Ração de Carne";
        animal1.som = "AuAuAu";

        animal2.nome = "Nida";
        animal2.especie = "Gato";
        animal2.idade = 1;
        animal2.comida = "Ração de Frutas";
        animal2.som = "MiaowMiaow";

        animal3.nome = "Twitch";
        animal3.especie = "Hamster";
        animal3.comida = "Queijo";
        animal3.idade = 5;
        animal3.som = "Sniff";

        // CHAMANDO METODOS DOS OBJETOS
        System.out.println("Animal 1: " + animal1.especie + " " + animal1.nome);
        animal1.comer();
        animal1.dormir(5);
        animal1.movimentar(50);
        animal1.fazerBarulho();
        
        System.out.println("");

        System.out.println("Animal 2: " + animal2.especie + " " + animal2.nome);
        animal2.comer();
        animal2.dormir(2);
        animal2.movimentar(100);
        animal2.fazerBarulho();
        
        System.out.println("");

        System.out.println("Animal 3: " + animal3.especie + " " + animal3.nome);
        animal3.comer();
        animal3.dormir(5);
        animal3.movimentar(25);
        animal3.fazerBarulho();

    }

}
