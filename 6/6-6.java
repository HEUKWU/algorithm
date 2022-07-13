public class Main {
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

    static double getDistance(int x, int y, int x1, int y1) {
        int a = (x1 - x) * (x1 - x);
        int b = (y1 - y) * (y1 - y);

        return Math.sqrt(a + b);
    }
}
