package Alistirmalar;

public class Arac {
    String marka="Honda";
    String model="Civik";
    int yil=2003;
    boolean Hybred=true;


    public void dur(){
        System.out.println("Dur durabilirsen");
    }
    public void hareket(){
        System.out.println("Bas gaza");
    }
    public Arac(String marka,String model,int yil,boolean Hybred){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.Hybred=Hybred;
    }



















}
