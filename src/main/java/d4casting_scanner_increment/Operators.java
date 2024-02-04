package d4casting_scanner_increment;

public class Operators {
    public static void main(String[] args) {


            /*2) Java da "logical operator" lar.
               ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
               AND islemini carpma olarak dusunebiliriz

               ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
               OR isleminde sonucun false olabilmesi icin hersey false olmalidir

               //==> NOT Operatoru (!) true olani false , false olani true yapar
               !true  ==> false
               !false ==> true
               !!true ==> true*/
                /*3) Comparison (Karsilastirma) Operators
               <, >, <=, >=, ==, !=
               Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/
            boolean a = 3<5;
            boolean b = 2+3 !=5;
            boolean c = 2+3*5>=19;
        System.out.println(a && b); //false
        System.out.println(a || b || c); //true
    }
}
