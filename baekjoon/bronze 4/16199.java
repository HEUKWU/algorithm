import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int y1 = Integer.parseInt(arr[0]);
        int y2 = Integer.parseInt(arr2[0]);
        int m1 = Integer.parseInt(arr[1]);
        int m2 = Integer.parseInt(arr2[1]);
        int d1 = Integer.parseInt(arr[2]);
        int d2 = Integer.parseInt(arr2[2]);

        //만 나이
        if (y1 == y2) {
            System.out.println(0);
        } else if (y1 < y2) {
            if (m1 > m2) {
                System.out.println(y2 - y1 - 1);
            } else if (m1 == m2) {
                if (d1 > d2) {
                    System.out.println(y2 - y1 - 1);
                } else if (d1 <= d2) {
                    System.out.println(y2 - y1);
                }
            } else if (m1 < m2) {
                System.out.println(y2 - y1);
            }
        }
        //세는 나이
        if (y1 == y2) {
            System.out.println(1);
        } else if (y1 < y2) {
            System.out.println(y2 - y1 + 1);
        }

        //연 나이
        System.out.println(y2 - y1);
    }
}
