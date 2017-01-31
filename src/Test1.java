/**
 * Created by dashu on 2017/1/26.
 */
public class Test1 {

    public static void main(String[] args) {

     String key1 = "00010011";
        char []a=key1.toCharArray();

        char b[]=new char[15];
        System.arraycopy(a,0,b,0,8);
        for(int j=0;j<8;j++)
            System.out.print(b[j]);
        for(int i=8;i<=14;i++){
            b[i]= (char) (((int)b[i-4]+(int)b[i-3])%2);
            System.out.print((int)b[i]);
        }

System.out.println("");
        String cipherText = "10010000010100001000010010110110001111101001111101010100";
        String key = "00010011010111100010011010111100010011010111100010011010";
        char[] c = cipherText.toCharArray();
        char[] d = key.toCharArray();
        int[] e = new int[56];
        String j = "";
        for (int i = 0; i <= 55; i++) {
            e[i] = ((int) c[i] + (int) (d[i])) % 2;
            j = j + e[i];

            if ((i + 1) % 7 == 0) {
                int p = Integer.valueOf(j, 2);
                char q = (char) p;
                System.out.println(p + " " + q);
                j = "";
            }
        }

        //System.out.println(c);*/
    }
}


