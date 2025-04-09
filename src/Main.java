import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Bohemian Rhapsody", 5, "A Night at the Opera", "Queen", "Rock", 9);
        musica.exibeFichaTecnica();
        musica.reproduz();
        musica.curte();
        System.out.println("****************************************");
        musica.setAvaliacao(7.5);
        musica.exibeFichaTecnica();

        System.out.println("****************************************");

        Podcast podcast = new Podcast("Mundo Freak", 4, "Rafael Lange", "Podcast sobre cultura pop e mistérios", 4);
        podcast.exibeFichaTecnica();
        podcast.reproduz();
        podcast.curte();
        System.out.println("****************************************");
        podcast.setAvaliacao(8);
        podcast.exibeFichaTecnica();
        System.out.println("****************************************");
        while (musica.getTotalReproducoes() < 110) {
            musica.reproduz();
        }
        musica.getClassificacao();
        System.out.println("****************************************");
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}