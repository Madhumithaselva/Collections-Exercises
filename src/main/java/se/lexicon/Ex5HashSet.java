package se.lexicon;
import java.util.*;

public class Ex5HashSet {
    public static void main(String[] args){
        weekDaySet();
    }
    public static void weekDaySet(){
        //Creating HashSet and adding elements
        HashSet<String> weekDayHashSet= new HashSet<String>();
        weekDayHashSet.add("Sunday");
        weekDayHashSet.add("Monday");
        weekDayHashSet.add("Tuesday");
        weekDayHashSet.add("Wednesday");
        weekDayHashSet.add("Thursday");
        weekDayHashSet.add("Friday");
        weekDayHashSet.add("Saturday");

        //Displaying the set
        System.out.println("The HashSet values are:"+weekDayHashSet);

        //Convert hashset into Treeset
        TreeSet<String> weekDayTreeSet = new TreeSet<>(weekDayHashSet);

        //Dispaly the treeset which is sorted naturally
        System.out.println("Sorted elemnts are:"+weekDayTreeSet);


    }
}
