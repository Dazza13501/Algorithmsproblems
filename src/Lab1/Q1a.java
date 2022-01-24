package Lab1;

public class Q1a {

    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int c = 20;

        int small = a;

        if (small > b)
            small = b;

        if (small > c)
            small = c;

        System.out.println("Expected smallest number: 4 \nActual smallest number: " + small);

    }
}
