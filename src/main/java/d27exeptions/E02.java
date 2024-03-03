package d27exeptions;

public class E02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s="1234a";//icinde harf yazıldıgı için exceptions
        convertStringToInt(s);


    }//main dısı
    public static void convertStringToInt(String s){
      try {//kontrol altına aldık.
          int intS=Integer.valueOf(s);
          System.out.println(intS+1);//1'i dönüştürüp dönüştürmediğini anlamak için yazdık.
      }catch (NumberFormatException e){
          System.out.println("Donusum icin rakam dısı karakter kullanmmayınız:"+e.getMessage());
      }
      //FileWriter,PrintWriter-exceptionları dısarıya alabilirsiniz


    }



}
