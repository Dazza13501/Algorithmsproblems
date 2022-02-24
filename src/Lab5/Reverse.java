package Lab5;


public class Reverse {

    public static String reverse(String str){

        if(str.isEmpty()){
            return str;
        }
        else{

            return reverse(str.substring(1))+ str.charAt(0);
        }


    }
}
