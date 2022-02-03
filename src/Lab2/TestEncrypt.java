package Lab2;

public class TestEncrypt {

    public static void main(String[] args) {

        String test= Encrypter.encryptColumn("This is a secret message", 4);
        System.out.println(test);
    }
}
