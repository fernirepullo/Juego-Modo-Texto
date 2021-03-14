package adventuregame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Enemigos {

    String nombreEnemigo;
    ArrayList<Enemigos> listaEnemigos;
    int vidaMax;
    int manaMax;
    int damageMax;
    int experiencia;


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

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
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

    public Enemigos(){

    }


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
