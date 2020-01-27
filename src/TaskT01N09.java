package src;

import java.util.Scanner;

public class TaskT01N09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public static double calcSqrtOFSumTwoSqrs(double x1, double x2) {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
    }

    public static double calcSqrtOneMinusSqrSinX(double x) {
        return Math.sqrt(1 - Math.pow(Math.sin(x), 2));
    }

}
