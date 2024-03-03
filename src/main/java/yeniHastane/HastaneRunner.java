package yeniHastane;
public class HastaneRunner {
    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {
        
        String hastaDurumu = "Bas agrisi";

        String unvan  = doktorUnvan(hastaDurumu);
        
        hastane.setDoktor(doktorBul(unvan));
        hastane.setHasta(hastaBul(hastaDurumu));

        Durum hastaAciliyet=hastaDurumBul(hastaDurumu);

        System.out.println("******************** HASTA KARTI ***");

        System.out.println("*".repeat(40));

        System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: "+hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: "+hastane.getDoktor().getUnvan());
        System.out.println("Hasta İsmi: "+hastane.getHasta().getIsim());
        System.out.println("Hasta Soy İsmi: "+hastane.getHasta().getSoyIsim());
        System.out.println("Hasta Durumu: "+hastaAciliyet.isAciliyet());
        System.err.println("Geçmiş olsun dileklerimizle...");

        System.out.println("*".repeat(40));

    }
    public static String doktorUnvan(String aktuelDurum) { 
        
        if(aktuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];
        }else if(aktuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        }else if(aktuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];
        }else if(aktuelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        }else if(aktuelDurum.equals("Migren")) {
            return hastane.unvanlar[4];
        }else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }
        
        return "yanlis durum";
        
    }
    public static Doktor doktorBul(String unvan){ 
        
        Doktor doktor = new Doktor();
        
        for(int i = 0; i < hastane.unvanlar.length; i++ )
        {
            if(unvan.equals(hastane.unvanlar[i])) {
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
            if (hastaDurumu.equals(hastane.durumlar[i])){
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
            case  "Kalp hastalikalri":
                hastaDurum.setAciliyet(true);
                break;
            default:

                break;
        }
        return hastaDurum;

    }
    
}
