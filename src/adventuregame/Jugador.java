package adventuregame;

import java.util.Scanner;
public class Jugador {

    //Declaración del jugador

    String nombre;

    //Variables del personaje

    int vidaMax;
    int vidaActual;
    int manaMax;
    int manaActual;
    int maxDamage;
    int experiencia;
    int expMax;
    int nivel;

    //Constructor

    public Jugador(){

    }

    public Jugador(String nombre, String tipoPersonaje){

        this.nombre = nombre;

        if (tipoPersonaje.equals("GUERRERO")){

            setManaMax(50);
            setManaActual(50);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(150);
            setVidaActual(150);
            setMaxDamage(45);
            setNivel(1);
        }

        else if(tipoPersonaje.equals("MAGO")){

            setManaMax(150);
            setManaActual(150);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(80);
            setVidaActual(80);
            setMaxDamage(20);
            setNivel(1);

        }

        else {

            setManaMax(80);
            setManaActual(80);
            setExpMax(100);
            setExperiencia(0);
            setVidaMax(120);
            setVidaActual(120);
            setMaxDamage(33);
            setNivel(1);

        }
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

    public void setMaxDamage(int maxDamage) {

        this.maxDamage = maxDamage;
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

    public void subirNivel(){

        if(experiencia == expMax){

            this.nivel++;
            this.experiencia = 0;
            this.expMax = this.expMax + 150;
        }

        else if(experiencia > expMax){

            this.nivel++;
            this.experiencia = this.expMax - this.experiencia;
            this.expMax = this.expMax + 150;

        }

    }

    @Override
    public String toString() {

        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", vidaMax=" + vidaMax +
                ", vidaActual=" + vidaActual +
                ", manaMax=" + manaMax +
                ", manaActual=" + manaActual +
                ", maxDamage=" + maxDamage +
                ", expMax=" + expMax +
                ", experiencia=" + experiencia +
                ", nivel=" + nivel +
                '}';
    }
}
