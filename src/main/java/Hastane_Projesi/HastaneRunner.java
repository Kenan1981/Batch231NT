package Hastane_Projesi;

import java.util.Random;


public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();

    public static void main(String[] args) {

        String sikayetSebebi = "Migren";

        String unvan = doktorUnvan(sikayetSebebi);
        Doktor doktor = doktorBul(unvan);

        Hasta hasta = hastaBul(sikayetSebebi);

        hastane1.setDoktor(doktor);
        hastane1.setHasta(hasta);


        String durumYazdir = hasta.getHastaDurumu() != null ? hasta.getHastaDurumu().getAktuelDurum() : "Bilgi yok";

        System.out.println("Atanan Doktor: " + doktor.getIsimDoktor() + " " + doktor.getSoyIsimDoktor() + ", Unvan: " + doktor.getUnvan());
        System.out.println("Hasta: " + hasta.getIsim() + " " + hasta.getSoyIsim() + ", Durumu: " + durumYazdir);
    }

    public static String doktorUnvan(String hastaDurumu) {
        switch (hastaDurumu.toLowerCase()) {
            case "allerji":
                return "Allergist";
            case "baş ağrısı":
                return "Norolog";
            case "diabet":
                return "Genel Cerrah";

            default:
                return "Pratisyen";
        }
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        int rastgeleDoktor = new Random().nextInt(VeriBankasi.doktorIsimleri.length);

        doktor.setIsimDoktor(VeriBankasi.doktorIsimleri[rastgeleDoktor]);
        doktor.setSoyIsimDoktor(VeriBankasi.doktorSoyIsimleri[rastgeleDoktor]);
        doktor.setUnvan(VeriBankasi.unvanlar[rastgeleDoktor]);
        return doktor;
    }

    public static Hasta hastaBul(String hastaDurumu) {
        Hasta hasta = new Hasta();

        int rastgeleHasta = new Random().nextInt(VeriBankasi.hastaIsimleri.length);
        int rastgeleHastaSoyadi=new Random().nextInt(VeriBankasi.hastaSoyIsimleri.length);


        hasta.setIsim(VeriBankasi.hastaIsimleri[rastgeleHasta]);
        hasta.setSoyIsim(VeriBankasi.hastaSoyIsimleri[rastgeleHastaSoyadi]);
        hasta.setHastaID(123);

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
                System.out.println("Geçerli bir durum değil");
                break;
        }
        return durum;
    }
}
