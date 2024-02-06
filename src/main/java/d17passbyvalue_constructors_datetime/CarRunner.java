package d17passbyvalue_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        // Car class'ından object üretelim

        //String s= new String();
        //s.substring()==> non static

        Car c1=new Car("BMW","3.20",2023,false);//custom
        System.out.println(c1.brand);//Honda
        System.out.println(c1.model);//Accord
        System.out.println(c1.year);
        System.out.println(c1.Hybrid);

        c1.hareket();
        c1.dur();

        Car c2=new Car("Audi","A5",2018,false);
        System.out.println(c2.brand);
        System.out.println(c2.model);
        System.out.println(c2.year);
        System.out.println(c2.Hybrid);

        System.out.println(c1);//Car@6b71769e referance adres
        System.out.println(c2);//Car@2752f6e2 referance adres

        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.Car class sayfasında değişiklik yapıldı.
        //----------------------------------
        Car c3= new Car("Fiat","Şahin");
        System.out.println(c3);



    }
}
