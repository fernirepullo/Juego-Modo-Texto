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

        nombreMagia.add("Pyro");
        nombreMagia.add("Cryo");
        nombreMagia.add("Electro");
        nombreMagia.add("Heal");

        return nombreMagia;
    }

    public void setCosteMagia(int costeMagia) {

        this.costeMagia = costeMagia;
    }

    public void setCuraMax(int curaMax) {

        this.curaMax = curaMax;
    }

    public void setMaxDamage(int maxDamage) {

        this.maxDamage = maxDamage;
    }

    public void setNombreMagia(String magiaNueva) {

        nombreMagia.add(magiaNueva);

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
