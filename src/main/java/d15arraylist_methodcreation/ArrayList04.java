package d15arraylist_methodcreation;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {

        /*for each kullandiginizda list'lerde eleman sayisini azaltamazsiniz

Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.

Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */

        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]

        /*  *//* for (String w : r){
            if (w.contains("a")){
                r.remove(w);
            }
        }*//*
        System.out.println(r);*///Hata verdi.....çünkü for-each

        for (int i = 0; i < r.size(); i++) {

            if (r.get(i).contains("a")) {
                r.remove(i);
                i--;//yazmazsak Van ı da alır. çünkü java indexlemeyi yeniler.her seferinde 0 dan başlatır. bu nedenle i-- yaparak i yi azaltırız.
            }
        }
        System.out.println(r);
        //----------------------------------------------------------------
        //Ödev i-- olmayınca Van neden kalıyor. bul.
























    }
}
