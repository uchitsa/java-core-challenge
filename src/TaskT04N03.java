package src;

import java.util.Arrays;
import java.util.Scanner;

public class TaskT04N03 {

    public static final int MAX_TABLE_SIZE = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        System.out.println("Production table:");
        System.out.println(Arrays.deepToString(getProductionTable(n)));
    }

    public static int[][] getProductionTable(int n) {
        int[][] resArr = new int[n][n];
        for (int i = 1; i <= resArr.length; i++) {
            for (int j = 1; j <= resArr.length; j++)
                resArr[i - 1][j - 1] = i * j;
        }
        return resArr;
    }
}
