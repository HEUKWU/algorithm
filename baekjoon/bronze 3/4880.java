import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] arr = br.readLine().split(" ");
            int[] s = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                s[i] = Integer.parseInt(arr[i]);
            }
            if (s[0] == 0 && s[1] == 0 && s[2] == 0) {
                break;
            }
            if ((s[1] - s[0]) == (s[2] - s[1])) {
                System.out.print("AP ");
                System.out.print((s[2] + (s[1] - s[0])));
                System.out.println();
            } else if ((s[1] / s[0]) == (s[2] / s[1])) {
                System.out.print("GP ");
                System.out.print((s[2] * (s[1] / s[0])));
                System.out.println();
            }
        }
    }
}
