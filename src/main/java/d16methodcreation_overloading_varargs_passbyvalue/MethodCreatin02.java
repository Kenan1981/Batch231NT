package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreatin02 {
    public static void main(String[] args) {


        //Ornek-1 Çalıştırma
        int sonuc1=carpma(3,5);
        System.out.println("Sonuc ="+sonuc1);


        //Ornek 2 calıstırma
        int sonuc2=carpTopla(4,4,2);
        System.out.println(sonuc2);

        //Ornek-3 Çalıştırma
        yaz("Ali Can");


    }//main dışı
    //ornek 1: Iki sayiyi carpan bir method olusturunuz

    //protected: Bu class'tan erisilebilir.
    //Bir de sadece miras alinan class'lardan erisilebilir(extends)
    protected static  int carpma(int a,int b){
        return a*b;


    }
    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz

    //private : Buraya sadece ayni class icerisinden erisilebilir.
    //Diger class'lar erisemez

    private static int carpTopla(int a,int b,int c){
        return a*b+c;
    }

//ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
//Eger bir method yeni bir data uretmiyor ise return type’i void olur
//void ise return yazilmaz

    public static void yaz(String str){
        System.out.println(str); // "Ali Can"
    }




}
