/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafael.exemploprojetovisual2;

/**
 *
 * @author Rafael
 */
public class Pessoa {

    private String nome;
    private String sexo;
    private String ativo;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, String ativo) {
        this.nome = nome;
        this.sexo = sexo;
        this.ativo = ativo;
    }

    public Pessoa(String nome, String sexo, boolean ativo) {
        this.nome = nome;
        this.sexo = sexo;
        this.ativo = ativo ? "SIM" : "NÃO";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo ? "SIM" : "NÃO";
    }

    boolean estaAtiva() {
        return this.ativo.equalsIgnoreCase("SIM");
    }

}
