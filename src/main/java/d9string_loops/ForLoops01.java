package d9string_loops;

public class ForLoops01 {
    public static void main(String[] args) {

        // Loops (Döngüler)

        //Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.

        //Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.

        /*Java'da su donguleri gorecegiz

        1. for-loop
        2. while-loop
        3. do-while-loop
        4. for-each-loop (Collections'larda)*/

        /*1. for-loop

        for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak
        için kullanılan bir döngüdür.
        Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.

        for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
        Bazi durumlarda döngü sonsuz sayıda yinelenir*/

        //ornek 1: Console'a 4 kere 'Hi!' yazdirin

        //1.yol tavsiye edilmez
        System.out.println("hi!");
        System.out.println("hi!");
        System.out.println("hi!");
        System.out.println("hi!");

        System.out.println("--------------------------------");

        //2.yol:

        /*for (Baslangic degeri;Loop calisma kurali;Artırma/Eksiltme){
            //calısacak kodlar
        }*/

        for (int i = 1; i < 5; i++) { //i<= 4 'de yazılabilirdi. i=i+1'de yazılabilirdi.
            System.out.println("hi.....!");
        }

        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console’a yazdiriniz

        for (int i= 20;i>2;i--){
            System.out.println(i);
        }

        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(20 dahil)

           for (int i = 3;i<21;i++){
               if (i%2==0){
                   System.out.println(i);
               }
               //-------------------------------------------

               System.out.println("--------------------------------");

               //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(20 dahil)

              for (int j = 3; j<21; j++){
                  if (j%2==0){
                      System.out.println(j);
                  }
              }


       }





    }
}
