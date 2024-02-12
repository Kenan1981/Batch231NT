package d20instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba rengi:Siyah
        //Araba yakıt türü:Benzin

        InstanceBlock3 car2 = new InstanceBlock3("Kırmızı", "Dizel");
        System.out.println("Araba Rengi:" + car2.color);
        System.out.println("Araba yakıt türü:" + car2.fuelType);
        //Araba Rengi:Kırmızı
        //Araba yakıt türü:Dizel
    }
}
