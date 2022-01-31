package Lab2;

public class Encrypter {

    public static void main(String[] args) {

        String plainText = "This is a secret message";
        String cipherText= "", nothing ="";
        int rows;


        for(int i =0; i< plainText.length(); i++){

          if(plainText.charAt(i)==' ')
              continue;

          else
              nothing += plainText.charAt(i);
        }
       System.out.println(nothing);//make one word

        plainText=nothing;

        rows= plainText.length()/5;

     /*   if(rows % 5 !=0)

          rows++;  //row counter
*/
        System.out.println(rows%5);
        for(int j=0; j<5; j++){

            cipherText += plainText.charAt(j);


            for(int k=1; k<rows; k++){

                if(j+(k*5)>plainText.length())
                    continue;
                else
                    cipherText+= plainText.charAt(j+(k*5));


            }

        }



        System.out.println(cipherText);


    }
}
