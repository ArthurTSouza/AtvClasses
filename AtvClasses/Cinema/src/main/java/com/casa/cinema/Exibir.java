/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.casa.cinema;

/**
 *
 * @author arthu
 */
public class Exibir {

    public static void main(String[] args) {

        Sala sala1 = new Sala(1, 100);

        Genero genero = new Genero("Ação");
        Filme filme = new Filme("Missão Extrema", 120, genero);

        Ator ator1 = new Ator("Arnold Xuasnéger");
        Papel papel1 = new Papel("Agente Secreto", ator1, filme);

        Sessao sessao = new Sessao(filme, sala1, "20:00");
        Cliente cliente = new Cliente("Arthur");
        Funcionario funcionario = new Funcionario("Ronald Macdonald");

        Ingresso ingresso = funcionario.venderIngresso(sessao, "meia-entrada", cliente);
        
        
        System.out.println("\nAtores e papéis do filme " + filme.getTitulo() + ": \n" + ator1.getNome() + " como " + papel1.getNomePapel());
    }
}
