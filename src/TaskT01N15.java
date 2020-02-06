import java.util.Scanner;

public class TaskT01N15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scan.nextInt();
        System.out.println("Enter y:");
        int y = scan.nextInt();
        System.out.println("Enter z:");
        int z = scan.nextInt();

        System.out.println("condition A: " + conditionA(x, y));
        System.out.println("condition B: " + conditionB(x, y));
        System.out.println("condition C: " + conditionC(x, y));
        System.out.println("condition D: " + conditionD(x, y, z));
        System.out.println("condition E: " + conditionE(x, y, z));
        System.out.println("condition F: " + conditionF(x, y, z));
    }

    static boolean conditionA(int x, int y) {
        return (x % 2 == 1) && (y % 2 == 1);
    }

    static boolean conditionB(int x, int y) {
        return (x < 20) ^ (y < 20);
    }

    static boolean conditionC(int x, int y) {
        return (x == 0) || (y == 0);
    }

    static boolean conditionD(int x, int y, int z) {
        return (x < 0) && (y < 0) && (z < 0);
    }

    static boolean conditionE(int x, int y, int z) {
        return ((x % 5 == 0) && (y % 5 != 0) && (z % 5 != 0))
                || ((x % 5 != 0) && (y % 5 == 0) && (z % 5 != 0))
                || ((x % 5 != 0) && (y % 5 != 0) && (z % 5 == 0));
    }

    static boolean conditionF(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }
}
