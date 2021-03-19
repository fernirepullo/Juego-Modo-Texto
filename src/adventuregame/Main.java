package adventuregame;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Jugador player;
        Enemigos enemies = new Enemigos();
        Texto t = new Texto();
        Objetos items = new Objetos();
        Magias magic = new Magias();
        Operaciones op = new Operaciones();

        Random random = new Random();
        boolean running = true;
        String[] enemigosDisponibles;
        String nombreEnemigo;
        int vidaEnemigo;


        GAME:
        while (running){

            t.instrucciones();
            t.empezar();


            enemigosDisponibles = enemies.getEnemigos(1);
            nombreEnemigo = enemigosDisponibles[random.nextInt(enemigosDisponibles.length)];
            vidaEnemigo = random.nextInt(enemies.getVidaEnemigos());


        }

    }
}
