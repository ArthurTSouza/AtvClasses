/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.biblioteca;

/**
 *
 * @author arthu
 */
public class Publicacao {
    private String cota;
    private String titulo;
    private Area area;

    public Publicacao(String cota, String titulo, Area area) {
        this.cota = cota;
        this.titulo = titulo;
        this.area = area;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String emprestimo(String cota, String titulo, String area) {
        return "Empréstimo - Cota: " + cota + ", Título: " + titulo + ", Área: " + area;
    }
}
