public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "A chave mestre";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);

    }
}
