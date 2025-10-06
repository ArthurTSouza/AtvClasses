/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.cinema;

/**
 *
 * @author arthu
 */

public class Ingresso {
    private Sessao sessao;
    private String tipo; 
    private Cliente cliente;

    public Ingresso(Sessao sessao, String tipo, Cliente cliente) {
        this.sessao = sessao;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}