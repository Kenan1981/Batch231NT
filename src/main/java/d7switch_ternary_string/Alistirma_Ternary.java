package d7switch_ternary_string;

public class Alistirma_Ternary {
    public static void main(String[] args) {

        int input =2000;

        String son = (input%10==0)?((input%400==0)?("Kayıp Yıl"):("Kayıp Yıl Değil")):((input%4==0)?("Kayıp Yıl"):("Kayıp Yıl Değil"));
        System.out.println("Yıl Durumu: "+son);


    }

}
