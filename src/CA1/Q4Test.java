package CA1;
import java.util.ArrayList;
import java.util.Collections;


public class Q4Test {
    public static void main(String[] args) {
        ArrayList <Q4> gm = new ArrayList<Q4>();
        gm.add(new Q4("The Last of Us", "19.99", "9.5"));
        gm.add(new Q4("Genshin Impact", "0", "9"));
        gm.add(new Q4("Uncharted 2: A Thief's End", "14.99", "10"));
        gm.add(new Q4("Bioshock Infinite", "24.99", "8"));

        Collections.sort(gm);
        System.out.println("Expected: Bioshock Infinite, Genshin Impact, The Last of Us, Uncharted 2: A Thief's End \nActual: ");
        for(Q4 str:gm){
            System.out.println("Title: " +str.title +" "+
                    str.price+" "+ str.review);
        }
    }
}
