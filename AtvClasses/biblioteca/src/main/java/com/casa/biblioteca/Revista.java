/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.biblioteca;

/**
 *
 * @author arthu
 */

public class Revista extends Publicacao {
    private String periodicidade;

    public Revista(String cota, String titulo, Area area, String periodicidade) {
        super(cota, titulo, area);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}

