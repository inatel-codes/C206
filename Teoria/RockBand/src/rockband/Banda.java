package rockband;

public class Banda {

    public String nome;
    public String genero;
    public Empresario empresario;
    public Musico[] musico;
    public Musica[] musica;

    public void addMusico(Musico novoMusico) 
    {
        for (int i = 0; i < musico.length; i++) {
            if (musico[i] == null) {
                musico[i] = novoMusico;
                break;
            }
        }
    }

    public void addMusica(Musica novaMusica) 
    {
        for (int i = 0; i < musica.length; i++) {
            if (musica[i] == null) {
                musica[i] = novaMusica;
                break;
            }
        }
    }

    public void mostraInfosBanda() 
    {
        System.out.println("Nome da banda: " + nome);
        System.out.println("Genero da banda: " + genero);

        if (empresario.nome != null) {
            System.out.println("Empresario da banda: " + empresario.nome);
        }

        if (musico != null) {
            System.out.println("\n" + "MUSICOS: ");
            for (int i = 0; i < musico.length; i++) {
                if (musico[i] != null) {
                    System.out.println("Musico " + i + ": " + musico[i].nome);
                    System.out.println("Funcao: " + musico[i].funcao);
                }
            }
        }
        
        if(musica != null)
        {
            System.out.println("\n" + "MUSICAS DA BANDA: ");
            for (int i = 0; i < musica.length; i++) {
                if (musica[i] != null) {
                    System.out.println("Musica " + i + ": " + musica[i].nome);
                    System.out.println("Tempo: " + musica[i].tempo + " segundos");
                }
            }
        }
    }
}
