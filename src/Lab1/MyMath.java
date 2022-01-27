package Lab1;

public class MyMath {

    //a. calculate the smallest numbers out of three ints
    public static int smallestNum(int a, int b, int c) {
      int num;

        if (a<b)
            num = a;

        else if(b<c)
            num=b;
        else
            num=c;
        return num;
    }

    public static int power(int a, int b){
        int result=a;
      for(int i=0;i<b;i++){

          result = result*2;
      }

    return result;
    }
}
