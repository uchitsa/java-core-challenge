package src;

import java.util.Arrays;
import java.util.Scanner;

public class TaskT04N01 {

    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Result array:");
        System.out.println(Arrays.toString(getArray1toN(n)));
    }

    public static int[] getArray1toN(int n) {
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = i + 1;
        }
        return intArray;
    }
}
