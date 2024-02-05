package d16methodcreation_overloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

        int sonuc=toplama(3,7,10,12);
        System.out.println(sonuc);

            /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
    Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

    Varargs, aşağıdaki kurallara tabidir:

    1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
    Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
    main ici toplama(int... a, int... b) olmaz. toplama(int b, int... a) olur
    2- Varargs arka planda Array yapisini kullanir
    3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
    4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
    5- Varargs parametre, sıfır argüman alabilir. main ici toplama(); olabilir*/


    }//main dizisi
   /* public static int toplama(int a,int b){
        return a+b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }*/

public static int toplama(int...a){// 3 nokta koyduğunuzda Java Varargs kabul eder
    int sum =0;
    for(int w:a){
        sum=sum+w;
    }
    return sum;
}

}
