/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.musicas;
import java.util.ArrayList;
/**
 *
 * @author arthu
 */



public class Playlist {
    private String nomeCriador;
    private String data;
    private String titulo;
    private boolean coletanea;
    private boolean dupla;

    private ArrayList<Musica> musicas = new ArrayList<>();
    private ArrayList<Artista> artistas = new ArrayList<>();

    public void setNomeCriador(String nomeCriador) {
        this.nomeCriador = nomeCriador;
    }

    public String getNomeCriador() {
        return nomeCriador;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setColetanea(boolean coletanea) {
        this.coletanea = coletanea;
    }

    public boolean isColetanea() {
        return coletanea;
    }

    public void setDupla(boolean dupla) {
        this.dupla = dupla;
    }

    public boolean isDupla() {
        return dupla;
    }
}

