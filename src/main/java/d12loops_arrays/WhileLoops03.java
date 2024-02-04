package d12loops_arrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //      Palindrome: 121 <==> 121    123321 <==> 123321

        int k= 313;       //valuoff ile stringe cevirmeliyiz

        String m= String.valueOf(k);  //"312" olur
        String reversed =""; // ters cevrilmis olanı burada saklayacaz

        int n = m.length()-1; // son indexi alıp n ye yükledik

        while (n>=0){ // dongü son indexten basladı
            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed);  //"213"
        if (m.equals(reversed)){
            System.out.println("Palindrom");
        }else {
            System.out.println("palindrom değil");
        }




    }
}
