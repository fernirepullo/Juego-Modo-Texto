package adventuregame;

import java.util.Scanner;

public class Texto {

    Scanner in = new Scanner(System.in);
    Jugador player = new Jugador();
    Enemigos enemy = new Enemigos();

    public Texto(){

    }

    public void instrucciones(){

        System.out.println("\t#### BIENVENIDOS A LA MAZMORRA INFINITA ####\n" +
                "\t \t ## INSTRUCCIONES ##\n" +
                "# Existen tres clases -> Guerrero, Mago y Paladín. \n" +
                "# La clase Guerrero se caracteriza por hacer más daño físico y no tener magias.\n" +
                "# La clase Mago se caracteriza por el uso de la magia y su poco daño físico.\n" +
                "# La clase Paladín es la clase intermedia entre las anteriores.\n" +
                "# En este juego avanzaréis por salas de una mazmorra en la que os encontraréis diversos enemigos, a cada cual más poderoso\n" +
                "# Empezaréis al nivel 1, y subiréis de nivel cuando derrotéis a los enemigos.\n" +
                "# Cada clase tendrá unos objetos característicos, que os aumentarán la vida, el daño o el maná máximo. \n" +
                "# Existen 5 tipos de rarezas: Común, Poco común, Raro, Épico y Legendario. \n" +
                "# Cuanto mayor sea la rareza, más bonificador obtendréis. \n" +
                "# Para obtener objetos debéis de derrotar enemigos. \n" +
                "# Los enemigos derrotados podrán soltar objetos, pociones o ambas. \n" +
                "# Al final de cada mazmora os encontraréis a un jefe final de mazmorra, que será más difícil que los enemigos encontrados. \n" +
                "# Si derrotáis al jefe final, os dará un objeto de rareza Épica o Legendaria. \n" +
                "# Para jugar, deberás introducir el nombre de tu personaje y la clase que deseas jugar. \n" +
                "# Adéntrate en la mazmorra y pásalo bien, si es que puedes... \n" +
                "# ¿Listo para una aventura digna de un héroe? \n" +
                "\t#############################################");
    }

    public void empezar(){

        System.out.println("Introduzca su nombre");
        String nombre = in.nextLine();

        nombre.toUpperCase();

        System.out.println("## CLASES DISPONIBLES ##\n" +
                "# GUERRERO\n" +
                "# MAGO\n" +
                "# PALADIN\n");
        System.out.print("Introduzca la clase que desee jugar: ");
        String clase = in.nextLine();

        clase.toUpperCase();

        while(!clase.equals("GUERRERO") || !clase.equals("MAGO") || !clase.equals("PALADIN")){

            System.out.println("Error, introduzca la clase GUERRERO, MAGO o PALADIN");
            clase = in.nextLine();
        }

        player.setNombre(nombre);
        player.setTipoPersonaje(clase);

    }

    public void apareceEnemigo(){

        System.out.println("\t ## ¡Ha aparecido un " + enemy.getNombreEnemigo() + " ! ## \n" +
                "\t ##ENEMIGO: " + enemy.getNombreEnemigo() +
                " || HP:  " + enemy.getVidaEnemigos() +
                " || NIVEL: " + enemy.getNivel());

    }

}
