import java.util.Scanner;

public class TaskT01N02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Min value = " + min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        int res = a;

        if (res > b)
            res = b;
        if (res > c)
            res = c;

        return res;

    }
}

