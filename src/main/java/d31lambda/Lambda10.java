package d31lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda10 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("AliX");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //removeIfLenghtGreaterThanFive(myList);//[Ali, Elif, Yusuf, Elif]
        //removeIfElementsStartsWithZorEndsWithF(myList);//[Ali, Mustafa]
        //removeIfElementsStartsWithZorEndsWithF2(myList);//[Ali, Mustafa]
        removeIfelementsContainsX(myList);//[Elif, Yusuf, Elif, Zeynep, Mustafa]
    }//main disi
    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
    // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
    // stream kullanilmadan cagirilir
    public static void removeIfLenghtGreaterThanFive(List<String> myList) {
        myList.
                removeIf(t -> t.length() > 5);
        System.out.println(myList);
    }
//2 ) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.

    //1. yol
    public static void removeIfElementsStartsWithZorEndsWithF(List<String> myList) {
        myList.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList);
    }

    //2.yol
    public static void removeIfElementsStartsWithZorEndsWithF2(List<String> myList) {

        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }
    //3.   “X” karakteri iceren elemanları silen bir method oluşturun.
    public static void removeIfelementsContainsX(List<String> myList){
        myList.removeIf(t->t.contains("X"));
        System.out.println(myList);
    }

}
