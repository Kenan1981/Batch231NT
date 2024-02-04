package d14array_arraylist;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int[][] ages = {{15, 4}, {12, 43, 21}};

        int enKucuk = ages[0][0];
        int enBuyuk = ages[0][0];

        for (int[] w : ages) {
            for (int k : w) {
                enKucuk = Math.min(enKucuk, k);
                enBuyuk = Math.max(enBuyuk, k);
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);  //43
        System.out.println("enKucuk = " + enKucuk);  //4
        System.out.println("Toplam: "+(enBuyuk + enKucuk));// 47








    }
}
