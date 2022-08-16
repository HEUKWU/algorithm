import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] s = new int[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(s);
        char[] a = new char[3];
        String s1 = br.readLine();
        for (int i = 0; i < s.length; i++) {
            a[i] = s1.charAt(i);
            if (a[i] == 'A') {
                System.out.print(s[0] + " ");
            } else if (a[i] == 'B') {
                System.out.print(s[1] + " ");
            } else if (a[i] == 'C') {
                System.out.print(s[2] + " ");
            }
        }
    }
}
