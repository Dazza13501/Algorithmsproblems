package Lab9;

import java.util.*;

public class UsingSets {
    public static void main(String[] args) {


        Set<String> names;
        names = new TreeSet<>();

        names.add("Romeo");
        names.add("Harry");
        names.add("Fred");
        names.remove("Fred");
        names.remove("Olly");

        for (String name : names) {
            System.out.println(name);
        }

        if(names.contains("Romeo")){
            System.out.println("Romeo is here");
        }
        else{
            System.out.println("Romeo is not here");
        }



    }
}
