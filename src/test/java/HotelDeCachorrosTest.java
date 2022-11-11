import factory.RacaFactory;
import model.HotelDeCachorros;
import model.Raca;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HotelDeCachorrosTest {


    @Test
    public void insercaoDoguinhosTest() {

        HotelDeCachorros hotelDeCachorros = new HotelDeCachorros();
        hotelDeCachorros.reservarVaga("Beethoven", 50f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("Paquita", 40f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("Mephisto", 43f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("K9", 55f, "Pastor Alemão", "Grande",7);

        List<String> saida = Arrays.asList(
                "Cachorro{nome='Beethoven', peso='50.0', raca='São Bernardo', porte='Grande', expextativaIdade='10'}",
                "Cachorro{nome='Paquita', peso='40.0', raca='São Bernardo', porte='Grande', expextativaIdade='10'}",
                "Cachorro{nome='Mephisto', peso='43.0', raca='São Bernardo', porte='Grande', expextativaIdade='10'}",
                "Cachorro{nome='K9', peso='55.0', raca='Pastor Alemão', porte='Grande', expextativaIdade='7'}"

        );

        assertEquals(saida, hotelDeCachorros.obterDoguinhos());
    }

    @Test
    public void totalRacasTest() {

        HotelDeCachorros hotelDeCachorros = new HotelDeCachorros();
        hotelDeCachorros.reservarVaga("Beethoven", 50f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("Paquita", 40f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("Mephisto", 43f, "São Bernardo", "Grande",10);
        hotelDeCachorros.reservarVaga("K9", 55f, "Pastor Alemão", "Grande",7);

        assertEquals(2, RacaFactory.getTotalRacas());
    }
}
