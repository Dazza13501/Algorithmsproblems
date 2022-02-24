package Lab5;


public class MyPow {

    public static double pow(double x, int y){
        if (  y == 0)  // base case
            return 1;
        else {
            double result1 = pow(x, y-1);
            double result = x*result1;
            return result;
        }
    }
}
