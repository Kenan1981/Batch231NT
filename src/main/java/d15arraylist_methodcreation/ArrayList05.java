package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList05 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz. İnterview Sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        // iki turlü sort() kullanabiliriz
        //1-ArratList icinde olan
        //2-Collections içine olan

        List<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

       // Collections.sort(nums);
        System.out.println(nums);//[10, 12, 19, 23]
        nums.sort(null);
        System.out.println(nums);//[10, 12, 19, 23]

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");




























    }

}
