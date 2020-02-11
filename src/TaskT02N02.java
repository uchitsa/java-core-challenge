package src;

import java.util.Scanner;

public class TaskT02N02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            ints[i] = x;
        }
        System.out.println("Sum of array is: " + getArraySum(ints));
    }

    public static long getArraySum(int[] ints) {
        long sum = 0L;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }
}
