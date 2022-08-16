import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < 9; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                if (Integer.parseInt(arr[j]) > max) {
                    max = Integer.parseInt(arr[j]);
                    indexA = i;
                    indexB = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((indexA + 1) + " " + (indexB + 1));
    }
}
