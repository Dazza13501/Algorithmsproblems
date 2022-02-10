package Lab3;

public class EncryptCaesar {

    public static String encryptCaesarCipher(String plaintext, int offset) {


        StringBuilder ciphertext = new StringBuilder();
        char ch=' ';

        if(offset>= 26){
            ch= (char)(plaintext.length()%26);
            ciphertext.append(ch);
        }
        else{
            for (int i = 0; i < plaintext.length() ; i++) {
                    if (plaintext.charAt(i) != ' ') {
                        ch = (char) (plaintext.charAt(i) + offset);
                        ciphertext.append(ch);

                        if (plaintext.charAt(i) == 'Z') {
                            ch = (char) (plaintext.charAt(i) + 'A'-'Z'+2);
                            ciphertext.append(ch);
                        }

                    } else {
                        ciphertext.append(" ");
                    }

            }
        }


        return ciphertext.toString();
    }
}
/*final int MAX_OFFSET =25;
if(offset > MAX_OFFSET){
offset %= (MAX_OFFSET + 1);
 */