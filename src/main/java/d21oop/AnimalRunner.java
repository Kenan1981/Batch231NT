package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.bark();
        d.feedWithMilk();
        d.drink();
        d.eat();//Dogs eat...


        Bird b=new Bird();
        b.tweet();//Bİrds tweeet...
        b.drink();//Animals drink...

        Cat c= new Cat();
        c.feedWithMilk();
        //-------------------------------------------
        //a) Java ‘Multiple Inheritance’ i desteklemez. ‘Single Inheritance’ i destekler.
        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //  ‘Hierarchical Inheritance’ denir ve Java bunu kabul eder.

        /*c) Ama coklu parent'lardan yararlanamamak iyi olmadi.
        Ozelliklerini inherit etmek istedigimiz class'lar birden fazla ise (parent'lar)
        o durumda Java bize, Apartman tarzi yapilanma olusturmustur.
        ( 'Multi Level Inheritance') Java bunu kabul eder.*/
        //----------------------------------------------
        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)








    }
}
