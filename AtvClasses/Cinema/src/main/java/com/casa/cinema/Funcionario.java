/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.cinema;

/**
 *
 * @author arthu
 */
public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Ingresso venderIngresso(Sessao sessao, String tipo, Cliente cliente) {
        return new Ingresso(sessao, tipo, cliente);
    }

    public String getNome() {
        return nome;
    }
}