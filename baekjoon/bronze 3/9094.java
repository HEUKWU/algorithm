import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            if (sum + c > t) {
                System.out.println(count);
                return;
            }
            sum += c;
            count++;
        }
        System.out.println(count);
    }
}
