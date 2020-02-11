package src;

import java.util.Arrays;
import java.util.Scanner;

public class TaskT04N02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            ints[i] = x;
        }
        System.out.println("Result 2-axis array:");
        System.out.println(Arrays.deepToString(get2axisArray(ints)));
    }

    public static int[][] get2axisArray(int[] ints) {
        int[][] resArr = new int[ints.length][2];
        for (int i = 0; i < ints.length; i++) {
            int cnt = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j])
                    cnt++;
            }
            resArr[i][0] = ints[i];
            resArr[i][1] = cnt;
        }
        return resArr;
    }
}
