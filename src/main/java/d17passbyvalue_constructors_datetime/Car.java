package d17passbyvalue_constructors_datetime;

import d3datatypes_concat_operators.Variables02;

public class Car {
    // OOP-object-1-Pasif,2-Aktif

        /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
        2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
    main methodu oluşturmanız gerekebilir.
        3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
    Adina da "runner" eklenir.*/

    //1.Variable'lar oluşturalım (Pasif özellikler)

    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean Hybrid = true;

    //2.method'lar oluşturaqlım (Aktif özellikler)
    public void hareket() {
        System.out.println(brand + " Hızlı hareket eder");
    }

    public void dur() {
        System.out.println(brand + " Güveli bir şekilde durur");
    }
    /*
    Constructor nedir?

    Classtan object olusturmamizi saglayan bolumdur.
    Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
    Bu constructor'lara "default constructor" denir.
    default constructor ===> Car () */

    //Ama car class'i bize hep ayni degerleri gonderir. Bu class'i kullanip farkli degerler olusturabiliriz.
    //Kendiniz constructor'inizi olusturdugunuz zaman Java default constructor'i siler

    //Constructor (custom - parametreli) nasil olusturulur?

    //Access Modifier + Class ismi + () + {}

   //--interwiev sorusu
    /*Method ile Constructor arasindaki fark nedir?

    1)Methodlarda return type olur, constructor'larda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz*/

    public Car(String brand,String model,int year,boolean Hybrid){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.Hybrid=Hybrid;

    }
    public Car(String brand,String model){
        this.brand=brand;
        this.model=model;

    }
    //Constructor oluşturmanın kısa yolu var
    //sağ tık>>Generate>>ctrl ile seç>>ok

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    //toString Methodu oluşturacağız
    //sağ tık>> Generate>>toString>>istediğin değişkenleri seç>>ok


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", Hybrid=" + Hybrid +
                '}';
    }
}
