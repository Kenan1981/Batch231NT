package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
       // 1. Yol :

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Girniz");

        int num = input.nextInt();


        if(num % 2==0){
            System.out.println("Çift Sayi");
        }

        if(num % 2 !=0){// num% 2==1 de olur
            System.out.println("Tek Sayi");
        }

        // 2. yol
        //if-else Statements
        if(num %2==0){
            System.out.println("Sayı Çifttir");

        }else {
            System.out.println("Sayı Tektir");


        }

    }
}
