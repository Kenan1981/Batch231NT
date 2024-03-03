package d27exeptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
        //getCharFromString(s,a,b);//a
        getCharFromString2(s,a,b);

    }//main dsı

    public static void getCharFromString(String s, int a, int b) {

       try {
           int idx=a/b;
           char ch=s.charAt(idx);
           System.out.println(ch);
       }catch (ArithmeticException e){
           System.out.println("Sıfıra Bölme Yapılamaz "+e.getMessage());
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("Olmayan index kullanmayınız "+e.getCause());//Olmayan index kullanmayınız null
           //getCause() hatanın sebebi clasta yüklüyse verir. yoksa null verir
       }

    }

    //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir
    public static void getCharFromString2(String s, int a, int b){
        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){

            System.out.println("Bir istisna oluştu "+e.getClass());//Bir istisna oluştu class java.lang.StringIndexOutOfBoundsException
            //getClass() ile exception çeşidini öğrenebiliriz
        }


    }
}
