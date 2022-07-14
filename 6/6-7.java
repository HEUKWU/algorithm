public class Main {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int c, int d) {
        int a = (x - c) * (x - c);
        int b = (y - d) * (y - d);

        return Math.sqrt(a + b);
    }

}
