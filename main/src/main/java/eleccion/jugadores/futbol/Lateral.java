package eleccion.jugadores.futbol;

import java.util.Random;

public class Lateral {
    private Random ra = new Random();
    private String[] l = {
        "Cafú", "Dani Alves", "Marcelo", "Roberto Carlos", // laterales"
        "Trent Alexander-Arnold", "Jordi Alba", "Dani Carvajal",
        "Kyle Walker", "Achraf Hakimi", "Alphonso Davies", "João Cancelo"
    };

    public String getL() {
        return l[ra.nextInt(l.length)];
    }
}
