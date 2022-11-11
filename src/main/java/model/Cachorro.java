package model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Cachorro {


    private String nome;
    private Float peso;
    private Raca raca;

    public String descricaoDoguinho(){
        return "Cachorro{nome='" + this.nome +
                "', peso='" + this.peso +
                "', raca='" + this.raca.getNome() +
                "', porte='" + this.raca.getPorte() +
                "', expextativaIdade='" + this.raca.getExpectativaIdade() +
                "'}";
    }
}
