/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.biblioteca;

/**
 *
 * @author arthu
 */
import java.util.Date;

public class Emprestimo {
    private Date data;
    private Publicacao publicacao;

    public Emprestimo(Date data, Publicacao publicacao) {
        this.data = data;
        this.publicacao = publicacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
}

