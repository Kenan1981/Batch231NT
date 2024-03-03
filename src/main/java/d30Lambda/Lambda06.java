package d30Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lambda06 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));

        // maksimum1(nums);//11
       // maksimum2(nums);//11
       // maksimum3(nums);//11
        maksimum4(nums);//11
    }//main dişi

    //1)Verilen List’teki “maksimum değeri” bulmak için bir method oluşturun
    //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
    public static void maksimum1(List<Integer> nums) {
        int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol
    public static void maksimum2(List<Integer> nums) {

        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3.yol
    //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)
    public static void maksimum3(List<Integer> nums) {
        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }
    //4.yol

    public static void maksimum4(List<Integer>nums){
        Integer max =nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }


}
