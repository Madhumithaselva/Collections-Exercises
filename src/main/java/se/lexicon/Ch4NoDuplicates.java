package se.lexicon;
import java.lang.*;
import java.util.*;

public class Ch4NoDuplicates {
    public static void main(String[] args){
        noDuplicates();
    }
    public static void noDuplicates(){
        int[] intArray = {1, 4, 4, 2, 6, 7};

        //Display array with duplicates
        System.out.println("Array values with duplicates");
        for(int i : intArray) {
            System.out.println(i);
        }

        //Collection to populate int values
        Set<Integer> noDuplicatesSet = new HashSet<>();

        //Populate the set with integer values
        for (int i : intArray){
            noDuplicatesSet.add(i);
        }

        //Display the aet without duplicates
        System.out.println("Set without duplicates:");
        for(int i: noDuplicatesSet){
            System.out.println(i);
        }
    }
}
