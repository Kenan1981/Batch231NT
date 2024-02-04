package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis
        yazdiriniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Giriniz");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Geçerli Bir Yaş Giriniz");

        } else if (age < 5) {
            System.out.println("bebek");

        } else if (age < 13) {
            System.out.println("çocuk");

        } else if (age < 21) {
            System.out.println("genç");

        } else if (age < 31) {
            System.out.println("yetişkin");

        } else {
            System.out.println("Hurdalık-yaşlılar");

        }


    }
}
