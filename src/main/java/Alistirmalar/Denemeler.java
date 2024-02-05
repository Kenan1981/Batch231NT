package Alistirmalar;

import java.util.ArrayList;
import java.util.Arrays;

public class Denemeler {
    public static void main(String[] args) {

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

      int[]sayilar={0,2,3,0,12,0};

      int[]yeniSayilar=new int[6];
      int ilk=0;

      for (int w:sayilar){
          if (w!=0){
              yeniSayilar[ilk]=w;
              ilk++;
          }

      }
        System.out.println(Arrays.toString(yeniSayilar));





    }
}
