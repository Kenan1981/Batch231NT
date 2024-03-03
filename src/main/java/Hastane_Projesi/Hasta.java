package Hastane_Projesi;

public class Hasta {
    private String hastaIsim;
    private String hastaSoyIsim;
    private int hastaID;
    private Durum hastaDurumu;

    public String getHastaIsim() {
        return hastaIsim;
    }

    public void setHastaIsim(String hastaIsim) {
        this.hastaIsim = hastaIsim;
    }

    public String getHastaSoyIsim() {
        return hastaSoyIsim;
    }

    public void setHastaSoyIsim(String hastaSoyIsim) {
        this.hastaSoyIsim = hastaSoyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public Durum getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
