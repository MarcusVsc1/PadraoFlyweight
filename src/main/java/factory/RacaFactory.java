package factory;

import model.Raca;

import java.util.HashMap;

public class RacaFactory {

    private static HashMap<String, Raca> racas = new HashMap<>();

    public static Raca getRaca(String nome, String porte, Integer expectativaIdade) {
        Raca raca = racas.get(nome);
        if (raca == null) {
            raca = new Raca(nome, porte, expectativaIdade);
            racas.put(nome, raca);
        }
        return raca;
    }

    public static int getTotalRacas() {
        return racas.size();
    }
}
