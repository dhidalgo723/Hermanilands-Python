package eleccion.jugadores.futbol;

import java.util.Random;

public class Global {
    Random ra = new Random();
    private int global = ra.nextInt(100);

    public Global(int global) {
        this.global = global;
    }

    public int getGlobal() {
        return global;
    }
    
}
