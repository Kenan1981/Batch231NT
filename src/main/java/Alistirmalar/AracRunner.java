package Alistirmalar;

public class AracRunner {
    public static void main(String[] args) {



        Arac yeniModel=new Arac("Honda","Civik",2003,true);
        System.out.println(yeniModel.marka);
        System.out.println(yeniModel.model);
        System.out.println(yeniModel.yil);
        System.out.println(yeniModel.Hybred);

        yeniModel.hareket();
        yeniModel.dur();
    }


}
