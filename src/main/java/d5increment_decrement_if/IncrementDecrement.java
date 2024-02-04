package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //-----------------Increment (Artırma)
        int a =5;
        a = a+2; // a iki defa yazılmış. tekrardan kurtulabiliriz.
        System.out.println(a); //7

        a +=2; // a=a+2; nin aynısıdır.
        System.out.println(a); // 9

        //--------------------------Decrement (Azaltma)
        int c = 10;
        c = c-3;//c iki defa yazılmış. tekrardan kurtulabiliriz.
        System.out.println(c);//7

        c -= 4;
        System.out.println(c);//3


        //-------------------------Çarpma
        int d = 6;
        d = d*2;
        System.out.println(d);//12

        d *=2;
        System.out.println(d);//24


        //---------------------Bölme

        int e= 24;
        e =e/2;
        System.out.println(e);//12


        e /=2;
        System.out.println(e);//6

        //----------------------------1 ile increment

        int f =13;
        f = f+1;
        f +=1;
        f++;
        System.out.println(f);//16


        //---------------------1 İle Decrement

        int h =15;
        h =h-1;
        h -=1;
        h--;
        System.out.println(h);//12

        //-------------------İlginç Bilgi ----
        //-------------------post  icnrement (i++),pre increment (++1)

        int i = 10;
        int k = i++;
        System.out.println(k);//10
        System.out.println(i);//11

        int m=15;
        int n= ++m;
        System.out.println(m);
        System.out.println(n);


        int p = 17;
        int r = p--;
        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;
        System.out.println(t);
        System.out.println(t);

















    }
}
