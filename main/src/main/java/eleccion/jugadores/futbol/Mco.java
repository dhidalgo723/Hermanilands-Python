package eleccion.jugadores.futbol;

import java.util.Random;

public class Mco {
    private Random ra = new Random();
    private String[] mco = {
        "Paul Pogba", "Antoine Griezmann", "Zinedine Zidane", //mediocentro ofensivo
        "Kevin De Bruyne", "Diego Maradona", "Mesut Özil",
        "James Rodríguez", "Isco", "Philippe Coutinho"

    };

    public String getMco() {
        return mco[ra.nextInt(mco.length)];
    }

    
}
