import java.util.Scanner;

public class TaskT01N03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println("Min value = " + minOfFourNumbers(a, b, c, d));
    }

    public static int minOfFourNumbers(int a, int b, int c, int d) {
        int min1 = a > b ? b : a;
        int min2 = c > d ? c : d;

        return min1 < min2 ? min1 : min2;
    }
}
