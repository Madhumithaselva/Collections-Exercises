package se.lexicon;
import java.util.*;

public class Ex8SortingHashSet {
    public static void main(String[] args) {
        namesHashSet();
    }

    public static void namesHashSet() {
        //Creating Hashset and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ali");
        set.add("Fredrik");
        set.add("Ulf");
        set.add("Eric");

        //Printing the elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Converting HashSet into TreeSet
        TreeSet<String> nameTreeSet= new TreeSet<>(set);

        //Display the TreeSet
        System.out.println("Sorted elements are:"+nameTreeSet);

    }
}
