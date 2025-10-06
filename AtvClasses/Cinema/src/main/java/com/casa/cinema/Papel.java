/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.cinema;

/**
 *
 * @author arthu
 */

public class Papel {
    private String nomePapel;
    private Ator ator;
    private Filme filme;

    public Papel(String nomePapel, Ator ator, Filme filme) {
        this.nomePapel = nomePapel;
        this.ator = ator;
        this.filme = filme;
    }

    public String getNomePapel() {
        return nomePapel;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }
}