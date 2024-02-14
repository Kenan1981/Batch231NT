package d22oop;

public class Accord extends Honda{
    //1-Honda'nın child'i extends ile yapıldı
    //2-@Override yazıldı
    //3-Abstract silindi
    //4-Suslu parantez ile body eklendi

    @Override
    public  void engine(){
        System.out.println("Gas 2.0 Turbo");
    }



}
