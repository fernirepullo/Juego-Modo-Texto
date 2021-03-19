package adventuregame;

import java.util.Scanner;

public class Jugador {

    //Declaración del jugador

    String nombre;
    String tipoPersonaje;

    //Variables del personaje

    int vidaMax;
    int vidaActual;
    int manaMax;
    int manaActual;
    int maxDamage;
    int experiencia;
    int expMax;
    int nivel;
    int numPociones;
    int curaPocion = 30;

    //Constructor

    public Jugador(){

    }

    // CONSTRUCTOR CON PARÁMETROS DE NOMBRE Y CLASE DEL PERSONAJE

    public Jugador(String nombre, String tipoPersonaje){

        this.nombre = nombre.toUpperCase();


        while (!tipoPersonaje.equals("GUERRERO") || !tipoPersonaje.equals("MAGO") || !tipoPersonaje.equals("PALADIN")){

            System.out.println("Las clases solo pueden ser: GUERRERO, MAGO, PALADIN");

        }

        this.tipoPersonaje = tipoPersonaje.toUpperCase();

        setTipoPersonaje(tipoPersonaje);

    }

    //Getters y Setters

    public int getMaxDamage() {

        return maxDamage;
    }

    public int getExperiencia() {

        return experiencia;
    }

    public int getExpMax() {

        return expMax;
    }

    public int getManaActual() {

        return manaActual;
    }

    public int getManaMax() {

        return manaMax;
    }

    public int getVidaActual() {

        return vidaActual;
    }

    public int getVidaMax() {

        return vidaMax;
    }

    public String getNombre() {

        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getNumPociones() {
        return numPociones;
    }

    public int getCuraPocion() {
        return curaPocion;
    }

    public void setCuraPocion(int curaPocion) {
        this.curaPocion = curaPocion;
    }

    public void setNumPociones(int numPociones) {
        this.numPociones = numPociones;
    }

    public void setMaxDamage(int maxDamage) {

        this.maxDamage = maxDamage;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    // EN ESTE SETTER SE INICIALIZAN LOS VALORES DEL PERSONAJE SEGÚN SU CLASE

    public void setTipoPersonaje(String tipoPersonaje) {


        if (tipoPersonaje.equals("GUERRERO")){


            setManaMax(50);
            setManaActual(50);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(150);
            setVidaActual(150);
            setMaxDamage(45);
            setNivel(1);
            setNumPociones(2);
        }

        else if(tipoPersonaje.equals("MAGO")){

            setTipoPersonaje(tipoPersonaje);
            setManaMax(150);
            setManaActual(150);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(80);
            setVidaActual(80);
            setMaxDamage(20);
            setNivel(1);
            setNumPociones(1);

        }

        else if (tipoPersonaje.equals("PALADIN")) {

            setTipoPersonaje(tipoPersonaje);
            setManaMax(80);
            setManaActual(80);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(120);
            setVidaActual(120);
            setMaxDamage(33);
            setNivel(1);
            setNumPociones(3);
        }

    }

    public void setExperiencia(int experiencia) {

        this.experiencia = experiencia;
    }

    public void setExpMax(int expMax) {

        this.expMax = expMax;
    }

    public void setManaActual(int manaActual) {

        this.manaActual = manaActual;
    }

    public void setManaMax(int manaMax) {

        this.manaMax = manaMax;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setVidaActual(int vidaActual) {

        this.vidaActual = vidaActual;
    }

    public void setVidaMax(int vidaMax) {

        this.vidaMax = vidaMax;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    //SUBIDA DE NIVEL, AUMENTAN LOS VALORES DE MANERA DIFERENTE PARA CADA CLASE

    public void subirNivel(){

        if(experiencia == expMax){

            this.nivel++;
            this.experiencia = 0;
            this.expMax = this.expMax + 200;

            if (getTipoPersonaje().equals("GUERRERO")){

                setVidaMax(getVidaMax() + 30);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 8);
                setManaMax(getManaMax() + 10);
                setManaActual(getManaMax());

            }

            else if (getTipoPersonaje().equals("MAGO")){

                setVidaMax(getVidaMax() + 20);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 4);
                setManaMax(getManaMax() + 25);
                setManaActual(getManaMax());


            }

            else {

                setVidaMax(getVidaMax() + 25);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 6);
                setManaMax(getManaMax() + 18);
                setManaActual(getManaMax());

            }
        }

        else if (experiencia > expMax){

            this.nivel++;
            this.experiencia = this.expMax - this.experiencia;
            this.expMax = this.expMax + 150;

            if (getTipoPersonaje().equals("GUERRERO")){

                setVidaMax(getVidaMax() + 30);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 8);
                setManaMax(getManaMax() + 10);
                setManaActual(getManaMax());
            }

            else if (getTipoPersonaje().equals("MAGO")){

                setVidaMax(getVidaMax() + 20);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 4);
                setManaMax(getManaMax() + 25);
                setManaActual(getManaMax());

            }

            else {

                setVidaMax(getVidaMax() + 25);
                setNivel(getNivel() + 1);
                setVidaActual(getVidaMax());
                setMaxDamage(getMaxDamage() + 6);
                setManaMax(getManaMax() + 18);
                setManaActual(getManaMax());
            }

        }

    }


    //MÉTODO TO STRING()
    @Override
    public String toString() {
        return "\t #### Jugador ####" +
                "## Nombre del jugador: " + nombre + "## \n" +
                "## Clase del personaje: " + tipoPersonaje + "\n" +
                "## Vida máxima inicial: " + vidaMax +
                "## Vida actual: " + vidaActual +
                "## Maná máximo inicial: " + manaMax +
                "## Maná actual: " + manaActual +
                "## Daño base: " + maxDamage +
                "## Experiencia actual: " + experiencia +
                "## Experiencia máxima: " + expMax +
                "## Nivel del personaje: " + nivel +
                "########";
    }
}
