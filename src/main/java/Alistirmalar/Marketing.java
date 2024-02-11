import java.util.Scanner;

public class Marketing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"};
        double[] fiyatlar = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

        double toplamTutar = 0;
        boolean ilerle = true;

        while (ilerle) {
            System.out.println("Ürün Listesi:");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println(i + " - " + urunler[i] + " : " + fiyatlar[i] + " TL");
            }
            System.out.print("Lütfen almak istediğiniz ürünün numarasını giriniz: ");
            int urunNo = scanner.nextInt();

            System.out.print("Kaç kg almak istiyorsunuz? ");
            double kg = scanner.nextDouble();

            double urunTutari = fiyatlar[urunNo] * kg;
            toplamTutar += urunTutari;


            System.out.println(kg + " kg " + urunler[urunNo] + " : " + urunTutari + " TL");

            System.out.println("Başka bir ürün almak ister misiniz? (evet/hayır)");
            String baskaIstek = scanner.next();
            ilerle = baskaIstek.equalsIgnoreCase("evet");
        }
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Alışverişiniz için teşekkür ederiz.");
    }
}
