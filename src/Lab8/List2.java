package Lab8;
import java.util.*;


public class List2 {

    public static void main(String[] args) {


        java.util.LinkedList<String> ll2 = new java.util.LinkedList<String>();


        ll2.add("Kay");
        ll2.add("Jay");
        ll2.add("May");
        ll2.add("Fay");
        System.out.println("Normal list: " +ll2);

        ListIterator<String> iterator= ll2.listIterator();

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.add("Ray");

        System.out.println("List with add iterator: " +ll2);

    }
}