/**
 * Created by dashu on 2017-01-12.
 */
public class HW1 {
    public static void main(String[] args) {
        String x = "BEEAKFYDJXUQYHYJIQRYHTYJIQFBQDUYJIIKFUHCQD";
        //char[] plain = x.toCharArray();

        char[] plain;
        //  System.out.println((int)'A');

      for (int j = 1; j< 26; j++) {
           plain = x.toCharArray();
        for (int i = 0; i < plain.length; i++) {

                int med = ((int) plain[i] - 65 - j) % 26;
                // System.out.print(med);
                if (med < 0) {
                    med = med + 26;
                }
                plain[i] = (char) (med + 65);
                System.out.print(plain[i]);

            }
            System.out.println("");
        }
    }
}
