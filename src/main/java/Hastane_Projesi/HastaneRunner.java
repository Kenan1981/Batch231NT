package Hastane_Projesi;

import java.util.*;

import static Hastane_Projesi.VeriBankasi.*;


public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();

    public static void main(String[] args) {
        hosgeldiniz();
        String hastalik="Migren";

        String unvan = doktorUnvan(hastalik);
        Doktor doktor = doktorBul(unvan);

        Hasta hasta = hastaBul(hastalik);

         hastane1.getDoktor();
         hastane1.getHasta();


        String durumYazdir = hasta.getHastaDurumu() != null ? hasta.getHastaDurumu().getAktuelDurum() : "Bilgi yok";

        System.out.println("Atanan Doktor: " + doktor.getDoktorIsim() +" "+ doktor.getDoktorSoyIsim()+", Unvan: " + doktor.getUnvan());
        System.out.println("Hasta: " + hasta.getHastaIsim() + " " + hasta.getHastaSoyIsim() +",Bekleme Sırasi "+hasta.getHastaID()+", Durumu: " + durumYazdir);
        System.out.println("Acil Şifalar Dileriz");
        System.out.println("*".repeat(58));

    }
    public static void hosgeldiniz(){

        System.out.println("---------------HASTANEMİZE HOŞGELDİNİZ----------------");
        System.out.println("*".repeat(58));
    }

    public static String doktorUnvan(String hastaDurumu) {
        switch (hastaDurumu) {
            case "allerji":
                return "Allergist";
            case "baş ağrısı":
                return "Norolog";
            case "diabet":
                return "Dahiliye";

            default:
                return "Pratisyen";
        }
    }
    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();

        int rastgeleDoktor = new Random().nextInt(doktorIsimleri.length);

        doktor.setDoktorIsim(doktorIsimleri[rastgeleDoktor]);
        doktor.setDoktorSoyIsim(doktorSoyIsimleri[rastgeleDoktor]);
        doktor.setUnvan(VeriBankasi.unvanlar[rastgeleDoktor]);
        return doktor;
    }
    public static Hasta hastaBul(String hastaDurumu) {
        Hasta hasta = new Hasta();

        int rastgeleHastaAdi=new Random().nextInt(hastaIsimleri.length);
        int rastgeleHastaSoyadi=new Random().nextInt(VeriBankasi.hastaSoyIsimleri.length);
        int rastgeleId=new Random().nextInt(VeriBankasi.hastaIDleri.length);


        hasta.setHastaIsim(VeriBankasi.hastaIsimleri[rastgeleHastaAdi]);
        hasta.setHastaSoyIsim(VeriBankasi.hastaSoyIsimleri[rastgeleHastaSoyadi]);
        hasta.setHastaID(VeriBankasi.hastaIDleri[rastgeleId]);

        Durum durum = hastaDurumuBul(hastaDurumu);
        hasta.setHastaDurumu(durum);
        return hasta;
    }
    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum durum = new Durum();
        durum.setAktuelDurum(aktuelDurum);

        switch (aktuelDurum) {
            case "Allerji":
            case "Baş ağrısı":
            case "Diabet":
            case "Soğuk algınlığı":
                durum.setAciliyet(false);
                break;
            case "Migren":
            case "Kalp hastalıkları":
                durum.setAciliyet(true);
                break;
            default:
                System.out.println("Acil bir durum değil");
                break;
        }
        return durum;
    }


}
