package se.lexicon;
import java.util.*;
import java.lang.*;

public class Ex9CarHashMap {
    public static void main(String[] args){
        carHashMap();
    }
    public static void carHashMap(){
        //Create and populate HashMap
        HashMap<Integer,String> carHM = new HashMap<Integer,String>();
        carHM.put(1,"Volvo");
        carHM.put(2,"VW");
        carHM.put(3,"Tesla");
        carHM.put(4,"Polestar");
        carHM.put(5,"BMW");

        //Displaying the hashmap
        System.out.println("HashMap of id and car brand");
        for (Map.Entry m:carHM.entrySet()){
            System.out.println("Id:"+m.getKey()+", Car brand:"+m.getValue());
        }
    }
}
