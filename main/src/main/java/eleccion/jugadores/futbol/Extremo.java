package eleccion.jugadores.futbol;

import java.util.Random;

public class Extremo {
    private Random ra = new Random();
    private String[] ed = {
        "Arjen Robben", "Gareth Bale", "Neymar Jr", // extremos
    };

    public String getExtremo() {
        return ed[ra.nextInt(ed.length)];
    }
    
}
