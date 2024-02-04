package Alistirmalar;

import java.util.Scanner;

public class piramit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir isim giriniz:");
        String isim = scanner.nextLine();

        for (int i = 0; i < isim.length(); i++) {
            // Her satır için gereken boşlukları yazdır
            for (int j = isim.length() - 1; j > i; j--) {
                System.out.print(" ");
            }

            // İsimdeki karakterleri yazdır
            for (int k = 0; k <= i; k++) {
                System.out.print(isim.charAt(k)+" ");
            }



            // Yeni satıra geç
            System.out.println();
        }

        scanner.close();
    }
}
