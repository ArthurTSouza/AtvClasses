/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.biblioteca;

/**
 *
 * @author arthu
 */
public class Livro extends Publicacao {
    private String isbn;
    private Autor autor;

    public Livro(String cota, String titulo, Area area, String isbn, Autor autor) {
        super(cota, titulo, area);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

