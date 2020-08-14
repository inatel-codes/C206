package mariokart;

public class Piloto {
    
    // ATRIBUTOS
    String nome;
    boolean vilao;
    
    // METODOS
    public void soltaSuperPoder()
    {
        if(vilao == true)
            System.out.println("O vilão " + nome + " usou seu super poder");
        else
            System.out.println("O piloto " + nome + " usou seu super poder");
    }
}
