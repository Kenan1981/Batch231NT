package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/

        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı ve Soyadınızı Giriniz");
        String fullName = input.nextLine();        //nextline methodu ile birden fazla kelime girdisi  alınır

        System.out.println("Yaşınızı giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu giriniz");
        short Weight = input.nextShort();

        System.out.println("Medeni Durumunuzu Giriniz");
        String maritalStatus=input.next(); // next() methodu kullanıcıdan tek kelimeli string almak için kullanılır
        //kullanıcı bilgilerini konsala yazdıralım
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("Weight = " + Weight);
        System.out.println("maritalStatus = " + maritalStatus);

        //Ödev : nextline methodunun birşey girmeden enter la geçmesini Do,While ile düzeltiniz




    }
}
