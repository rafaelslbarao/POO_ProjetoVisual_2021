/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafael.exemploprojetovisual2;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class CadastraControlador {

    private ArrayList<Pessoa> listaPessoas;

    public CadastraControlador() {
        listaPessoas = new ArrayList();
    }

    public ResultadoValidacao validaNome(String nome) {
        if (nome.trim().length() <= 0) {
            return new ResultadoValidacao(false, "Informe o nome");
        }
        return new ResultadoValidacao(true);
    }

    public ResultadoValidacao validaSexo(String sexo) {
        if (sexo.equalsIgnoreCase("MASCULINO") || sexo.equalsIgnoreCase("FEMININO")) {
            return new ResultadoValidacao(true);
        }
        return new ResultadoValidacao(false, "Informe o sexo");
    }

    public ResultadoValidacao validaAtivo(boolean botaoMarcado) {
        if (botaoMarcado) {
            return new ResultadoValidacao(true);
        }
        return new ResultadoValidacao(false, "Informe ativo sim ou não");
    }

    public Pessoa salvaNovoCadastro(String nome, String sexo, boolean ativo) {
        Pessoa novaPessoa = new Pessoa(nome, sexo, ativo);
        listaPessoas.add(novaPessoa);
        return novaPessoa;
    }

    public void atualizaPessoa(Pessoa pessoa, String nome, String sexo, boolean ativo) {
        pessoa.setNome(nome);
        pessoa.setSexo(sexo);
        pessoa.setAtivo(ativo);
    }

    public void removeRegistro(int posicao) {
        listaPessoas.remove(posicao);
    }

    public Pessoa get(int posicao) {
        return listaPessoas.get(posicao);
    }
}
