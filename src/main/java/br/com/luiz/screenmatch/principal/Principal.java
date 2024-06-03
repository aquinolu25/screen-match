package br.com.luiz.screenmatch.principal;

import br.com.luiz.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner sc = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";
    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = sc.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
    }
}
