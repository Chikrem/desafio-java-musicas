package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.principal.Audio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(String titulo, int classificacao, String apresentador, String descricao, double avaliacao) {
        super.setTitulo(titulo);
        super.setClassificacao(classificacao);
        this.apresentador = apresentador;
        this.descricao = descricao;
        super.setAvaliacao(avaliacao);
    }

    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Apresentador: " + this.apresentador);
        System.out.println("Descrição: " + this.descricao);
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 200){
            System.out.println("O podcast " + getTitulo() + "tem classificação 10.");
            return 10;
        } else {
            System.out.println("O podcast " + getTitulo() + "tem classificação 8.");
            return 8;
        }
    }

}
