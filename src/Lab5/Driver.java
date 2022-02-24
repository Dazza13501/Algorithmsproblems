package Lab5;


public class Driver {

    public static void main(String[] args) {
        int result= Factorial.factorial(5);
        System.out.println("Expect: 120, Actual: "+result);
        int result1= Factorial.factorial(1);
        System.out.println("Expect: 1, Actual: "+result1);
     //   int result2= Factorial.factorial(-1);
     //   System.out.println("Expect: IllegalArgumentException, Actual: "+result2);

        double result3= MyPow.pow(3,3);
        System.out.println("Expect: 27.0, Actual: "+result3);
        double result4= MyPow.pow(4,0);
        System.out.println("Expect: 1.0, Actual: "+result4);

        String result5= Reverse.reverse("Hell");
        System.out.println("Expect: lleH, Actual "+result5);


    }
}
