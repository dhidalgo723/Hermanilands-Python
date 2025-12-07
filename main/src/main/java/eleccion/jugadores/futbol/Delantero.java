package eleccion.jugadores.futbol;

import java.util.Random;

public class Delantero {
    private Random ra = new Random();
    private String[] dc = {
        "Karin Benzema", "Luis Suárez", "Robert Lewandowski", "Sergio Agüero" //delantero centro
    };

    public String getDc() {
        return dc[ra.nextInt(dc.length)];
    }
}
