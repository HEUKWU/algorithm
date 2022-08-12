import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == b && b == c ) {
                sum = 10000 + (a * 1000);
            }else if(a != b && b != c && a != c) {
                sum = Math.max(a, Math.max(b, c)) * 100;
            }else {
                if(a == b || a == c) {
                    sum = 1000 + (a * 100);
                }else {
                    sum = 1000 + (b * 100);
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
