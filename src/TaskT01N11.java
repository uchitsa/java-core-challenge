package src;

import java.util.Scanner;

public class TaskT01N11 {

    public static void main(String[] args) {
        int n = 0;
        while (n < 100 || n > 999) {
            System.out.println("Введите трёхзначное число:");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
        }
        System.out.println("Исходное число: " + getOldValue(n));
    }

    public static int getOldValue(int n) {
        return n % 10 * 10 + n / 100 * 100 + n % 100 / 10;
    }

}
