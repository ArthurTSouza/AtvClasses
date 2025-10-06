/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
package com.casa.musicas;

public class Musica {
    private String nomeMusica;
    private String duracao;

    public Musica() {}

    public Musica(String nomeMusica, String duracao) {
        this.nomeMusica = nomeMusica;
        this.duracao = duracao;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }
}
