import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < n; i++) {
            String[] arr2 = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(arr2[j]);
            }

            System.out.println("Scenario #" + (i + 1) + ":");

            Arrays.sort(arr);

            if ((arr[0] * arr[0] + arr[1] * arr[1]) == arr[2] * arr[2]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            System.out.println();
        }
    }
}
