package agenda;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String apelido;
    private String celular;
    private String tipoAmizade;
    ArrayList <Email> emails = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipoAmizade() {
        return tipoAmizade;
    }

    public void setTipoAmizade(String tipoAmizade) {
        this.tipoAmizade = tipoAmizade;
    }
}
