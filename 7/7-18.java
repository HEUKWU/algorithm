public class Main {
    static DanceRobot d;
    static SingRobot s;
    static DrawRobot dr;
    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            d = (DanceRobot)robot;
            d.dance();
        } else if (robot instanceof SingRobot) {
            s = (SingRobot)robot;
            s.sing();
        } else if (robot instanceof DrawRobot) {
            dr = (DrawRobot)robot;
            dr.draw();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
