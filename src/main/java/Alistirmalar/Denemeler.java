package Alistirmalar;


import java.util.*;

public class Denemeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Lütfen Bir Sayı Giriniz (Çıkmak için -1):");
            int sayi1 = input.nextInt();
            if (sayi1 == -1) {
                System.out.println("Programdan çıkılıyor...");
                break; // Kullanıcı -1 girdiğinde döngüyü kır ve programdan çık
            }

            System.out.println("Lütfen İkinci Sayıyı Giriniz:");
            int sayi2 = input.nextInt();

            System.out.println("Lütfen bir işlem seçiniz = + - / * % ^");
            char islem = input.next().charAt(0);

            switch (islem) {
                case '+':
                    System.out.println("Sonuç: " + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("Sonuç: " + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("Sonuç: " + (sayi1 * sayi2));
                    break;
                case '/':
                    if (sayi2 != 0) {
                        System.out.println("Sonuç: " + ((double) sayi1 / sayi2));
                    } else {
                        System.out.println("Bir sayı sıfıra bölünemez!");
                    }
                    break;
                case '%':
                    System.out.println("Sonuç: " + (sayi1 % sayi2));
                    break;
                case '^':
                    System.out.println("Sonuç: " + (Math.pow(sayi1, sayi2)));
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        }
    }
}
