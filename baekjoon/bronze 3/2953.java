import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            if (s.contains("FBI")) {
                System.out.print(i + 1 + " ");
                n++;
            }
        }
        if (n == 0) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
