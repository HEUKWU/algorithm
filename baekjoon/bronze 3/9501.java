import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = 0; j < a; j++) {
                StringTokenizer s = new StringTokenizer(br.readLine());
                double v = Double.parseDouble(s.nextToken());
                double f = Double.parseDouble(s.nextToken());
                double c = Double.parseDouble(s.nextToken());
                if (b <= f / c * v) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
