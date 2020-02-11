package src;

import java.util.Scanner;

public class TaskT02N03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            ints[i] = x;
        }
        System.out.println("Max element of array is: " + getMaxInArray(ints));
    }

    public static int getMaxInArray(int[] ints) {
        int max = ints.length > 0 ? ints[0] : 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max)
                max = ints[i];
        }
        return max;
    }
}
