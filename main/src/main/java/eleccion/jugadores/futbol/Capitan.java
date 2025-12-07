package eleccion.jugadores.futbol;

import java.util.Random;

public class Capitan {
    private int global;
    private Random ra = new Random();
    private String capi;
    private String pos = "";
    private String[] cap = {
        "Lionel Messi", "Cristiano Ronaldo"
    };

    public void setCap() {
        this.capi = cap[ra.nextInt(cap.length)];
    }

    public Capitan(String capi, int global) {
        this.capi = capi;
        this.global = global;
        if(capi.equals("Lionel Messi")){
            pos = "EI/DC/ED";
            global = 99;
        } else if(capi.equals("Cristiano Ronaldo")){
            pos = "EI/DC/ED";
            global = 99;
        }
    }
    
    public String getCapi() {
        this.capi = cap[ra.nextInt(cap.length)];
        return capi;
    }

    public int getGlobal() {
        return global;
    }
}
