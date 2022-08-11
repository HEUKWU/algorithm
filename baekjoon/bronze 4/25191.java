import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr = br.readLine();
        String[] arr2 = br.readLine().split(" ");
        int n = Integer.parseInt(arr);
        int coke = Integer.parseInt(arr2[0]);
        int beer = Integer.parseInt(arr2[1]);

        int sum = 0;
        while (coke >= 2) {
            coke -= 2;
            sum++;
        }
        while (beer >= 1) {
            beer -= 1;
            sum++;
        }
        if (sum > n) {
            System.out.println(n);
        } else {
            System.out.println(sum);
        }
    }
}
