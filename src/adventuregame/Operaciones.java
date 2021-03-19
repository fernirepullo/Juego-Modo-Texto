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

    }

    // MÉTODO PARA DEVOLVER UNA VIDA ALEATORIA ENTRE DOS RANGOS

    public int getVidaAleatoria(int minimoVida, int maximoVida){

        Random random = new Random();
        int vidaEnemigo = 0;

        vidaEnemigo = minimoVida + random.nextInt(maximoVida + 1 - minimoVida);

        return vidaEnemigo;
    }

    // MÉTODO PARA DEVOLVER UN OBJETO ALEATORIO DE LA CLASE ELEGIDA

    public String getObjetoAleatorio(){

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        item = new Objetos();

        String[] itemsDisponibles = new String[]{};
        int indice;
        String tipoPersonaje;

        tipoPersonaje = player.getTipoPersonaje();
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

        indice = random.nextInt(10);

        return itemsDisponibles[indice];
    }

    // MÉTODO PARA DEVOLVER UNA RAREZA ALEATORIA.

    public String getRareza(){

        Random random = new Random();

        item = new Objetos();
        int indice;

        indice = random.nextInt(6);

        return item.getRareza()[indice];
    }

}
