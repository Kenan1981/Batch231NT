package Hastane_Projesi;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Hastane extends VeriBankasi {
    private Doktor doktor;
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }


}

