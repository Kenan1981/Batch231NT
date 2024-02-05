package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
                    /*
            Polymorphism:
            Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

            OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
            Polymorphism (cok bicimlilik) demektir.
            Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
                    */

        // i.Method Overloading - Asiri Yukleme

         String s="Java";


        //s.substring(int beginindex)               ==> tek parametre alıyor
        //s.substring(int beginIndex,int endIndex)  ==> iki parametre alıyor
        //----------------------------------------------------------------------

        /* Method Overloading'de sadece parametreler degistirilir.
           Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

        Method Overloading icin;
        a) Parametre sayisini degistirebilirsiniz.
        b) Parametre data tiplerini degistirebilirsiniz.
        c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
        d)Method overloading olustururken return type'in, access modifier'in,
           static veya non-static olmanin hicbir etkisi yoktur.
   */

        //Ornek
        add(3, 5);//add overload oldu. birincide parametreler int,ikincide parametreler double


    }//main dışı

    //ornek : Toplama islemi yapan bir method
    //olusturun ve sonra da overload edin
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b, double c) {
        System.out.println(a + b);

                //Auto Widening - otomatik genisletme
        //Kucuk veri tipinden buyuk veri tipine cevirme.Java otomatik yapar.
        //Explicit Narrowing (Aciktan Daraltma)
        //Buyuk veri tipinden kucuk veri tipine cevirme.
        //Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar
        //-------------------------------------------------------------------------------------------
        /*interwiev soruları
        Soru 1: private method'lar overload edilebilir mi?

        Cevap 1: private method'lar overload edilebilirler cunku;
        overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
        ulasilabilir oldugundan overload'a engel degildir.

        Soru 2: static method'lar overload edilebilir mi?
        Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
        */



    }


}
