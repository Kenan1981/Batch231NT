package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.
    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/
        // Array oluşturmak
        String[] stdNames1=new String[3];  // tercih edilen. arrays lar class değildir. obje dir.
      //  String stdNames2[] = new String[4];

        System.out.println(stdNames1);//@1b0375b3 heap teki adres.
        //Arrays yardımcı class ı kullanır

        System.out.println(Arrays.toString(stdNames1));//null,null,null

//ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar));//0,0,0,0,0

        //ornek: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        Integer[] integer = new Integer[10];
        System.out.println(Arrays.toString(integer));

        //ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz


        String[] isimler= new String[3];
        System.out.println(Arrays.toString(isimler));

        // Array'a eleman eklemek

        isimler[0]="AliCan";
        isimler[2]="Veli Han";
        isimler[1]="Ayse Hanım";
        //isimler[3]="Hasan Kaya"; Hata - bu index yok
        //isimle[0]="Ömer"; Hata vermez. üzerine yazar

        System.out.println(Arrays.toString(isimler));

        // Birveriyi görmek için ise;

        System.out.println(isimler[1]);//Ayse Hanım

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.
        String[] cities = new String[5];

        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        System.out.println(Arrays.toString(cities)); //[Bayburt, Sivas, Denizli, Adana, Ankara]
        //1.yol for-loop
        int totalChar=0;

        for (int i = 0; i <cities.length ; i++) {
            //Bu length field dir. Alan okuması yapar

            totalChar=totalChar+cities[i].length();
            //Bu Length() methoddur. Stringe uygulanır. Dinamiktir.
        }
        System.out.println(totalChar);

        //----------------
        // 2.Yol :
        //for each loop:
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir

       /* for (DataType varible: array yada collections){
        calısacak kodlar
        }*/

        int sum = 0;

        for(String w : cities){
            sum=sum+w.length();

        }
        System.out.println(sum);




        








    }
}
