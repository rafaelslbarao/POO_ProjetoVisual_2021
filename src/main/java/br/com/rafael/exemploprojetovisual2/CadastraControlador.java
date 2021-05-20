/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rafael.exemploprojetovisual2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class CadastraControlador {

    public ResultadoValidacao validaNome(String nome) {
        if (nome.trim().length() <= 0)
            return new ResultadoValidacao(false, "Informe o nome");
        return new ResultadoValidacao(true);
    }
    
    public ResultadoValidacao validaSexo(String sexo)
    {
        if(sexo.equalsIgnoreCase("MASCULINO") || sexo.equalsIgnoreCase("FEMININO"))
            return new ResultadoValidacao(true);
        return new ResultadoValidacao(false, "Informe o sexo");
    }
    
    public ResultadoValidacao validaAtivo(boolean botaoMarcado)
    {
        if(botaoMarcado)
            return new ResultadoValidacao(true); 
        return new ResultadoValidacao(false, "Informe ativo sim ou não");
    }
}
