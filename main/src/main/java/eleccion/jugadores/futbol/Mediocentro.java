package eleccion.jugadores.futbol;

import java.util.Random;

public class Mediocentro {
    private Random ra = new Random();
    private String[] mc = {
        "Toni Kroos", "Yaya Touré", "Xavi Hernández", "Luka Modrić", "Kevin De Bruyne", "Pedri", //mediocentro creador de juego
        "Marco Verratti", "David Silva", "Cesc Fàbregas"
    };

    public String getMc() {
        return mc[ra.nextInt(mc.length)];
    }
    
}
