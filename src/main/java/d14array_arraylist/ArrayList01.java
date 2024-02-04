package d14array_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList nedir?

        /*
    ArrayList(class), dinamik bir array yapısıdır. Bu, ArrayList'in boyutunun, elemanlar ekleme veya çıkarma
     sırasında otomatik olarak ayarlanabileceği anlamına gelir.

    Gerçek hayattan bir örnek olarak, bir alışveriş listesi ArrayList olarak temsil edilebilir.
    Alışveriş listesi, ürünlere ait isimlerin bir listesini içerir. Ürünler, String referans türleridir.
    */
       /*
    1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler non-primitive'leri (reference'lari) depolar
    2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
    3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
    4)ArrayList'ler eleman sayisinda esnektirler.
    5) Array'leri Java niye iptal etmedi?
    a) Array'ler cok daha hizlidir
    b) Array'ler memory'de cok az yer kaplarlar
    c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

    6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.) doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda, bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
    */

        //ArrayList nasil olusturulur?

        //ArrayList<Integer>ages=new ArrayList<Integer>();//Java 6 ve öncesinde
        ArrayList<Integer>ages =new ArrayList<>();//java 7 ve sonrası-type inference-tip çıkarımı

        //ArrayList’lere eleman nasil eklenir?

        //1- add() metodu, ArrayList’e yeni bir eleman eklemek için kullanılır ve
        // eklenen elemanı listenin sonuna yerleştirir.

        //2- add(int index, E element): Bu metot, belirtilen elemanı ArrayList’in belirtilen konumuna ekler.
        // Mevcut elemanlar sağa kaydırılır.

        //List’te araya eleman eklemek icin index numarasini yazariz

        ages.add(9);
        ages.add(12);
        ages.add(5);

        System.out.println(ages);

        ages.add(1,28);
        System.out.println(ages);//1. index tekini sağa öteleyip araya 28 yazdı

        //12 ile 5 arasına 7 ekleyin
        ages.add(3,7);
        System.out.println(ages);

        //Listenin sonuna 11 ekleyin
        ages.add(11);
        System.out.println(ages);//[9, 28, 12, 7, 5, 11]

        //Ornek 1: Verilen Integer List’i, ages List’inin icine koyunuz

        //addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList'e eklemek için kullanılır.
        // Bu metod, genellikle bir ArrayList'i başka bir koleksiyonun öğeleriyle genişletmek istediğinizde kullanışlıdır.

        //addAll(int index, Collection<? extends E> c): Bu metod, belirtilen koleksiyondaki tüm öğeleri ArrayList'in
        // belirtilen indeksinden başlayarak ekler. Bu işlem sırasında, var olan öğeler sağa kaydırılır.

        ArrayList<Integer>newAges= new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 28, 12, 7, 5, 11, 1, 2, 3]
        System.out.println(newAges);//[1, 2, 3]

        ages.addAll(0,newAges);
        System.out.println(ages);//[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder).length metodudur.
        int elemanSayisi=ages.size();
        System.out.println(elemanSayisi);//12



















    }
}
