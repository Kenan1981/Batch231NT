package d9string_loops;

public class StringManipulations02 {
    public static void main(String[] args) {

        //lastIndexOf() method’u spesifik bir karakterin son gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        //Ornek 1: Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        //   yusuf
        // yanyana yazması için pirinln yerine print kullanılır

        //indexof("u") ==> 1
        //lastindexof("u")==> 3 farklı tekrarlı

        //indexOf("y") ==>0
        //lastIndexOf("y") ==>0 aynı yani tekrasız

        String s = "yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.print("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.print("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.print("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.print("f");
        }
        System.out.println();


        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";

        String first = cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);

        String last = cardNum.substring(15);
        System.out.println(last);

        String result1 = first + last; // birleştirmenin 1. yolu
        System.out.println(result1);

        String result2 = first.concat(last); // birleştirmenin 2. yolu
        System.out.println(result2);



    }
}
