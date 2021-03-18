package adventuregame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Enemigos {

    //VARIABLES DE LOS ENEMIGOS
    private String nombreEnemigo;
    private String[] enemigos;
    private String[] jefes;

    //ESTADÍSTICAS DE LOS ENEMIGOS
    private int vidaMax;
    private int vidaMin;
    private int vida;
    private int manaMax;
    private int damageMax;

    //RECOMPENSAS
    private int nivel;
    private int experiencia;
    private int expMax;

    // SETTERS Y GETTERS
    public String getNombreEnemigo() {

        return nombreEnemigo;
    }

    public int getDamageMax() {

        return damageMax;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getManaMax() {

        return manaMax;
    }

    public int getVida() {
        return vida;
    }

    public int getExpMax() {
        return expMax;
    }

    public String[] getEnemigos() {
        return enemigos;
    }

    public String[] getJefes() {
        return jefes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setExpMax(int expMax) {
        this.expMax = expMax;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setManaMax(int manaMax) {

        this.manaMax = manaMax;
    }

    public void setExperiencia(int experiencia) {

        this.experiencia = experiencia;
    }

    public void setDamageMax(int damageMax) {

        this.damageMax = damageMax;
    }

    public void setNombreEnemigo(String nombreEnemigo) {

        this.nombreEnemigo = nombreEnemigo;
    }

    // CONSTRUCTOR POR DEFECTO
    public Enemigos(){

    }

    // EN ESTE MÉTODO SE OBTIENEN LOS ENEMIGOS SEGÚN SU NIVEL
    public String[] getEnemigos(int nivel){

        if (nivel < 0){

            System.out.println("Error, el nivel no puede ser menor de 0");
        }


        if (nivel > 0 && nivel < 4){

            enemigos = new String[]{"Kobold", "Rata gigante", "Serpiente" ,"Perro salvaje" ,"Guerrero"};
        }

        else if (nivel >= 4 && nivel <= 6){

            enemigos = new String[]{"Mono", "Oso negro", "Jabalí", "Drow", "Goblin", "Lobo araña gigante", "Orco", "Caballo de guerra",
                    "Enjambre de insectos", "Worg", "Armadura animada", "Oso Pardo", "Dragon Wyrmling", "Lobo alfa", "Ghoul", "Águila Gigante",
                    "Arpía", "Diablillo", "Yuan-Ti Purasangre"};
        }

        else {

            enemigos = new String[]{"Capitán bandido", "Berserker", "Gárgola", "Cubo gelatinoso", "Oso gigante", "Hipogrifo", "Mímico",
                    "Ogro", "Ogro zombie", "Oso polar", "Escorpión gigante", "Perro infernal",
                    "Capitán Hobgoblin", "Horror", "Caballero", "Mantícora", "Momia", "Pesadillas", "Oso lechuza", "Hombre lobo",
                    "Yeti", "Banshee", "Demonio de las sombras", "Elemental de Tierra", "Golem de carne", "Gigante de la colina",
                    "Troll"};
        }

        return enemigos;
    }


    //SE DEVUELVEN LOS JEFES SEGÚN SU NIVEL
    public String[] listarJefes(int nivel){

        if (nivel < 0){

            System.out.println("Error, el nivel no puede ser inferior a 0");
        }

        else if(nivel > 0 && nivel < 4){

            jefes = new String[]{"Estatua oscura animada", "Asesino del culto", "Exploradores de la tribu" ,"Orco" ,"Araña gigante" ,"Zombies" ,"Yeti"};
        }

        else if (nivel >= 4 && nivel <= 6){

            jefes = new String[]{"Elemental de Aire", "Esqueleto del dragón blanco", "Momia", "Manticora", "Bruja de hielo",
                    "Gigante de la colina", "Golem de carne", "Guerrero Hobgoblin", "Galeb Duhr"};
        }

        else {

            jefes = new String[]{"Oni", "Gigante de piedra", "Dragón negro joven", "Asesino", "Demonio de las cadenas", "Hydra", "Naga",
                    "Gigante de fuego", "Nycaloth", "Yeti abominable", "Demonio de la muerte", "Aboleth"};
        }

        return jefes;
    }


    //MÉTODO TOSTRING()
    @Override
    public String toString() {
        return "Enemigos{" +
                "nombreEnemigo=" + nombreEnemigo +
                ", vidaMax=" + vidaMax +
                ", manaMax=" + manaMax +
                ", damageMax=" + damageMax +
                ", experiencia=" + experiencia +
                '}';
    }

}
