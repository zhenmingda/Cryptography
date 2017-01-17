import java.util.Scanner;

/**
 * Created by dashu on 2017-01-12.
 */
public class HW1Modified {
    public static void main(String[] args) {
        Input();
    }

    private static void Input() {
        System.out.println("Do you want to encrypt or decrypt, input E or D");
        Scanner scanner = new Scanner(System.in);
        String condition = null;
        condition = scanner.nextLine();
        if (condition.equals("E")) {
            KeyForEncryption();
        } else if (condition.equals("D")) {
            KeyForDecryption();
        } else {
            System.out.println("Please input E or D for encrypt or decrypt");
            Input();
        }
    }

    private static void KeyForDecryption() {
        System.out.println("Input your Key (Capital)");
        Scanner scanner1 = new Scanner(System.in);
        String key = scanner1.nextLine();
        if (key.charAt(0) <'A' || (int) key.charAt(0) > 'Z' || key.length() > 1) {
            System.out.println("Wrong");
            KeyForDecryption();
        } else {
            System.out.println("Input your ciphertext");
            Scanner scanner2 = new Scanner(System.in);
            String cipherText = scanner2.nextLine().toUpperCase();
            char[] cipher;
            cipher = cipherText.toCharArray();
            System.out.print("Answer is: ");
            for (int i = 0; i < cipher.length; i++) {
                int med = (cipher[i] - 'A' - ( key.charAt(0)-'A')) % 26;
                if (med < 0) {
                    med = med + 26;
                }
                cipher[i] = (char) (med + 'A');
                System.out.print(cipher[i]);
            }
            System.out.println("");

        }
    }

    private static void KeyForEncryption() {
        System.out.println("Input your Key (Capital)");
        Scanner scanner1 = new Scanner(System.in);
        String key = scanner1.nextLine();
        if (key.charAt(0) < 'A' || key.charAt(0) > 'Z' || key.length() > 1) {
            System.out.println("Wrong");
            KeyForEncryption();
        } else {
            System.out.println("Input your plaintext");
            Scanner scanner2 = new Scanner(System.in);
            String plaintext = scanner2.nextLine().toUpperCase();
            char[] plain;
            plain = plaintext.toCharArray();
            System.out.print("Answer is: ");
            for (int i = 0; i < plain.length; i++) {
                int med = (plain[i] - 'A' +(key.charAt(0)-'A')) % 26;
                if (med < 0) {
                    med = med + 26;
                }
                plain[i] = (char) (med + 'A');
                System.out.print(plain[i]);
            }
            System.out.println("");
        }
    }
}
