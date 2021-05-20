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
public class ResultadoValidacao {
    private boolean resultado;
    private String msgErro;

    public ResultadoValidacao(boolean resultado) {
        this.resultado = resultado;
    }

    public ResultadoValidacao(boolean resultado, String msgErro) {
        this.resultado = resultado;
        this.msgErro = msgErro;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getMsgErro() {
        return msgErro;
    }

    public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
    }
    
    
}
