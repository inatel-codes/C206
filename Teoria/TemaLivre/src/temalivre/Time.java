/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temalivre;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Time {
    //Atributos
    private String nome;
    
    Tecnico t1 = new Tecnico();
    ArrayList<Atleta> team = new ArrayList<> ();
    
    /**
     * Método para adicionar atleta ao time 
     * @param a recebe um atleta para adicionar na lista 
     * @since 17/06/2019
     */
    public void addAtleta(Atleta a)
    {
        team.add(a);
    }
    /**
     * Método para listar as informações do time 
     * @author Vanessa Swerts
     * @since 17/06/2019
     */
    public void mostraInfosTime()
    {
        int index = 0;
        System.out.println("***********");
        System.out.println("Nome time: " + nome);
        t1.mostraInfosTecnico();
        for (Atleta atleta : team) 
        {
            System.out.println("***********");
            System.out.println("Nome atleta: " + team.get(index).getNome());
            System.out.println("Posicao: " + team.get(index).getPosicao());
            System.out.println("Idade: " + team.get(index).getIdade());
            index++;
        }
        
    }
    
    //Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
