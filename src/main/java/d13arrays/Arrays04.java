package d13arrays;

import java.lang.reflect.Array;
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


    }
}
