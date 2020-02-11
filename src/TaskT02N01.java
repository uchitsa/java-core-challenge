package src;

import java.util.Scanner;

public class TaskT02N01 {

    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Average of thses three: " + getAverageOfThree(a, b, c));
    }

    public static int getAverageOfThree(int a, int b, int c) {
        if (a > b)
            if (b > c)
                return b;
            else if (a > c) {
                return c;
            } else {
                return a;
            }
        else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }
}
