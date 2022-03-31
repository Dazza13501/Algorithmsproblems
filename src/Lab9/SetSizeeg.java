package Lab9;

import java.util.*;

public class SetSizeeg {

    public static void main(String args[])
    {

        Set<String> set = new HashSet<String>();

        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        System.out.println("Set: " + set);

        System.out.println("The size of the set is: " + set.size());
}
}
