package se.lexicon;
import java.lang.*;
import java.util.*;

public class Ch2HashMap {
    public static void main(String[] args){
        nameMap();
    }
    public static void nameMap(){
        //Create new HashMap and populate the values
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Ali@lexicon.se","Ali");
        hm.put("Fredrik@lexcon.se","Fredrik");
        hm.put("Ulf@lexicon.se","Ulf");

        //Display the hashMap
        System.out.println("HashMap values are:");
        for (Map.Entry m: hm.entrySet()){
            System.out.println("Key: "+m.getKey()+"Value: "+m.getValue());
        }

        //Create a new Set with keys
        HashSet<String> emailSet = new HashSet<>(hm.keySet());

        //Display the HashSet
        System.out.println("Set of email keys:");
        for(String email : emailSet){
            System.out.println(email);
        }
    }
}
