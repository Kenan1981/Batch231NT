package d25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //İnterwiev Sorusu//Meşhur
        //ornek 1: Size verilen bir String’deki her kelimenin, o String’de kac defa kullanildigini
        // gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali.==> Ali 1 kere gözüktü, diğeri Ali.
        //ali=2,nsailsin=1==> map yapisi

        String s = "Ali nasilsin Ali.";
        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s);//ali nasilsin ali

        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();// Bu map'i döngü ile dolduracağız
        System.out.println(myMap);//{}

        for (String w : kelimeler) {

            Integer gorunum = myMap.get(w);

            if (gorunum == null) {
                myMap.put(w, 1);//map'te yoksa w'dan yani ali den bir tane koy
            } else {
                myMap.put(w, gorunum + 1);
            }
        }
        System.out.println(myMap);//{nasilsin=1, ali=2}

        //-------------------------ODEV
        //ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //           “Hello” ==> H=1, e=1, l=2, o=1

        String ss="Hello";
        String []harfler= ss.split("");

        HashMap<String ,Integer>myHarfler=new HashMap<>();

        for (String f:harfler){
            Integer durum=myHarfler.get(f);
            if (durum==null){
                myHarfler.put(f,1);
            }else {
                myHarfler.put(f,durum+1);
            }
        }
        System.out.println(myHarfler);
        System.out.println("----------------------");


    }
}
