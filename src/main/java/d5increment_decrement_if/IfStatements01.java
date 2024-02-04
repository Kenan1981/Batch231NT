package d5increment_decrement_if;

public class IfStatements01 {
    public static void main(String[] args) {

        if (3<5){
            System.out.println("condition dogru if çalıştı");

        }
        //----------------------------
        if(7==4+3){
            System.out.println("condition doğru ise if çalışır");
        }

        //---------------------------
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana “Rakam” yazdirin.
        int num = 7;
        if (num > -1 && num < 10){
            System.out.println("Rakam");//Rakam
        }
        //Ornek 2: Sayi uc basamakli ise ekrana “Sayi üç basamaklidir” yazdirin.

        int sayi =132;
        if(sayi>99 && sayi<1000){
            System.out.println("Sayi Üç Basamaklıdır");



        }



    }
}
