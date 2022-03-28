//https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/examples-Java-recursion-recursive-methods
package CA1;

public class Q2 {

    /*   public static int range (int x, int y){
       if (y > x){
           return y + range(x, y - 1);
       }
       else{
           return y;
       }
    }
}
*/

public static int Fibonacci (long n){
    if (n ==1 || n == 2){
        return 1;
    }
    return Fibonacci(n - 1) + Fibonacci(n - 2);

}
}