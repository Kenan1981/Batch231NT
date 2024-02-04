package d8stringmanipulations;

import java.util.Scanner;

public class Alistirmalar_CardSifresi_Giris {
    public static void main(String[] args) {

         /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        // örneği do while içinde en fazla 4 deneme şeklinde yaptık

        Scanner input = new Scanner(System.in);

        int deneme = 0;

        do {
            if (deneme >= 4) {
                System.out.println("Kartınız Bloke  Oldu...!");
                break;
            }
            System.out.println("Lütfen Şifrenizi Giriniz:");
            String password = input.nextLine();

            boolean pswKarakter = password.length() > 7;
            boolean spaceHaric = password.replaceAll("[^ ]", "").length() == 0;
            boolean buyukHarf = password.replaceAll("[^A-Z]", "").length() > 0;
            boolean kucukHarf = password.replaceAll("[^a-z]", "").length() > 0;
            boolean rakam = password.replaceAll("[^0-9]", "").length() > 0;

            boolean sonKontrol = pswKarakter && spaceHaric && buyukHarf && kucukHarf && rakam;

            if (sonKontrol) {
                System.out.println("Şifre Geçerli");
                break;
            } else {
                System.out.println("Şifre Geçersiz");
            }
            deneme++;
        } while (true);
        input.close();
    }
}



