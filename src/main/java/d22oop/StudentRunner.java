package d22oop;

public class StudentRunner {

    public static void main(String[] args) {

        Student s = new Student();

        //s. yaptığımızda sadece public olan name görünür

        //----------------------get

        System.out.println(s.getAge());//13
        System.out.println(s.isSuccessful());//true

        //----------------------set
        s.setAge(25);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());

        //Set ile verileri değiştirebiliyoruz, constructorlar la da değiştirebiliyoruz
        //set==> mevcut bir nesnenin verilerini değiştirmek için kullanılır.
        //constructor==> Yeni nesnelerin başlangıç durumunu belirlemek için kullanılır.

        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska package'dan set method ile
        //degistirilebilir mi?
        //Encapsulation’da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.




    }



}
