package se.lexicon;
import java.lang.*;
import java.util.*;

public class CarHashMap {
    public static void main(String[] args){
        carHM();
    }
    public static void carHM() {
        //Create a hashMap of Car
        HashMap<Integer,Car> carMap = new HashMap<Integer,Car>();

        //Populate the hashMap with id and ar values
        carMap.put(1,new Car(1,"Volvo","Volvo XC60"));
        carMap.put(2,new Car(2,"Volkswagen","VW Golf"));
        carMap.put(3,new Car(3,"Tesla","Tesla model 3"));
        carMap.put(4,new Car(4,"Polestar","Polestar 2"));
        carMap.put(5,new Car(5, "BMW","X5"));

        //Display only the car brands
        System.out.println("Car brands:");
        for(Map.Entry<Integer,Car> m : carMap.entrySet()){
            String brand=m.getValue().getBrand();
            System.out.println(brand);
        }
    }
}
