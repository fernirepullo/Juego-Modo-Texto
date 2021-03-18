package adventuregame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Operaciones {

    Enemigos enemies;
    Jugador player;
    Objetos item;
    Magias magic;
    Random random;

    public Operaciones(){

        enemies = new Enemigos();
        player = new Jugador();
        item = new Objetos();
        magic = new Magias();

    }

    // Método para devolver un valor aleatorio para la vida entre un rango de vidas disponibles

    public int getVidaAleatoria(int minimoVida, int maximoVida){

        Random random = new Random();
        int vidaEnemigo = 0;

        vidaEnemigo = minimoVida + random.nextInt(maximoVida + 1 - minimoVida);

        return vidaEnemigo;
    }

    public String getObjeto(String tipoPersonaje){

        Scanner in = new Scanner(System.in);
        tipoPersonaje = tipoPersonaje.toUpperCase();

        while(!tipoPersonaje.equals("GUERRERO") || !tipoPersonaje.equals("MAGO") || !tipoPersonaje.equals("PALADIN")){

            System.out.println("No existe esa clase");
            System.out.println("Clases disponibles: GUERRERO, MAGO, PALADÍN");
            tipoPersonaje = in.nextLine();

        }

        if (tipoPersonaje.equals("GUERRERO")){

        }

        else if (tipoPersonaje.equals("MAGO")){

        }

        else if (tipoPersonaje.equals("PALADIN")){

        }

        return "";
    }

    public String getRareza(){


        return "";
    }

}
