/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.casa.musicas;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author arthu
 */



public class Exibir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Playlist> playlists = new ArrayList<>();

        System.out.println("Digite quantas playlists deseja inserir:");
        int qtdP = entrada.nextInt();
        entrada.nextLine(); // limpar buffer

        for (int x = 0; x < qtdP; x++) {
            Playlist play = new Playlist();

            System.out.println("Essa playlist é Dupla (d) ou Coletânea (c)?");
            String tipo = entrada.nextLine();

            if (tipo.equalsIgnoreCase("d")) {
                play.setDupla(true);
                System.out.println("Esta playlist é dupla!");
            } else if (tipo.equalsIgnoreCase("c")) {
                play.setColetanea(true);
                System.out.println("Quantos artistas estarão nela?");
                int qtdArt = entrada.nextInt();
                entrada.nextLine();
                for (int y = 0; y < qtdArt; y++) {
                    System.out.print("Nome do artista " + (y + 1) + ": ");
                    String nome = entrada.nextLine();
                    play.adicionarArtista(new Artista(nome));
                }
            }

            System.out.print("Digite o nome do criador da playlist: ");
            play.setNomeCriador(entrada.nextLine());

            System.out.print("Digite a data de criação: ");
            play.setData(entrada.nextLine());

            System.out.print("Digite o título da playlist: ");
            play.setTitulo(entrada.nextLine());

            System.out.print("Quantas músicas deseja adicionar? ");
            int qtdMus = entrada.nextInt();
            entrada.nextLine();

            for (int j = 0; j < qtdMus; j++) {
                System.out.print("Título da música " + (j + 1) + ": ");
                String nomeMus = entrada.nextLine();
                System.out.print("Duração da música: ");
                String dur = entrada.nextLine();
                play.adicionarMusica(new Musica(nomeMus, dur));
            }

            playlists.add(play);
        }

        System.out.print("\nDigite o nome de um artista para ver suas playlists: ");
        String compArt = entrada.nextLine();
        boolean achouArtista = false;

        for (Playlist p : playlists) {
            for (Artista a : p.getArtistas()) {
                if (a.getNomeArtista().equalsIgnoreCase(compArt)) {
                    System.out.println("O artista " + compArt + " está na playlist: " + p.getTitulo());
                    achouArtista = true;
                }
            }
        }

        if (!achouArtista) {
            System.out.println("O artista " + compArt + " não está presente em nenhuma playlist.");
        }

        System.out.print("\nDigite o título de uma música para saber em qual playlist ela está: ");
        String compMus = entrada.nextLine();
        boolean achouMusica = false;

        for (Playlist p : playlists) {
            for (Musica m : p.getMusicas()) {
                if (m.getNomeMusica().equalsIgnoreCase(compMus)) {
                    System.out.println("A música " + compMus + " está na playlist: " + p.getTitulo());
                    achouMusica = true;
                }
            }
        }

        if (!achouMusica) {
            System.out.println("A música " + compMus + " não consta em nenhuma playlist.");
        }
    }
}

//Por vezes, é melhor eu guardar tudo que eu precisar em variáveis ao decorrer do código e só no final chamar um método para criar a playlist e mandar
//mesmo que alguns vazios, todos os valores. Assim eu não preciso de tanto get e set no cod e nem na classe, mas aí eu tenho que pensar um pouco mais sobre
//o assunto. Além do mais eu tenho que elaborar melhor como ligar a classe musica com playlist ou artista, vamos ver o que eu consigo arranjar.
