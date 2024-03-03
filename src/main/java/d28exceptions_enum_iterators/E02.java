package d28exceptions_enum_iterators;

public class E02 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        int[] c={3,5,7,9};

        getir(c,a,b);
    }//main dısı
    public static void getir(int[] c,int a,int  b){
        try{
            int idx=a/b;
            int element=c[idx];
            System.out.println(element);
        }finally {
            System.out.println("Database ile bağlantıyı kesiniz");
        }
        System.out.println("Merhaba");


    }

}
