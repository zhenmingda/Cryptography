/**
 * Created by dashu on 2017-01-12.
 */
public class OneTimePad {
    public static void main(String[] args) {
        String cipherText = "ANKYODKYUREPFJBYOJDSPLREYIUNOFDOIUERFPLUYTS";
        String plainText = "MEET ME ON FRIDAY AT SIX PM";
        //char[] plain = x.toCharArray();

        char[] cipher = cipherText.toCharArray();
        char[] plain = plainText.toCharArray();

        char[] key = new char[100];
        //  System.out.println((int)'A');


        for (int i = 0; i < plainText.length(); i++) {
            int med=0;
            if (plain[i] == ' ') {
               med = ((int) cipher[i] - 91);
            } else {
                med = ((int) cipher[i] - (int) plain[i]);
            }
            // System.out.print(med);
            if (med < 0) {
                med = med + 27;
            }
            key[i] = (char) (med + 65);
            System.out.print(key[i]);

        }
        // System.out.println("");

    }
}
