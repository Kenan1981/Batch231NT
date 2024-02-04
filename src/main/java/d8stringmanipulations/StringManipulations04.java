package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //valueOf() : Belirtilen String’i Double’a cevirir


        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$","");

        laptop = laptop.replace("$","");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice);

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC
        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez

        //split() String’i istediginiz karakterden parcalamaya yarar.

        String name = "   ali    cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

       //char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println("last = " + last);

        //:  \\s+  ifadesi bir veya daha fazla boşluk anlamına gelir

        System.out.println(""+first+last); //AC















    }
}
