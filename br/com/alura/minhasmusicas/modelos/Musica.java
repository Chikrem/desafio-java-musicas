package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.principal.Audio;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public Musica(String titulo, int classificacao, String album, String artista, String genero, double avaliacao) {
        super.setTitulo(titulo);
        super.setClassificacao(classificacao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
        super.setAvaliacao(avaliacao);
    }

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Álbum: " + this.album);
        System.out.println("Artista: " + this.artista);
        System.out.println("Gênero: " + this.genero);
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 100){
            System.out.println("A música " + getTitulo() + "tem classificação 10.");
            return 10;
        } else {
            System.out.println("A música " + getTitulo() + "tem classificação 8.");
            return 8;
        }
    }

}
