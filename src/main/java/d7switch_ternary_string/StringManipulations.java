package d7switch_ternary_string;

public class StringManipulations {
    public static void main(String[] args) {

        //String Data Tipi (Class)
        //String: String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: “s” String’inde kullanilan karakter sayisini bulunuz.

        String s = "Java is easyai";

        //length() methodu String’in uzunlugunu dondurur.1’den basla

        int slenght = s.length();
        System.out.println(slenght);

        System.out.println("--------------");


        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.

        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.


        char firstCahr = s.charAt(0);
        System.out.println("firstCahr = " + firstCahr);

        char lastChar = s.charAt(11);                   // static kod. 11. indekse gider
        System.out.println("lastChar = " + lastChar);

        char lastChar2 = s.charAt(s.length()-1);        // dinamik kod. son indekse gider
        System.out.println("lastChar2 = " + lastChar2);




        //Ornek 3: “s” String’indeki ilk 4 karakteri aliniz.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring’i döndürür.
        //substring(0, 4) ==> “0" yani ilk index dahil, “4” yani ikinci index haric dir. [0,4)













    }
}
