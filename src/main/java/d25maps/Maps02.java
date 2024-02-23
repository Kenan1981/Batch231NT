package d25maps;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        //Key'i tekrarlı kulladığımızda hata vermiyordu ama bu şekilde yapmak best praktice değildir.
        stdAges.put("Tom", 35);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}
        //---------------------------------------------------------------------------
        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu eski deger kontrolu yaparak ta calisir

        stdAges.replace("Tom", 21, 45);//Değişiklik olmaz çünkü eski değeri 21 değil.
        stdAges.replace("Tom", 39, 45);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18} değiştirir
        System.out.println(stdAges);//Eski değer 39
        //-----------------------------------------------
        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges);//eklemez. çünkü key olan Tom Map te var.77 eklenmez

        stdAges.putIfAbsent("Ayşe", 23);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18} ayşe key' yok. ekler

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir

        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom", 18));//45

        System.out.println(stdAges.get("Jeryy"));//null get map te key yoksa null döner
        System.out.println(stdAges.getOrDefault("Jeryy", -1));//Jeryy map te yok default deger geldi

        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        //{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}

        Boolean b = stdAges.containsValue(19);
        System.out.println(b);//true

        System.out.println(stdAges.containsValue(99));//false

        System.out.println(stdAges.containsKey("TOM"));//false

        System.out.println(stdAges.containsKey("Tom"));//true

        //-----------------------Büyük küçük harf duyarlılığını ortadan kaldırma
        Map<String, Integer> stdAges2 = new HashMap<>();

        stdAges2.put("Tom".toLowerCase(), 25);
        stdAges2.put("Jeryy".toLowerCase(), 22);

        System.out.println(stdAges2);//{jeryy=22, tom=25}

        boolean cki = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(cki);//true

        //6)remove(“Tom”); methodu key kullanarak entry silmeye yarar

        //{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}
        stdAges.remove("Tom");
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Veli=63, Ali=18} tom ve value si silindi

        //remove(“Can”,19); methodu hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez

        stdAges.remove("Can",18);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Veli=63, Ali=18} silmedi. Can = 19 yazsaydık silerdi

        stdAges.remove("Can",19);
        System.out.println(stdAges);//{Ahmet=41, Ayşe=23, Veli=63, Ali=18}  Can  silindi




    }
}
