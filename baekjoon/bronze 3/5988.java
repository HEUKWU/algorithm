import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.next().split("");
            System.out.println(Integer.parseInt(arr[arr.length - 1]) % 2 == 0 ? "even" : "odd");
        }
    }
}
