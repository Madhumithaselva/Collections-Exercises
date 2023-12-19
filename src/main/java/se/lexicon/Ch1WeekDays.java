package se.lexicon;
import java.util.*;
import java.lang.*;

public class Ch1WeekDays {
    public static void main(String[] args){
        weekDay();
    }
    public static void weekDay(){
        //Create a set and populate it with days of the week
        Set<String> allDaysOfWeek = new HashSet<>();
        allDaysOfWeek.add("Sunday");
        allDaysOfWeek.add("Monday");
        allDaysOfWeek.add("Tuesday");
        allDaysOfWeek.add("Wednesday");
        allDaysOfWeek.add("Thursday");
        allDaysOfWeek.add("Friday");
        allDaysOfWeek.add("Saturday");

        //Dispaly the alldaysset
        System.out.println("All days st values are: "+allDaysOfWeek);

        //Create a weekend days set
        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        //Display the weekend days set
        System.out.println("Weekend days set values are:"+weekendDays);

        //Retain the common days in teh first set
        allDaysOfWeek.retainAll(weekendDays);

        //Display the modified alldaysof week set
        System.out.println("Common days in both sets: "+allDaysOfWeek);




    }
}
