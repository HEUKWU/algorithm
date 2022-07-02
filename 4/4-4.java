public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int s = 1;
        int  num = 0;

        for (int i = 1; sum < 100; i++, s = -s) {
            num = i * s;
            sum += num;
        }

//        for (int i = 1; true; i++, s = -s) {
//            num = i * s;
//            sum += num;
//        }

        System.out.println("num = " + num);
        System.out.println("sum = " + sum);

    }
}
