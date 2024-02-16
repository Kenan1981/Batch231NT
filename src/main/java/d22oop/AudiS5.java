package d22oop;

public class AudiS5 implements Motor, Fren, Klima {
    @Override
    public void turbo() {
        System.out.println("Audi S5 Turbo Motor");
    }

    @Override
    public void eco() {
        System.out.println("Audi S5 Ekonomik Motor");
    }

    @Override
    public void gas() {
        System.out.println("Audi S5 LPG");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 ESP");
    }

    @Override
    public void abs() {
        System.out.println("Audi S5 ABS");
    }

    @Override
    public void dijital() {
        System.out.println("Audi S5 Dijital Klima");
    }

    @Override
    public void analog() {
        System.out.println("Audi S5 Analog Klima");
    }
}
