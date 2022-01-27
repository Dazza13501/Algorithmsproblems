package Lab1;

public class TestMyMath {

    public static void main(String[] args) {
        //smallest number
        //expected 33
        int test1 = MyMath.smallestNum(33, 66, 77);
        System.out.println("Test1\n\nExpected: 33 \nActual: " + test1);

        //expected 20
        int test2 = MyMath.smallestNum(45, 20, 60);
        System.out.println("\nTest2\n\nExpected: 20 \nActual: " + test2);

        //expected 4
        int test3 = MyMath.smallestNum(6, 5, 4);
        System.out.println("\nTest3\n\nExpected: 4 \nActual: " + test3);

        //pow
        //expected 9
        int test4= MyMath.power(4,2);
        System.out.println("\nTest4\n\nExpected: 9 \nActual: "+test4);
    }
}
