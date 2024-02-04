package d14array_arraylist;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};//0 hariç diğer sayılar alttaki listeye eklenir.
        int[] yeniArr = {0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(yeniArr));

        int ilkIndex = 0;
        //[0, 2, 3, 0, 12, 0]------for-each kulldık
        for (int w : arr) {
            if (w != 0) {
                yeniArr[ilkIndex] = w;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr)); //[2, 3, 12, 0, 0, 0]
        // ----------------------------------------------------------------------
        //Arraylerin eşitliği nasıl anlaşılır

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int[3];
        b[0] = 2;
        b[1] = 1;
        b[2] = 3;
        //iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir

      boolean result =  Arrays.equals(a,b);
        System.out.println("result = " + result);


    }
}
