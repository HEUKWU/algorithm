public class Main {
    static double sumArea(Shape[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println(sumArea(arr));

    }
}

abstract class Shape {
    Point p;

    public Shape(Point p) {
        this.p = p;
    }

    Shape() {
        this(new Point(0, 0));
    }

    abstract double calcArea();

    public Point getPosition() {
        return p;
    }

    public void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class Circle extends Shape {
    double r;

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    public Circle(double r) {
        this(new Point(0, 0), r);
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        if (width == height && width * height != 0) {
            return true;
        } else {
            return false;
        }
    }
}
