public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            m += sum;
        }
        System.out.println(m);
    }
}
