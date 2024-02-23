package d26maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //HasMap arka planda nasıl çalışıryor?

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");

        capitals.put("Italy","Rome");
        capitals.put("Turkiye","Ankara");


        capitals.get("Turkiye");
        capitals.get("Turkiye");


        capitals.put("Turkiye","Istanbul");//Ankarayi siler



    }
}
