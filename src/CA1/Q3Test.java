package CA1;

import java.util.Arrays;

public class Q3Test {

    public static void main(String[] args) {
        int[] values= {14, 23, 5, 10, 9};
        Q3.bubbleSort(values);
        System.out.println("Bubble expected: 5, 9, 10, 14, 23 \nActual:" + Arrays.toString(values));
    }
}
