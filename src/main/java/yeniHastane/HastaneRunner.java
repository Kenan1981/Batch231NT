package yeniHastane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static yeniHastane.VeriBankasi.*;
public class HastaneRunner {
    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean hastaControl = true;
        int counter = 3;

        do {
            System.out.println("Migren\nBas agrisi\nAllerji\nSoguk alginligi\nDiabet\nKalp hastaliklari");
            System.out.println("Lütfen Rahatsızlığınızı giriniz");
            String hastaDurumu = input.nextLine().trim();

            if (!durumGecerliMi(hastaDurumu)) {
                counter--;
                if (counter > 0) {
                    System.out.println("Geçerli bir durum giriniz. Kalan deneme hakkınız: " + counter);
                } else {
                    System.out.println("Deneme hakkınız tükendi. Programdan çıkılıyor.");
                    break;
                }
                continue;
            }

            hastane.setHasta(hastaBuluruz(hastaDurumu));
            hastane.setDoktor(doktorBul(hastaDurumu));
            Durum hastaAciliyet = hastaDurumBul(hastaDurumu);

            System.out.println("******************** HASTA KARTI ***");
            System.out.println("*".repeat(40));
            System.out.println("Hasta ADI  SOYADI ve ID'si \n" + hastane.getHasta().getIsimSoyisimId());
            System.out.println("Hasta Durumu: " + hastaAciliyet.isAciliyet());
            System.out.println("Doktor ADI SOYADI ve UNVANI \n" + hastane.getDoktor().getIsimSoyadUnvan());
            System.err.println("Geçmiş olsun dileklerimizle...");
            System.out.println("*".repeat(40));

            System.out.println("Çıkmak için 1'e, yeni bir giriş yapmak için 2'ye tuşlayınız:");
            int secim = input.nextInt();
            input.nextLine();

            switch (secim) {
                case 1:
                    hastaControl = false;
                    System.out.println("Güle güle!");
                    break;
                case 2:
                    System.out.println("Yeni Giriş");

                    counter = 3;
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");

                    break;
            }
        } while (hastaControl);



    }//Main Dışı


    public static boolean durumGecerliMi(String hastaDurumu) {

        List<String> gecerliDurumlar = List.of("migren", "bas agrisi", "allerji", "soguk alginligi", "diabet", "kalp hastaliklari");
        return gecerliDurumlar.contains(hastaDurumu.toLowerCase());
    }

    public static Doktor doktorBul(String hastaDurum) {

        List<String> birlesikDoktorList = new ArrayList<>();

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {
            birlesikDoktorList.add(hastane.doctorIsimleri[i] + " " + hastane.doctorSoyIsimleri[i] + " " + hastane.unvanlar[i]);
        }
        switch (hastaDurum.toLowerCase()) {
            case "migren":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(0));
                break;
            case "soguk alginligi":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(1));
                break;
            case "bas agrisi":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(2));
                break;
            case "kalp agrisi":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(3));
                break;
            case "diabet":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(4));
                break;
            case "allerji":
                doktor.setIsimSoyadUnvan(birlesikDoktorList.get(5));
                break;
            default:

                break;
        }
        return doktor;
    }

    public static Durum hastaDurumBul(String hastaDurum) {
        Durum durum = new Durum();
        switch (hastaDurum.toLowerCase()) {
            case "allerji":
                durum.setAciliyet(false);
                break;
            case "bas agrisi":
                durum.setAciliyet(false);
                break;
            case "diabet":
                durum.setAciliyet(false);
                break;
            case "soguk alginligi":
                durum.setAciliyet(false);
                break;
            case "migren":
                durum.setAciliyet(true);
                break;
            case "kalp hastaliklari":
                durum.setAciliyet(true);
                break;
            default:
                System.out.println("Geçerli bir durum değil");

                break;
        }
        return durum;

    }

    public static Hasta hastaBuluruz(String hastaDurum) {
        List<String> birlesikHastaListesi = new ArrayList<>();
        Hasta hasta = new Hasta();
        for (int i = 0; i < hastaIsimleri.length; i++) {
            birlesikHastaListesi.add(hastaIsimleri[i] + " " + hastaSoyIsimleri[i] + " (" + hastaIDleri[i] + ")");
        }
        switch (hastaDurum.toLowerCase()) {
            case "migren":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(0));
                break; // Buraya bir break ifadesi ekledim
            case "soguk alginligi":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(1));
                break;
            case "bas agrisi":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(1));
                break;
            case "kalp agrisi":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(1));
                break;
            case "diabet":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(1));
                break;
            case "allerji":
                hasta.setIsimSoyisimId(birlesikHastaListesi.get(1));
                break;

            default:
                System.out.println("Tanımsız durum");
                break;

        }
        return hasta;
    }


}
