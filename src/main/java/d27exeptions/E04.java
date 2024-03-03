package d27exeptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        //wrapper method arastır.


        String [] arr={"j","a","v","a"};
        getElemetFromArray(arr,1);//a
        getElemetFromArray(arr,5);//exception fırlattı. HATA

    }//main dışı
    public static void getElemetFromArray(String[] s,int idx){
        try {
            String el=s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("İndex numarası  "+(s.length-1)+" den büyük olamaz");//İndex numarası  3 den büyük olamaz
        }

    }
}
