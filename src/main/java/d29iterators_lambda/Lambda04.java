package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,3,5,11,10));

        tekrarsizCiftKare(nums);


    }//main dısı

    //1)Bir list'teki "tekrarsiz","cift " elemanlarin "karelerinin"
    // "toplamını" hesaplayan method oluşturun

    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.

    public static void tekrarsizCiftKare(List<Integer>nums){
        //int toplam=nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        int toplam=nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, Integer::sum);
        //method referance

        System.out.println(toplam);
        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104
    }





}
