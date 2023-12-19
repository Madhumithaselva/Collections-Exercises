package se.lexicon;
import java.util.*;
import java.lang.*;

public class SuperHero implements Comparable<SuperHero>{
    private int id;
    private String name;
    private int age;

    //Constructor,getters and setters
    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int compareTo(SuperHero hero){
        if(age==hero.age){
            return 0;
        } else if (age>hero.age) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args){
        //Creating the list
        List<SuperHero> heroList= new ArrayList<>();
        heroList.add(new SuperHero(1,"Ulf",35));
        heroList.add(new SuperHero(2,"Fredrik",39));
        heroList.add(new SuperHero(3,"Ali",28));
        heroList.add(new SuperHero(4,"Erik",29));

        //Sorting the list
        Collections.sort(heroList);

        //Display the list
        for(SuperHero hero: heroList)
            System.out.println("Id: "+hero.id
                    +", Name:"+hero.name
                    +", Age: "+hero.age);
    }
}
