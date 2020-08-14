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
        musico3.nome = "Gabriel";
        musico3.funcao = "Cantor de Chuveiro";
        
        // CRIANDO MUSICAS
        Musica musica1 = new Musica();
        musica1.nome = "A ilha de java";
        musica1.tempo = 300;
        
        Musica musica2 = new Musica();
        musica2.nome = "Amor ao java";
        musica2.tempo = 250;
               
        // CRIANDO BANDA
        Banda banda1 = new Banda();
        banda1.nome = "Peladões";
        banda1.genero = "Rock";
        banda1.empresario = empresario1;
        banda1.musica = new Musica[10];
        banda1.musico = new Musico[5];
        
        // ADICIONANDO MUSICOS
        banda1.addMusico(musico1);
        banda1.addMusico(musico2);
        banda1.addMusico(musico3);
        
        // ADICIONANDO MUSICAS
        banda1.addMusica(musica1);
        banda1.addMusica(musica2);
        
        // MOSTRANDO INFORMACOES DA BANDA
        banda1.mostraInfosBanda(); 
    }
    
}
