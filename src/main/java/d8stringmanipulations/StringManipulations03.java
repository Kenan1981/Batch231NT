package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

         /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");
        String pwd = input.nextLine();//abcs1234

        //1) en az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        //2)Space karakteri password'de olmasin  (Space hariç herşeyi sil)
        boolean spaceControl = pwd.replaceAll("[^ ]", "").length() == 0;   //.isEmpty();de yazılabilir
        //System.out.println("spaceControl = " + spaceControl);

        //3) En az bir tane büyük harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        //4) En az bir tane küçük hasr olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun

        boolean numberControl = pwd.replaceAll("[0-9]", "").length() > 0;
        //System.out.println("numberControl = " + numberControl);

        //ÖDEV : en az bir tane sembol içermeli #java_code_exercise_sharing paylaş
        boolean karakterControl = pwd.replaceAll("[^\\p{Punct}]","").length()>0;
        //System.out.println("karakterControl = " + karakterControl);

        if (!numberControl){
            System.out.println("Sifre en az bir rakam icermelidir");

        }
        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl &&  numberControl&&karakterControl;

        if (isValid){
            System.out.println("Sifre Geçerli");
        }else {System.out.println("Sifre Geçersiz");}



    }
}
