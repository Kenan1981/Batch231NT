package d2variables;

import java.util.Scanner;

public class Antiraman {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yari Çapı Giriniz : ");
        double yaricap = input.nextDouble();
        System.out.println("Çevre:" +(yaricap*2*3.14));

        System.out.println("Alan :" + (3.14*yaricap*yaricap));
    }
}
