/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casa.biblioteca;

/**
 *
 * @author arthu
 */

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (emprestimos.size() < 3) {
            emprestimos.add(emprestimo);
        } else {
            System.out.println("O aluno " + nome + " já atingiu o limite de 3 empréstimos.");
        }
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}

