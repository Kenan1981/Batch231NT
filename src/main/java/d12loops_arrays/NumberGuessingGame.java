package d12loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        // Scanner ve Random class'larından object üretelim
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0 ile 100 arasında rastgele sayı üretelim

        int rastgele = random.nextInt(19,101); //20 ile 100 arası nasıl secilir...Ödev...

        //kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayaç oluşturalım.

        int denemeSayisi = 0;

        // Kullanıcının yaptığı tahmini saklamak için bir değişken oluşturalım.
        int tahminEdilen;

        //Kullanıcının sayıyı doğru tahmin edip etmediğini kontrol etmek için boolean değişken oluşturalım
        boolean tahminDogrumu = false;

        // Oyunun açıklamasını yazdıralım

        System.out.println("0 ile 100 arasında bir sayıyı tahmin etmeye çalışın");

        // Doğru tahmin yapılıncıya kadar döngüyü devam ettirelim

        do {
        // Kullanıcıdan bir tahmin alalım
            System.out.println("Tahmininizi yapınız");
            tahminEdilen= scanner.nextInt();
        // Sayacı bir artıralım
        denemeSayisi++;

        if (tahminEdilen<rastgele){
            System.out.println("Sayi daha büyük");// Sayı kullanıcının tahmininden büyükse ipucu verdik

        } else if (tahminEdilen>rastgele) {
            System.out.println("Sayi daha küçük");

        }else {tahminDogrumu = true;
            System.out.println("Tebrikler doğru tahmin");
            System.out.println("Deneme Sayisi: "+denemeSayisi);

        }

        }while (!tahminDogrumu);//ünlem tersini verir.false verirse true olur. sonsuz döngü.başlangıçta true yazılamaz çünkü cevabı hemen doğru kabul eder
scanner.close();// Açtığınız kaynakları kapatır. bu olay iyi bir programlama pratiğidir.




    }
}
