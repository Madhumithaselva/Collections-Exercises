package se.lexicon;
import java.util.*;

public class Ex2WeekDay {
            public static void main(String[] args){
            weekDayList();
        }
        public static void weekDayList(){
            ArrayList<String> weekDay = new ArrayList<>();
            weekDay.add("Sunday");
            weekDay.add("Monday");
            weekDay.add("Tuesday");
            weekDay.add("Wednesday");
            weekDay.add("Thursday");
            weekDay.add("Friday");
            weekDay.add("Saturday");

            //Display the days of the week separately

            System.out.println("Days of the week are:");

            for (String day : weekDay){
                System.out.println(day);
            }
        }
    }
