package adventuregame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Operaciones {

    // VARIABLES DE LOS ENEMIGOS
    Enemigos enemies;
    Jugador player;
    Objetos item;
    Magias magic;
    Random random;

    // CONSTRUCTOR POR DEFECTO, INICIANDO LAS VARIABLES.
    public Operaciones(){

        enemies = new Enemigos();
        player = new Jugador();
        item = new Objetos();
        magic = new Magias();

    }

    // MÉTODO PARA DEVOLVER UNA VIDA ALEATORIA ENTRE DOS RANGOS

    public int getVidaAleatoria(int minimoVida, int maximoVida){

        Random random = new Random();
        int vidaEnemigo = 0;

        vidaEnemigo = minimoVida + random.nextInt(maximoVida + 1 - minimoVida);

        return vidaEnemigo;
    }

    // MÉTODO PARA DEVOLVER LA LISTA DE OBJETOS DISPONIBLES SEGÚN LA CLASE

    public String getObjeto(String tipoPersonaje){

        item = new Objetos();
        String[] itemsDisponibles;

        Scanner in = new Scanner(System.in);
        tipoPersonaje = tipoPersonaje.toUpperCase();

        while(!tipoPersonaje.equals("GUERRERO") || !tipoPersonaje.equals("MAGO") || !tipoPersonaje.equals("PALADIN")){

            System.out.println("No existe esa clase");
            System.out.println("Clases disponibles: GUERRERO, MAGO, PALADÍN");
            tipoPersonaje = in.nextLine();

        }

        if (tipoPersonaje.equals("GUERRERO")){

            itemsDisponibles = item.getItemsGue();

        }

        else if (tipoPersonaje.equals("MAGO")){

            itemsDisponibles = item.getItemsMag();

        }

        else if (tipoPersonaje.equals("PALADIN")){

            itemsDisponibles = item.getItemsPal();

        }

        return "";
    }

    // MÉTODO PARA DEVOLVER LAS RAREZAS.

    public String getRareza(){


        return "";
    }

}
