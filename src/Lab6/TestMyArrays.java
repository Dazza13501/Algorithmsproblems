package Lab6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMyArrays {

    public static void main(String[] args) {
        int[] a = {55, 109, 12, 88};
        MyArrays.insertionSort(a);
        System.out.println("Insertion expected: 12 55 88 109 \nActual:" + Arrays.toString(a));

        int[] b = {12,8,98,56,75};
        MyArrays.binarySearch(b, 8 );
        System.out.println("Expected: 1 \nActual: " + Arrays.toString(b));

        int [] c = {12,45,86,23,78,91};
        MyArrays.mergeSort(a);
        System.out.println("Expected: 12 23 45 78 86 91 \nActual: "+Arrays.toString(c));
    }
}

