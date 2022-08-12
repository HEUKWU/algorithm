import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                if (Integer.parseInt(arr[j]) == 0) {
                    sum++;
                }
            }
            if (sum == 1) {
                System.out.println("A");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 3) {
                System.out.println("C");
            } else if (sum == 4) {
                System.out.println("D");
            } else if (sum == 0) {
                System.out.println("E");
            }
            sum = 0;
        }
    }
}
