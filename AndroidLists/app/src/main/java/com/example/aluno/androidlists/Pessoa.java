package com.example.aluno.androidlists;

/**
 * Created by Aluno on 12/12/2016.
 */

public class Pessoa {

    private String nome;
    private Boolean isDoador;
    private String genero;
    private String tipoSanguineo;

    public Pessoa(String nome, Boolean isDoador, String genero, String tipoSanguineo) {
        this.nome = nome;
        this.isDoador = isDoador;
        this.genero = genero;
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getDoador() {
        return isDoador;
    }

    public void setDoador(Boolean doador) {
        isDoador = doador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }


}
