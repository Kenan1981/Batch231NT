package d19stringbuilder_buffer_accessmodifier_static;

public class Student02Runner {
    public static void main(String[] args) {

        ////Static class uyelerine ulasmak icin sadece class ismi yeterlidir
        System.out.println(Student02.stdName);//Ali Can

        ////age non-static oldugu icin, ona ulasmak icin object olusturmaliyiz
        Student02 ali=new Student02();
        System.out.println(ali.age);//18

        Student02.staticMethod();//Ben Static Bir Methodum
        ali.nonStaticMethod();//Ben non-satatic methodum



















    }
}
