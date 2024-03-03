package d20instanceblock_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)
    public String color;

    public String fuelType;

    //instance block - Bu class'tan her object olusturuldugunda calisir
    {
        color = "Siyah";//Her otomobil varsayilan olarak siyah renkle uretilir
        fuelType = "Benzin";
    }


    public InstanceBlock3() {
        System.out.println("Araba rengi:" + color);
        System.out.println("Araba yakıt türü:" + fuelType);
    }

    //Default olarak siyah ve benzinle baslatmak istemezsek paramatreli constructor kullaniriz
    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

}
