/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.casa.biblioteca;

import java.util.Date;

/**
 *
 * @author arthu
 */
public class Exibir {
        public static void main(String[] args) {
            Area area = new Area("Informática");
            Autor autor = new Autor("Arthur Albino");

            Livro livro = new Livro("C123", "Programação Java", area, "978-85-333", autor);
            Revista revista = new Revista("R456", "Ciência Hoje", new Area("Sociologia"), "Mensal");

            Aluno aluno = new Aluno("Lucas Souza");

            Emprestimo emprestimo1 = new Emprestimo(new Date(), livro);
            aluno.adicionarEmprestimo(emprestimo1);

            Emprestimo emprestimo2 = new Emprestimo(new Date(), revista);
            aluno.adicionarEmprestimo(emprestimo2);

            System.out.println("=== Biblioteca ===");
            System.out.println("Aluno: " + aluno.getNome());

            for (Emprestimo e : aluno.getEmprestimos()) {
                System.out.println("- Publicação: " + e.getPublicacao().getTitulo()
                        + " | Área: " + e.getPublicacao().getArea().getTipo());
            }
        }
}
