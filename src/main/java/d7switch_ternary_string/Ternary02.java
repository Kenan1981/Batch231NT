package d7switch_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = -123;

        a=Math.abs(a); // absolute value// anın mutlak değerini alıp a ya yüklüyor.(Math = matematik, abs = absolute)

        String result = (a >99 && a<1000) ?"Üç basamaklıdır" : "Uç basamaklı değildir";
        System.out.println(result);





    }
}
