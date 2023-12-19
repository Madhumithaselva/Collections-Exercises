package se.lexicon;
import java.util.*;

public class Ex4Sublist {
    public static void main(String[] args) {
        weekDayList();
    }

    public static void weekDayList() {
        List<String> weekDay = new ArrayList<>();
        weekDay.add("Sunday");
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Wednesday");
        weekDay.add("Thursday");
        weekDay.add("Friday");
        weekDay.add("Saturday");

        //Display the list
        System.out.println("Days of the week are:");
        System.out.println(weekDay);

        //New list using sublist
        List<String> newList = weekDay.subList(0,3);
        System.out.println("New list is :"+newList);
    }
}
