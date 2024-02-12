package d16methodcreation_overloading_varargs_passbyvalue;

import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        //Bir List olusturmak icin kisa yol
        //.asList methodu
        List<Integer>myList= Arrays.asList(1,3,4,9,7);

        System.out.println(myList);//[1,3,4,9,7]
        //asList kullanmanın bazı handikapları vardır.Arka planda Array gibi çalışır.Bu şekilde list oluşturusanız, listin eleman değiştiren methodları kullanılamaz.

        // myList.remove(0);   //hata verir. eleman sayısını değiştiremezsiniz.

        // myList.add(5);//Hata

        //clear() metodu bir listedeki tüm elemanları silmek için kullanılır.
        //myList.clear();//Hata

        myList.set(0,5);
        System.out.println(myList);//[5,3,4,9,7]
        System.out.println(myList.size());//5










    }
}
