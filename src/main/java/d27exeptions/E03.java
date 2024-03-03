package d27exeptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s= "Java";
        karakterSec(s,2);//v
        karakterSec(s,5);//v //StringIndexOutOfBoundsException



    }//main disi
    public static void karakterSec(String s,int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan indexleri kullanmayınız :"+e.getMessage());
            e.printStackTrace();//developer hataları görmek isterse kullanır. exception u görür ama exception fırlatmaz
        }
        System.out.println("App calışıyor");
    }
}
