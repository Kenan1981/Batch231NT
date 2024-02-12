package d20instanceblock_oop;

public class Car extends Vehicle{


    public Car(){
        super();//2
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda",2024,"Elektirikli");
        System.out.println("Sport");
    }

}
