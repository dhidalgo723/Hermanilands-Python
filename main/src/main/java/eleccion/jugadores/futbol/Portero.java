package eleccion.jugadores.futbol;

import java.util.Random;

public class Portero {
    private Random ra = new Random();
    private int global;
    private String gkp;
    private String pos = "";
    private String[] gk = {
            "Gianluigi Buffon", "Manuel Neuer", "Thibaut Courtois" // porteros
    };

    public void setGk() {
        this.gkp = gk[ra.nextInt(gk.length)];
    }

    public Portero(String gkp, int global) {
        this.gkp = gkp;
        this.global = global;
        if (gkp.equals("Gianluigi Buffon")) {
            pos = "gk";
            global = 92;
        } else if (gkp.equals("Manuel Neuer")) {
            pos = "gk";
            global = 91;
        } else if (gkp.equals("Thibaut Courtois")) {
            pos = "gk";
            global = 90;
        }
    }

    public String getGk() {
        return gkp;
    }

    public int getGlobal() {
        return global;
    }
}
