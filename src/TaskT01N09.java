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

    public static double calcOneDivSqrOfPolynom(double a, double b, double c, double x) {
        return 1 / Math.sqrt(a * Math.pow(x, 2) + b * x + c);
    }

    public static double calcSumTwoSqrsDiv2SqrX(double x) {
        return (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
    }

    public static double calcSumOfTwoAbs(double x) {
        return Math.abs(x) + Math.abs(x + 1);
    }
}
