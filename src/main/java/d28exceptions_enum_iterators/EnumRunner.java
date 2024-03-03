package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        // Cities c=new Cities(); //HATA ENUM'DAN Obje olmaz

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.GİRESUN;
        System.out.println(il);//GİRESUN sabitine ulaştık

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);//Bursa

        //3- Ankara’nin posta koduna ulasalim
        String postaCode = Cities.ANKARA.getPostalCode();
        System.out.println(postaCode);//06000

        //4- Karabuk’un plaka koduna ulasalim
        System.out.println(Cities.KARABÜK.getPlateCode());//78

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen plaka kodunu giriniz");
        int plaka=input.nextInt();
        //values() methodu enum icindeki tum datalari bir array icinde bize verir

        Cities[] sehirler=Cities.values();
        //System.out.println(Arrays.toString(sehirler));
        if (plaka<1||plaka>81){
            System.out.println("Lütfen 1 ile 81 arası bir plaka kodu giriniz");
        }else {
            for (Cities w:sehirler){
                if (plaka== w.getPlateCode()){
                    System.out.println("Girmiş olduğunuz plaka "+w.getCityName() + " iline aittir");
                    break;
                }
            }
        }


    }
}