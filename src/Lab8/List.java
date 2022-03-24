package Lab8;
import java.util.*;

public class List {

    public static void main(String[] args) {


        java.util.LinkedList<String> ll = new java.util.LinkedList<String>();

        ll.add("Ireland");
        ll.add("United Kingdom");
        ll.add("United States");
        ll.add("France");
        ll.add("Germany");
        ll.add("Japan");

        System.out.println("Normal list: " +ll);

        ll.addFirst("Italy");

        System.out.println("List with addFirst(): " +ll);

        ll.addLast("South Korea");

        System.out.println("List with addLast(): " +ll);

        ll.removeFirst();

        System.out.println("List with removeFirst(): " +ll);

        ll.removeLast();

        System.out.println("List with removeLast(): " +ll);

        ll.getFirst();

        System.out.println("List with getFirst(): " +ll.getFirst());

        ll.getLast();

        System.out.println("List with getLast(): " +ll.getLast());


    }
}