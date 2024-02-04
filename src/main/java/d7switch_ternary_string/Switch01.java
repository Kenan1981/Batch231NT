package d7switch_ternary_string;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.

        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ay numarasını giriniz");
        int aySaysisi = input.nextInt();

        switch (aySaysisi) {
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Şubat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayıs");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli bir ay numarası girmediniz");

                /*
                Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz

               switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz
                 */

        }



    }
}
