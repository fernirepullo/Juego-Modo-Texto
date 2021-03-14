package adventuregame;

public class Jugador {

    String nombre;

    int experiencia;
    int vidaMax;
    int vidaActual;
    int manaMax;
    int manaActual;
    int expMax;
    int maxDamage;

    public Jugador(){

    }

    public Jugador(String nombre){

        this.nombre = nombre;
    }

    public Jugador(String nombre, int vidaMax, int manaMax){

        this.nombre = nombre;
        this.vidaMax = vidaMax;
        this.manaMax = manaMax;
    }

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

    @Override
    public String toString() {
        return "Nombre del jugador: " + nombre +
                ", vida máxima: " + vidaMax +
                ", maná máximo: " + manaMax;
    }

}
