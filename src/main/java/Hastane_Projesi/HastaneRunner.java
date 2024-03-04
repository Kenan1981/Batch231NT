package Hastane_Projesi;

import java.util.*;

import static Hastane_Projesi.VeriBankasi.*;

public class HastaneRunner {

    private static final Hastane hastane1 = new Hastane();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hosgeldiniz();

        System.out.println("         HASTA GİRİŞ EKRANI");
        System.out.println("Lütfen Adınızı Giriniz");
        String hastaName = input.nextLine();
        System.out.println("Lütfen Soyadınız Giriniz");
        String surName= input.nextLine();

        System.out.println("Lütfen Bir Hastalik Numarasi Seçiniz");
        System.out.println("1-Allerji\n2-Baş ağrısı\n3-Diabet\n4-Soğuk algınlığı\n5-Migren\n6-Kalp hastalıkları");
        int hastalikNo = input.nextInt();


        System.out.println("       ***HASTA KARTI***");
        System.out.println("Hasta Bilgileri :" + hastaName+" "+surName);
        System.out.println("Birim :");
        poliklinikBul(hastalikNo);
        System.out.println("Doktor :");
        doktorBul(hastalikNo);
        System.out.println("Muayene Oda No: ");
        muayeneOdasi(hastalikNo);
        System.out.println("Acil Durum:");
        hastaDurumuBul(hastalikNo);
        idAta(hastalikNo);
        System.err.println("Acil Şifalar Dileriz");

    }
    public static void hosgeldiniz() {

        System.out.println("*************** <HASTANEMİZE HOŞGELDİNİZ>*******");

    }

    public static Hastane poliklinikBul(int unvan) {
        Hastane doktor = new Hastane();
        switch (unvan) {
            case 1:
                System.out.println("Allerjist");
                break;
            case 2:
                System.out.println("Çocuk Doktoru");
                break;
            case 3:
                System.out.println("Dahiliye");
                break;
            case 4:
                System.out.println("Genel Cerrah");
                break;
            case 5:
                System.out.println("Norolog");
                break;
            case 6:
                System.out.println("Kardiolog");
                break;
        }

        return doktor;
    }

    public static Durum hastaDurumuBul(int hastalikNo) {
        Durum durum = new Durum();

        switch (hastalikNo) {
            case 1:
                System.out.println(durum.isAciliyet());
                break;
            case 2:
                System.out.println(durum.isAciliyet());
                break;
            case 3:
                System.out.println(durum.isAciliyet());
                break;
            case 4:
                System.out.println(durum.isAciliyet());
                break;
            case 5:
                System.out.println(durum.isAciliyet());
                break;
            case 6:
                System.out.println("Acil Durum");
                break;
            default:
        }
        return durum;
    }

    public static Doktor doktorBul(int hastalikNo) {
        Doktor doktor = new Doktor();
        if (hastalikNo == 1) {
            System.out.println(doktorIsimleri[0]);
            System.out.println(doktorSoyIsimleri[0]);
        } else if (hastalikNo == 2) {
            System.out.println(doktorIsimleri[1]);
            System.out.println(doktorSoyIsimleri[1]);
        } else if (hastalikNo == 3) {
            System.out.println(doktorIsimleri[2]);
            System.out.println(doktorSoyIsimleri[2]);
        } else if (hastalikNo == 4) {
            System.out.println(doktorIsimleri[3]);
            System.out.println(doktorSoyIsimleri[3]);
        } else if (hastalikNo == 5) {
            System.out.println(doktorIsimleri[4]);
            System.out.println(doktorSoyIsimleri[4]);
        } else if (hastalikNo == 6) {
            System.out.println(doktorIsimleri[5]);
            System.out.println(doktorSoyIsimleri[5]);
        } else {
            System.out.println("Doktor Bulunamadi");
        }
        return doktor;
    }

    public static void idAta(int hastalikNo) {
        Random rand = new Random();
        int uzunluk = VeriBankasi.hastaIDleri.length;
        int rastgeleIndex = rand.nextInt(uzunluk);
        int secilenHastaID = VeriBankasi.hastaIDleri[rastgeleIndex];
        System.out.println("Bekleme Sırası : "+ secilenHastaID);
    }

    public static void muayeneOdasi(int hastaNo){
        VeriBankasi pol=new VeriBankasi();
        switch (hastaNo){
            case 1:
                System.out.println(muayeneHaneNo[0]);
                break;
            case 2:
                System.out.println(muayeneHaneNo[1]);
                break;
            case 3:
                System.out.println(muayeneHaneNo[2]);
                break;
            case 4:
                System.out.println(muayeneHaneNo[3]);
                break;
            case 5:
                System.out.println(muayeneHaneNo[4]);
                break;
            case 6:
                System.out.println(muayeneHaneNo[5]);
                break;
            default:
        }

    }

}
