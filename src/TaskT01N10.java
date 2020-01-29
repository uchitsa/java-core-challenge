package src;

import java.util.Scanner;

public class TaskT01N10 {

    public static void main(String[] args) {
        int x = 0;
        while (x < 100 || x > 999) {
            System.out.println("Введите трёхзначное число:");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
        }
        System.out.println("Исходное число справа налево: " + reverseNumber(x));
    }

    public static int reverseNumber(int x) {
        return x % 10 * 100 + x % 100 - x % 10 + x / 100;
    }
}
