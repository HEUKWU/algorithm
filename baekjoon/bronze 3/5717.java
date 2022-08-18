import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("0") && arr[1].equals("0")) {
                break;
            }
            int[] s = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                s[i] =Integer.parseInt(arr[i]);
            }
            System.out.println(s[0] + s[1]);
        }
    }
}
