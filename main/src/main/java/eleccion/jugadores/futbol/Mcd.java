package eleccion.jugadores.futbol;

import java.util.Random;

public class Mcd {
    private Random ra = new Random();
    private String[] mcd = {
        "Luka Modrić", "Casemiro", //mediocentro defensivo
        "Sergio Busquets", "Claude Makélélé", "Xabi Alonso",
        "Fernandinho", "Ezequiel Garay", "Gennaro Gattuso"
    };

    public String getMcd() {
        return mcd[ra.nextInt(mcd.length)];
    }
    
}
