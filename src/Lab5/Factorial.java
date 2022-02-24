package Lab5;// Factorial.java
// Recursive factorial method

public class Factorial {

    // Recursive definition of method factorial
    public static int factorial( int n )
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;

        else if(n<0){
            throw new IllegalArgumentException("Can't get the factorial of a negative number");

        }
        else {
            int result1 = factorial(n-1);
            int result = n * result1;
            return result;
        }
    }
}