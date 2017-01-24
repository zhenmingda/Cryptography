import java.util.Scanner;

/**
 * Created by dashu on 2017/1/23.
 */
public class HW2 {
    private static String cipherText;
    public int i = 1;

    public static void main(String[] args) {
        cipherText = "XBBALBUQXHHTKOWWGWLZBRQWVZWIMDJ";
        HW2 hw2 = new HW2();
        hw2.DecideKey();
    }

    private void DecideKey() {


        for (int initialKey = 0; initialKey < 26; initialKey++) {
            char[] cipher = cipherText.toCharArray();
            int med = (cipher[0] - 'A' - (initialKey)) % 26;

            if (med < 0) {
                med = med + 26;
            }
            cipher[0] = (char) (med + 'A');

            String plainText = cipher[0] + StreamCipher(cipher, cipher[0]);
            System.out.println(plainText);
            i = 1;
        }
    }

    private String StreamCipher(char[] cipher, char KEY) {

        int key = (KEY - 'A');
        int med = (cipher[i] - 'A' - (key)) % 26;
        if (med < 0) {
            med = med + 26;
        }
        cipher[i] = (char) (med + 'A');
        if (i >= cipher.length - 1) {
            return String.valueOf(cipher[i]);
        }

        return cipher[i] + StreamCipher(cipher, cipher[i++]);

    }
}
