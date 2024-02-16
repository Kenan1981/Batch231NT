package d23oop_collections;

import d22oop.AudiS5;

public class AudiRunner {
    public static void main(String[] args) {

        //Motor m = new Motor(); Hata : interface lerde object üretilemez

       AudiA4 a4=new AudiA4();

       a4.eco();//AudiA4 ekonomik motor kullanır
       a4.turbo();//AudiA4 turbo motor kullanır
        a4.esp();//AudiA4 esp fren sistemi kullanır
        a4.gas();//AudiA4 benzinli motor kullanır
        a4.analog();
//--------------------------------------------------------
        System.out.println("---------------------");
        AudiS5 s5=new AudiS5();

        s5.turbo();
        s5.abs();
        s5.dijital();
        s5.esp();
        s5.analog();
        s5.gas();

      //  a4.run();//Audi A4 hava yastigi calistirir
        ((Motor)a4).run();//motor interface'inden gelen run calisti

      //  Motor.fiyat=5000;//final ispati.yeni deger atayamam

        System.out.println(Motor.fiyat);//300
        System.out.println(Klima.fiyat);//200
        System.out.println(Fren.fiyat);//100

        Motor.hiz();//Saatte 250km -->static
        a4.guc();//200HP ---->non-static. ikiside motor interface te. ancak non-staticleri class tan, static ise interfaceten alınır
        //interface lerde obje üretilemez. bu yüzden child olan clas üzerinden alınır.




    }
}
