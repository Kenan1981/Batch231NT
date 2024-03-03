package d30Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda09 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        // eHaric(myList);//Ali Yusuf Zeynep Mustafa
        //bestenAzTekrarsiz(myList);//Ali Elif
        //List<String> donusList = bestenBuyuk(myList);//return olunca bu şekilde yapılır
        //System.out.println(donusList);//[ZEYNEP, MUSTAFA]
       // bestenKucuk(myList);//ali elif
        //tekrarsizBuyukAlfabetik(myList);
        kucuktenBuyuge(myList);//ali elif yusuf zeynep mustafa

    }//main disi

    //ornek 9: Bir List’teki E ile baslayanlar haric tum elemanlari
// console’a yazdiran method’u olusturunuz.
    public static void eHaric(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    //ornek 10: Bir List’te karakter sayisi 5’den az olan tum elemanlari
    // tekrarsiz olarak console’a yazdiran method’u olusturunuz
    public static void bestenAzTekrarsiz(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(t -> System.out.print(t + " "));
    }

    //ornek 11: Bir List’teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method’u olusturunuz
    //collect(Collectors.toList()) - Java'nın Stream API'sindeki bir işlemdir.
    // Bu işlem, bir stream'de işlenmiş olan elemanları bir listeye toplar.
    public static List<String> bestenBuyuk(List<String> myList) {
        //return myList.stream().filter(t->t.length()>5).map(String::toUpperCase).collect(Collectors.toList());
        return myList.stream().filter(t -> t.length() > 5).map(t -> t.toUpperCase()).collect(Collectors.toList());
    }

    //ornek 12: Bir List'teki karakter sayisi 5’den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.
    public static void bestenKucuk(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(String::toLowerCase).// map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }

    //ornek 13: Bir List’teki elemanlari tekrarsiz olarak, buyuk harflerle, alfabetik sirada
// console’a yazdiran method’u olusturunuz.

    public static void tekrarsizBuyukAlfabetik(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t-> System.out.println(t+" "));
    }
    //ornek 14: Bir List’teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore
    // kucukten buyuge siralayarak console’a yazdiran method’u olusturunuz.

    //Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
    // belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

    //sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına

    // göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
    // sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.
    public static void kucuktenBuyuge(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).//sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
    }

}
