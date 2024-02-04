package d12loops_arrays;

public class Alistir002 {
    public static void main(String[] args) {

        int sayi = 5; // Toplam yükseklik için
        int toplamSatir = sayi * 2 - 1; // Toplam satır sayısı

        for (int i = 1; i <= toplamSatir; i++) {
            int yildizSayisi;

            if (i <= sayi) {
                // Üst kısım (artan kısım)
                yildizSayisi = i;
            } else {
                // Alt kısım (azalan kısım)
                yildizSayisi = sayi - (i - sayi);
            }

            // Yıldızları yazdır
            for (int j = 1; j <= yildizSayisi; j++) {
                System.out.print("* ");
            }

            // Yeni bir satıra geç
            System.out.println();
            //*
            //* *
            //* * *
            //* * * *
            //* * * * *
            //* * * *
            //* * *
            //* *
            //*

        }
    }
}
