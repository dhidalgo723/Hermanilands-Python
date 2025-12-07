package eleccion.jugadores.futbol;

import java.util.Random;

public class Defensa {
    private Random ra = new Random();
    private String def[] = {
        "Sergio Ramos", "Virgil van Dijk", "Paolo Maldini", "Carles Pujol", "Pepe", // defensas centrales
        "Gerard Piqué", "Thiago Silva", "Raphaël Varane", "Mats Hummels",
        "Marquinhos", "David Alaba", "Leonardo Bonucci"
    };
    
    public String getDef() {
        return def[ra.nextInt(def.length)];
    }
}
