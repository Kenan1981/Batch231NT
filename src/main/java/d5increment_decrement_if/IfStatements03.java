package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Daha fazla durumlu senaryolarda if - else if - else statements kullanilir
        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz");
        int num = input.nextInt();

        if (num>0){
            System.out.println(num  +  " sıfırdan buyuktur");

        } else if (num<0) {
            System.out.println(num  +  " sıfırdan kücüktür");

        } else {
            System.out.println(num  +  " noturdur");

        }





    }
}
