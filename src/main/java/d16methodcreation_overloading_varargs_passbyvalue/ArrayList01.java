package d16methodcreation_overloading_varargs_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
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

        System.out.println(nums);//[12, 23, 10, 19]

        // Collections.sort(nums);
        nums.sort(null);
        System.out.println(nums);//[10, 12, 19, 23]

        int minFark=nums.get(1)-nums.get(0); //2

        for (int i = 1; i <nums.size() ; i++) {//1'den başlattık ki 1. index ten 0. index i çıkaralım
            minFark=Math.min(minFark,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minFark);

        //2. Adım: En küçük farkı hangi sayılarda elde ettiğimiz bulalım
        for (int i = 1; i <nums.size() ; i++) {
            //minFark hangi çıkarma işleminde bulduğumuzu araştıracağız ve o çıkarma işlemindeki sayıları konsala yazdıracağız.

            if (nums.get(i)-nums.get(i-1)==minFark){
                System.out.println(nums.get(i)+" ve "+nums.get(i-1));
            }
        }

































    }

}
