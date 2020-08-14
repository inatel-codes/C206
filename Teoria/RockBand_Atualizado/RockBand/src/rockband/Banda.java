package rockband;

public class Banda {
    
    // ATRIBUTOS EXPLICITOS
    public String nome;
    public String genero;
    
    // ATRIBUTOS IMPLICITOS
    public Empresario empresario; // NAO CRIAMOS UM ARRAY, POIS TERA NO MAXIMO 1 EMPRESARIO NA BANDA
    public Musico[] musico; // CRIAMOS UM ARRAY, POIS TERAO N MUSICOS NA BANDA
    public Musica[] musica; // CRIAMOS UM ARRAY, POIS TERAO N MUSICAS DA BANDA
    
    // METODO PARA ADICIONAR NOVOS MUSICOS NA BANDA
    public void addMusico(Musico novoMusico) 
    {
        // VARRENDO ARRAY DE MUSICOS
        for (int i = 0; i < musico.length; i++) 
        {
            if (musico[i] == null) 
            {
                musico[i] = novoMusico; // ADICIONANDO NOVO MUSICO
                break;
            }
        }
    }
    
    // METODO PARA ADICIONAR NOVAS MUSICAS NA BANDA
    public void addMusica(Musica novaMusica) 
    {
        // VARRENDO ARRAY DE MUSICAS
        for (int i = 0; i < musica.length; i++) 
        {
            if (musica[i] == null) 
            {
                musica[i] = novaMusica; // ADICIONANDO NOVA MUSICA
                break;
            }
        }
    }

    // METODO PARA MOSTRAR TODAS AS INFORMACOES DA BANDA
    public void mostraInfosBanda() 
    {
        System.out.println("Nome da banda: " + nome); // NOME DA BANDA
        System.out.println("Genero da banda: " + genero); // GENERO DA BANDA
        
        // SE A BANDA TIVER EMPRESRIO
        if (empresario.nome != null) 
        {
            System.out.println("Empresario da banda: " + empresario.nome); // EMPRESARIO DA BANDA
        }
        else
        {
            System.out.println("A banda não tem um empresário!"); // NAO TEM EMPRESARIO
        }
        
        // SE A BANDA TIVER MUSICOS
        if (musico != null) 
        {
            System.out.println("\n" + "MUSICOS: ");  // MUSICOS DA BANDA
            
            // VARRENDO ARRAY DE MUSICOS
            for (int i = 0; i < musico.length; i++) 
            {
                if (musico[i] != null)
                {
                    System.out.println("Musico " + i + ": " + musico[i].nome); // NOME DO MUSICO i
                    System.out.println("Funcao: " + musico[i].funcao); // FUNCAO DO MUSICO i
                    System.out.println("********************");
                }
            }
        }
        
        // SE A BANDA TIVER MUSICAS
        if(musica != null)
        {
            System.out.println("\n" + "MUSICAS DA BANDA: "); // MUSICAS DA BANDA
            
            // VARRENDO ARRAY DE MUSICAS
            for (int i = 0; i < musica.length; i++) 
            {
                if (musica[i] != null) 
                {
                    System.out.println("Musica " + i + ": " + musica[i].nome); // NOME DA MUSICA i
                    System.out.println("Tempo: " + musica[i].tempo + " segundos"); // TEMPO DA MUSICA i
                    System.out.println("********************");
                } 
            }
        }
    }
}
