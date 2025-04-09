package br.com.alura.minhasmusicas.principal;

public class Audio {
    private String titulo;
    private int classificacao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int totalAvaliacoes;
    private double avaliacao;

    public void exibeFichaTecnica() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Classificação: " + this.classificacao);
        System.out.println("Total de reproduções: " + this.totalReproducoes);
        System.out.println("Total de curtidas: " + this.totalCurtidas);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Total de avaliações: " + this.totalAvaliacoes);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int setClassificacao(int classificacao) {
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            System.out.println("Classificação inválida. A classificação deve ser entre 0 e 5.");
        }
        return this.classificacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCutidas() {
        return totalCurtidas;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

    public double setAvaliacao(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 10) {
            this.totalAvaliacoes++;
            this.avaliacao = (this.avaliacao + avaliacao) / this.totalAvaliacoes;
        } else {
            System.out.println("Avaliação inválida. A avaliação deve ser entre 0 e 10.");
        }
        return this.avaliacao;
    }
}
