/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.cinema;

/**
 *
 * @author arthu
 */

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int duracao; 
    private Genero genero;
    private List<Papel> papeis = new ArrayList<>();

    public Filme(String titulo, int duracao, Genero genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public void adicionarPapel(Papel papel) {
        papeis.add(papel);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }
}
