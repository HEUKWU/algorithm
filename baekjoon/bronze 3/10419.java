import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int s = 0;
            int d = scanner.nextInt();
            for (int j = 1; j <= d; j++) {
                if (d >= j * j + j) {
                    s = j;
                } else {
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
