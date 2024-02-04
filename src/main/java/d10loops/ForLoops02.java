package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz
        //      578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum =0;

        for (int i = 578; i >0 ; i/=10) {

            sum = sum+ i%10;

        }

        System.out.println(sum);
        //------------------------------------------------------
        System.out.println("-------------------------------");
        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String t ="Yusuf";

        String unique ="";

        for (int i = 0; i <t.length(); i++) {

          char ch = t.charAt(i);//index verince harfi getirecek

            if (t.indexOf(ch)==t.lastIndexOf(ch)) {
            unique =unique + ch;

            }

        }
        System.out.println("Tekrarsız:  "+unique);

    }
}
