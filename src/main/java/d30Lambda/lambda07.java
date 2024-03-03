package d30Lambda;

import java.util.*;

public class lambda07 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));

        //minumum1(nums);//2
        //minumum2(nums);//2
        //minumum3(nums);//2
        //minumum4(nums);//2
       // minumum5(nums);//2
        minimum6(nums);

    }//main disi
    //7)Verilen List’teki “minimum değeri” bulmak için bir method oluşturun

    //1.yol
    public static void minumum1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }
    //2.yol
    public static void minumum2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
    //3.yol
    public static void minumum3(List<Integer>nums){
        Integer min=nums.stream().distinct().reduce((t,u)->t>u?u:t).get();
        System.out.println(min);
    }
    //4.yol
    public static void minumum4(List<Integer> nums) {
        int min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);
    }
    //5.yol
    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.
    public static void minumum5(List<Integer> nums){
        Optional<Integer> min= nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u)->u);
       if(min.isPresent()){//min de bir değer var mı?
           System.out.println(min.get());//2
       }else {
           System.out.println("Liste boş veya minimum değer bulunamadı");
       }
    }
    public static void minimum6(List<Integer>nums){
        Integer min=nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);
    }
    public static void minimum7(List<Integer>nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }

}
