package d22oop;

public class AudiRunner {
    public static void main(String[] args) {

        //Motor m = new Motor(); Hata : interface lerde object üretilemez

       AudiA4 a4=new AudiA4();

       a4.eco();//AudiA4 ekonomik motor kullanır
       a4.turbo();//AudiA4 turbo motor kullanır
        a4.esp();//AudiA4 esp fren sistemi kullanır
        a4.gas();//AudiA4 benzinli motor kullanır


    }
}
