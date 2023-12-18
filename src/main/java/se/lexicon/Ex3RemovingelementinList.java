package se.lexicon;
import java.util.*;

public class Ex3RemovingelementinList {
    public static void main(String[] args){
        weekDayList();
    }
    public static void weekDayList(){

        ArrayList<String> weekDay = new ArrayList<>();
        weekDay.add("Sunday");
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Wednesday");
        weekDay.add("Friday");
        weekDay.add("Saturday");
        //System.out.println(weekDay);

        System.out.println("ArrayList before insertion:"+weekDay);

        /*for (String day : weekDay){
            System.out.println(day);
        }*/

        weekDay.add(4,"Thursday");

        System.out.println("ArrayList after insertion: "+weekDay);

        /*for (String day : weekDay){
            System.out.println(day);
        }*/

    }
}
