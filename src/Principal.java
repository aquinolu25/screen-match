import br.com.aquino.screenmatch.calculos.CalculadoraDeTempo;
import br.com.aquino.screenmatch.modelos.Filme;
import br.com.aquino.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("A chave mestre");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("The white lotus");
        serie.setAnoDeLancamento(2024);
        serie.exibeFichaTecnica();
        serie.setTemporadas(3);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar The white lotus: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());




    }
}
