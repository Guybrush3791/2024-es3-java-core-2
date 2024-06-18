public class App {
    public static void main(String[] args) throws Exception {

        es1();
        // es2();
    }

    public static void es1() {

        // 1. Write a Java method to find the smallest number among three numbers.
        int x = 10;
        int y = -5;

        int min = minFunction(x, y);

        System.out.println("Min in x and y is: " + min);

        // printMinValue(x, y);
    }

    public static void es2() {

        int[] intValues = { 10, 20, 30, 40, 50 };
        int min = minFunction(intValues);

        System.out.println("Min in x and y is: " + min);
    }

    public static int minFunction(int n1) {

        return minFunction(n1, 0);
    }

    public static int minFunction(int n1, int n2 /* = 0 */) {

        int min = (n1 < n2) ? n1 : n2;

        return min;
    }

    public static int minFunction(int[] values) {

        return -1;
    }

    public static void printMinValue(int n1, int n2) {

        int min = minFunction(n1, n2);

        if (min < 0) {

            return;
        }

        System.out.println("Min is: " + min);
    }

    public static void printDivision(int x, int y) {

        if (y == 0) {

            return;
        }

        int div = x / y;
        System.out.println("Division is: " + div);
    }

    public static void test1() {
        // TODO
    }

    public static void test1(int x) {
        // TODO
    }

    public static void test1(int x, int y) {
        // TODO
    }

    public static void test1(double x) {
        // TODO
    }

    public static void test1(double x, double y) {
        // TODO
    }

    public static void test1(double x, int y) {
        // TODO
    }

    public static void test1(int x, double y) {
        // TODO
    }
}
