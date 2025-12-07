package eleccion.jugadores.futbol;

import java.util.Random;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        String user1 = "Player 1";
        String user2 = "Player 2";
        int global = 0;
        int elec = 0;
        int alineacion1 = 0;
        int alineacion2 = 0;
        boolean bucle = true;
        boolean elecGk = false;
        int random = 0;
        int i = 0;
        String gk1 = "";
        String gk2 = "";
        String[] gk = {
                "Gianluigi Buffon", "Manuel Neuer", "Thibaut Courtois"
        };

        System.out.println("Ahora escoge los porteros");
        while(!elecGk) {
            random = ra.nextInt(2);
            if (random == 0) { // cuando haya escogido el otro jugador
                System.out.println(user1 + " escoge uno de estos jugadores");
                System.out.println("1. " + gk[ra.nextInt(gk.length)]);
                System.out.println("2. " + gk[ra.nextInt(gk.length)]);
                elec = sc.nextInt();
                if (gk[elec - 1].equals(gk[0])) {
                    gk1 = gk[0];
                    System.out.println("Tu jugador es: " + gk1);
                } else if (gk[elec - 1].equals(gk[1])) {
                    gk1 = gk[1];
                    System.out.println("Tu jugador es: " + gk1);
                } elec = 0;
            } else if (random == 1) { // cuando haya escogido el otro jugador
                System.out.println(user2 + " escoge un jugador");
                System.out.println("1. " + gk[ra.nextInt(gk.length)]);
                System.out.println("2. " + gk[ra.nextInt(gk.length)]);
                elec = sc.nextInt();
                if (gk[elec - 1].equals(gk[0])) {
                    gk2 = gk[0];
                    System.out.println("Tu jugador es: " + gk2);
                } else if (gk[elec - 1].equals(gk[1])) {
                    gk2 = gk[1];
                    System.out.println("Tu jugador es: " + gk2);
                } elec = 0;
            }

            sc.close();
        }
    }
}