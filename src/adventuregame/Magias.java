package adventuregame;

import java.util.ArrayList;
import java.util.Arrays;

public class Magias {

    ArrayList<String> nombreMagia;
    int costeMagia;
    int curaMax;
    int maxDamage;

    public Magias(){

    }

    public int getCosteMagia() {

        return costeMagia;
    }

    public int getCuraMax() {

        return curaMax;
    }

    public int getMaxDamage() {

        return maxDamage;
    }

    public ArrayList<String> getNombreMagia() {

        return nombreMagia;
    }

    public void setCosteMagia(int costeMagia) {

        this.costeMagia = costeMagia;
    }

    public void setCuraMax(int curaMax) {

        this.curaMax = curaMax;
    }

    public void setNombreMagia(String magiaNueva) {

        nombreMagia.add(magiaNueva);

    }

    public void setMaxDamage(int maxDamage){

        this.maxDamage = maxDamage;
    }

    public void iniciarMagias(){

        nombreMagia.add("PYRO");
        nombreMagia.add("CRYO");
        nombreMagia.add("ELECTRO");
        nombreMagia.add("HEAL");
    }

    public void valoresMagias(String nombreMagia){

        nombreMagia = nombreMagia.toUpperCase();

        if (nombreMagia.equals("PYRO")){

            setCosteMagia(50);
            setMaxDamage(35);
        }

        else if(nombreMagia.equals("CRYO")){

            setCosteMagia(30);
            setMaxDamage(26);
        }

        else if(nombreMagia.equals("ELECTRO")){

            setCosteMagia(40);
            setMaxDamage(32);
        }

        else if(nombreMagia.equals("HEAL")){

            setCosteMagia(25);
            setCuraMax(35);
        }

        else{

            System.out.println("La magia no se encuentra disponible.");
        }
    }

    @Override
    public String toString() {
        return "Magias{" +
                "nombreMagia=" + nombreMagia.toString() +
                ", costeMagia='" + costeMagia + '\'' +
                ", curaMax='" + curaMax + '\'' +
                ", maxDamage='" + maxDamage + '\'' +
                '}';
    }
}
