package Lab2;

public class Encrypter {

    public static String encryptColumn(String plaintext, int numColumns) {

        StringBuilder cipherText = new StringBuilder("");
        int numRows=5;

        for (int i = 0; i < plaintext.length(); i++) {

            if (plaintext.charAt(i) == ' ')
                continue;

            else
                plaintext += plaintext.charAt(i);
        }
        System.out.println(plaintext);//make one word i.e no spaces

        for(int col=0; col<numColumns; col++ ){

            int index= col;
            for(int row=0; row< numRows; row++){
                cipherText= cipherText + plaintext[index];
                index += numColumns;
            }

        }

   return cipherText;



        }
    }

