package se.lexicon;
import java.util.*;
import java.lang.String;

public class Ex7SortHashSet {
    public static void main(String[] args){
        namesHashSet();
    }
    public static void namesHashSet(){
        //Creating Hashset and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ali");
        set.add("Fredrik");
        set.add("Ulf");
        set.add("Eric");

        //Printing the elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
           System.out.println(itr.next());
        }

        //Converting hashSet into Arraylist
        ArrayList<String> nameArrayLisy= new ArrayList<>(set);

        //Manually sorting the list
        Collections.sort(nameArrayLisy);

        //Print the sorted ArrayList
        System.out.println("Sorted ArrayList is: "+nameArrayLisy);
    }
}
