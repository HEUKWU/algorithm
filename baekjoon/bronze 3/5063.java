import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            int[] m = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                m[j] = Integer.parseInt(arr[j]);
            }
            if ((m[1] - m[2]) > m[0]) {
                System.out.println("advertise");
            } else if ((m[1] - m[2]) < m[0]) {
                System.out.println("do not advertise");
            } else {
                System.out.println("does not matter");
            }
        }
    }
}
