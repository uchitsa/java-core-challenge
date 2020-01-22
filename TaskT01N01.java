import java.util.Scanner;

/**
 * Даны два числа, найти максимальное из них
 */

public class TaskT01N01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Max value = " + max(a, b));
    }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
