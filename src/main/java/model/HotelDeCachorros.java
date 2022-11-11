package model;

import factory.RacaFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelDeCachorros {

    private List<Cachorro> cachorros = new ArrayList<>();

    public void reservarVaga (String nome, Float peso, String nomeRaca, String porte, Integer expectativaIdade) {
        Raca raca = RacaFactory.getRaca(nomeRaca, porte, expectativaIdade);
        Cachorro cachorro = new Cachorro(nome, peso, raca);
        cachorros.add(cachorro);
    }

    public List<String> obterDoguinhos() {
        return cachorros.stream().map(Cachorro::descricaoDoguinho).collect(Collectors.toList());
    }

}
