package se.lexicon;
import java.util.*;

public class Ex6HashSetToArrayList {
    public static void main(String[] args) {
        weekDaySet();
    }

    public static void weekDaySet() {
        //Creating HashSet and adding elements
        HashSet<String> weekDayHashSet = new HashSet<String>();
        weekDayHashSet.add("Sunday");
        weekDayHashSet.add("Monday");
        weekDayHashSet.add("Tuesday");
        weekDayHashSet.add("Wednesday");
        weekDayHashSet.add("Thursday");
        weekDayHashSet.add("Friday");
        weekDayHashSet.add("Saturday");

        //Displaying the set
        System.out.println("The HashSet values are:" + weekDayHashSet);

        //Converting HashSet into Arraylist
        ArrayList<String> weekDayArrayList = new ArrayList<>(weekDayHashSet);

        //Display the ArrayList
        System.out.println("New ArrayList is : "+weekDayArrayList);
    }
}
