package eleccion.jugadores.futbol;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        // variables 1
        int global = 0;
        String nombre = "";

        // Defensa d = new Defensa("", global);
        // Lateral l = new Lateral("", global);
        // Mediocentro m = new Mediocentro("", global);
        // Mcd mcd = new Mcd("", global);
        // Mco mco = new Mco("", global);
        // Extremo e = new Extremo("", global);
        // Delantero dc = new Delantero("", global);

        System.out.println("Enter Player 1 Name: ");
        String user1 = sc.next();
        System.out.println("Enter Player 2 Name: ");
        String user2 = sc.next();

        // variables 2
        int elec = 0;
        int alineacion1 = 0;
        int alineacion2 = 0;
        boolean bucle = true;
        int random = 0;
        int i = 0;

        // Eleccion de alineacion
        while (bucle) {
            System.out.println(user1 + " escoge una alineacion para el partido:");
            System.out.println("1. 4-3-3");
            System.out.println("2. 4-4-2");
            System.out.println("3. 4-2-4");
            alineacion1 = sc.nextInt();
            switch (alineacion1) {
                case 1:
                    bucle = false;
                    break;
                case 2:
                    bucle = false;
                    break;
                case 3:
                    bucle = false;
                    break;
                default:
                    System.out.println("Alineacion no valida, escoge otra.");
                    break;
            }
        }
        bucle = true;

        // Eleccion de alineacion
        while (bucle) {
            System.out.println(user2 + " escoge una alineacion para el partido:");
            System.out.println("1. 4-3-3");
            System.out.println("2. 4-4-2");
            System.out.println("3. 4-2-4");
            alineacion2 = sc.nextInt();
            switch (alineacion2) {
                case 1:
                    bucle = false;
                    break;
                case 2:
                    bucle = false;
                    break;
                case 3:
                    bucle = false;
                    break;
                default:
                    System.out.println("Alineacion no valida, escoge otra.");
                    break;
            }
        }
        bucle = true;

        // variables capitanes
        String cap1 = "";
        String cap2 = "";
        boolean elecCap = false;

        // eleccion de capitanes
        System.out.println("Empecemos escogiendo los capitanes del equipo");
        for (i = 0; i < 2; i++) {
            Capitan cap = new Capitan("", global);
            if (!elecCap) {
                System.out.println(user1 + " escoge un jugador");
                System.out.println("1. " + cap.getCapi());
                System.out.println("2. " + cap.getCapi());
                elec = sc.nextInt();
                switch (elec) {
                    case 1:
                        elecCap = true;
                        cap1 = cap.getCapi();
                        break;
                    case 2:
                        elecCap = true;
                        cap1 = cap.getCapi();
                        break;
                }
            } else if (elecCap) { // cuando haya escogido el otro jugador
                System.out.println(user2 + " escoge un jugador");
                System.out.println("1. " + cap.getCapi());
                System.out.println("2. " + cap.getCapi());
                elec = sc.nextInt();
                switch (elec) {
                    case 1:
                        cap2 = cap.getCapi();
                        break;
                    case 2:
                        cap2 = cap.getCapi();
                        break;
                }
            }
        }
        elec = 0; // reset elec

        // variables porteros
        String gk1 = "";
        String gk2 = "";

        // eleccion de porteros
        System.out.println("Capitanes escogidos");
        System.out.println("Ahora escoge los porteros");
        for (i = 0; i < 2; i++) {
            Portero gk = new Portero("", global);
            random = ra.nextInt(2);
            if (random == 0) {
                System.out.println(user1 + " escoge un jugador");
                System.out.println("1. " + gk.getGk());
                System.out.println("2. " + gk.getGk());
                elec = sc.nextInt();
                switch (elec) {
                    case 1:
                        gk1 = gk.getGk();
                        break;
                    case 2:
                        gk1 = gk.getGk();
                        break;
                }
            } else if (random == 1) { // cuando haya escogido el otro jugador
                System.out.println(user2 + " escoge un jugador");
                System.out.println("1. " + gk.getGk());
                System.out.println("2. " + gk.getGk());
                elec = sc.nextInt();
                switch (elec) {
                    case 1:
                        gk2 = gk.getGk();
                        break;
                    case 2:
                        gk2 = gk.getGk();
                        break;
                }
            }
            random = 0; // reset random

            // variables defensas
            String def1 = "";
            String def2 = "";
            String def11 = "";
            String def22 = "";
            String def111 = "";
            String def222 = "";

            // eleccion de defensas

            System.out.println("Ahora vamos con los defensas");
            if (alineacion1 == 1) { // 4-3-3
                for (i = 0; i < 2; i++) {
                    random = ra.nextInt(2);
                    if (random == 0) {
                        System.out.println(user1 + " escoge un jugador");
                        System.out.println("1. " + gk.getGk());
                        System.out.println("2. " + gk.getGk());
                        elec = sc.nextInt();
                        switch (elec) {
                            case 1:
                                gk1 = gk.getGk();
                                break;
                            case 2:
                                gk1 = gk.getGk();
                                break;
                        }
                    } else if (random == 1) { // cuando haya escogido el otro jugador
                        System.out.println(user2 + " escoge un jugador");
                        System.out.println("1. " + gk.getGk());
                        System.out.println("2. " + gk.getGk());
                        elec = sc.nextInt();
                        switch (elec) {
                            case 1:
                                gk2 = gk.getGk();
                                break;
                            case 2:
                                gk2 = gk.getGk();
                                break;
                        }
                    }
                }
                random = 0; // reset random
            } else if (alineacion1 == 2) { // 4-4-2

            } else if (alineacion1 == 3) {

            }

            System.out.println("Este es el equipo del " + user1);
            System.out.println(gk1 + " " + cap1);
            System.out.println();
            System.out.println("Este es el equipo del " + user2);
            System.out.println(gk2 + " " + cap2);

            sc.close();
        }
    }
}