package yeniHastane;

import java.util.Scanner;

public class HastaneRunner {
    private static Hastane hastane = new Hastane();
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        boolean hastaControl=true;
        int counter;

        do {
            System.out.println("Lütfen Rahatsızlığınızı giriniz");
            String hastaDurumu =input.nextLine().trim();

            String unvan = doktorUnvan(hastaDurumu);

            hastane.setDoktor(doktorBul(unvan));
            hastane.setHasta(hastaBul(hastaDurumu));

            Durum hastaAciliyet = hastaDurumBul(hastaDurumu);



            System.out.println("******************** HASTA KARTI ***");

            System.out.println("*".repeat(40));

            System.out.println("Hasta İsmi: " + hastane.getHasta().getIsim());
            System.out.println("Hasta Soy İsmi: " + hastane.getHasta().getSoyIsim());
            System.out.println("Hasta Durumu: " + hastaAciliyet.isAciliyet());
            System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
            System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
            System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

            System.err.println("Geçmiş olsun dileklerimizle...");

            System.out.println("*".repeat(40));

            System.out.println("Çıkmak için 1'e,yeni bir giriş yapmak için 2'ye tuşlayınız");
            counter=input.nextInt();
            input.nextLine();
            if (counter==1){
                hastaControl=false;
                System.out.println("Güle güle");
            }else if (counter==2){
                hastaControl=true;
                System.out.println("Yeni Giriş");
            }
        }while (hastaControl);


    }//Main Dışı
    public static String doktorUnvan(String aktuelDurum) {

        if(aktuelDurum.equalsIgnoreCase("Allerji")) {
            return hastane.unvanlar[0];
        }else if(aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return hastane.unvanlar[1];
        }else if(aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane.unvanlar[2];
        }else if(aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return hastane.unvanlar[3];
        }else if(aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane.unvanlar[4];
        }else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "Geçerli bir durum değil";

    }
    public static Doktor doktorBul(String unvan){

        Doktor doktor = new Doktor();

        for(int i = 0; i < hastane.unvanlar.length; i++ )
        {
            if(unvan.equalsIgnoreCase(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }
        }
        return doktor;
    }
    public static Hasta hastaBul(String hastaDurumu){
        Hasta hasta=new Hasta();
        for (int i = 0; i <hastane.durumlar.length ; i++) {
            if (hastaDurumu.equalsIgnoreCase(hastane.durumlar[i])){
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane.hastaIDleri[i]);
            }
        }return hasta;
    }
    public static Durum hastaDurumBul (String aktuelDurum){
        Durum hastaDurum = new Durum();
        switch (aktuelDurum){
            case  "Allerji":
                hastaDurum.setAciliyet(false);
                break;
            case  "Bas agrisi":
                hastaDurum.setAciliyet(false);
                break;
            case  "Diabet":
                hastaDurum.setAciliyet(false);
                break;
            case  "Soguk alginligi":
                hastaDurum.setAciliyet(false);
                break;
            case  "Migren":
                hastaDurum.setAciliyet(true);
                break;
            case  "Kalp hastaliklari":
                hastaDurum.setAciliyet(true);
                break;
            default:
                System.out.println("Geçerli bir durum değil");

                break;
        }
        return hastaDurum;

    }

}
