package rockband;

public class RockBand {

    public static void main(String[] args) {
        
        // CRIANDO EMPRESARIO
        Empresario empresario1 = new Empresario();
        empresario1.nome = "Alexander";
        empresario1.cnpj = 123456789;
        
        // CRIANDO MUSICOS
        Musico musico1 = new Musico();
        musico1.nome = "Brendão";
        musico1.funcao = "Guitarrista";
        
        Musico musico2 = new Musico();
        musico2.nome = "Vanezza";
        musico2.funcao = "Baterista";
        
        Musico musico3 = new Musico();
        musico3.nome = "Gabriel Hub";
        musico3.funcao = "Cantor de Chuveiro";
        
        // MCRIANDO MUSICAS
        Musica musica1 = new Musica();
            musica1.nome = "JAVAI";
        musica1.tempo = 180;
        
        Musica musica2 = new Musica();
        musica2.nome = "PAITON E JERRY";
        musica2.tempo = 200;
        
        // CRIANDO BANDA
        Banda banda1 = new Banda();
        banda1.nome = "Peladões";
        banda1.genero = "Rock";
        banda1.empresario = empresario1;
        
        // CRIANDO ARRAYS PARA GUARDAR MUSICOS E MUSICAS (CASO A BANDA SEJA DESTRUIDA OS MUSICOS E MUSICAS AINDA EXISTIRÃO)
        Musica [] music = new Musica[10];
        Musico [] musitians = new Musico[10];
        
        // APONTANDO O ARRAY MUSICA PARA O ARRAY MUSIC
        // APONTANDO O ARRAY MUSICO PARA O ARRAY MUSITIANS
        banda1.musica = music;
        banda1.musico = musitians;
        
        // CHAMANDO METODO DE ADICIONAR MUSICOS
        banda1.addMusico(musico1);
        banda1.addMusico(musico2);
        banda1.addMusico(musico3);
        
        // CHAMANDO METODO DE ADICIONAR NOVAS MUSICAS
        banda1.addMusica(musica1);
        banda1.addMusica(musica2);
        
        // CHAMANDO O METODO PARA MOSTRAR TODAS AS INFORMACOES DA BANDA1
        banda1.mostraInfosBanda();
        
        
    }
    
}
