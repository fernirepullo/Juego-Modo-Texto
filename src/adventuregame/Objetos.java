package adventuregame;

import java.util.Arrays;

public class Objetos {

    String[] itemsGue;
    String[] itemsMag;
    String[] itemsPal;
    String[] rareza;

    // SE AÑADEN LOS OBJETOS AL LLAMAR AL CONSTRUCTOR

    public Objetos(){

        itemsGue = new String[]{"Casco", "Peto", "Guantes", "Hombreras", "Pantalón",
                                "Botas", "Espada", "Hacha", "Escudo"};
        itemsMag = new String[]{"Sombrero", "Capa", "Guantes", "Anillo", "Pantalón",
                "Botas", "Báculo", "Libro de Hechizos", "Orbe"};

        itemsPal = new String[]{"Casco", "Peto", "Guantes", "Anillo", "Pantalón",
                "Martillo", "Espada", "Escudo"};

        rareza = new String[]{"Común", "Infrecuente", "Raro", "Épico", "Legendario"};

    }

    //GETTERS

    public String[] getItemsGue() {
        return itemsGue;
    }

    public String[] getItemsMag() {
        return itemsMag;
    }

    public String[] getItemsPal() {
        return itemsPal;
    }

    public String[] getRareza() {
        return rareza;
    }


    // MÉTODO TOSTRING()
    @Override
    public String toString() {
        return "Objetos{" +
                "itemsGue=" + Arrays.toString(itemsGue) +
                ", itemsMag=" + Arrays.toString(itemsMag) +
                ", itemsPal=" + Arrays.toString(itemsPal) +
                ", rareza=" + Arrays.toString(rareza) +
                '}';
    }
}
