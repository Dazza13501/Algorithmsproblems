package Lab3;

public class TestEncryptCaesar {

    public static void main(String[] args) {


        String test1= EncryptCaesar.encryptCaesarCipher("PJUHGF", 3);
        System.out.println("Expected: SMXKJI Actual: "+test1);

        String test2= EncryptCaesar.encryptCaesarCipher("ABCDEZ", 3);
        System.out.println("Expected: DEFGHC Actual: "+test2);

    }
}

