package src;

import java.util.Scanner;

public class TaskT01N06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start amount: ");
        double startAmount = scan.nextDouble();
        while (startAmount <= 0) {
            System.out.println("Start amount must be greater than 0. Try again.");
            System.out.println("Enter start amount: ");
            startAmount = scan.nextDouble();
        }

        System.out.println("Enter year percent: ");
        double yearPercent = scan.nextDouble();

        System.out.println("Enter period in months: ");
        int periodInMonths = scan.nextInt();
        while (periodInMonths <= 0) {
            System.out.println("Period in months must be greater than 0. Try again.");
            System.out.println("Enter period in months: ");
            periodInMonths = scan.nextInt();
        }

        System.out.println("Hard percent is: " + calcHardPercent(startAmount, yearPercent, periodInMonths));

    }

    public static double calcHardPercent(double startAmount, double yearPercent, int periodInMonths) {
        return Math.round(startAmount * Math.pow(1 + (yearPercent/100) / 12, periodInMonths)*100)/100.0;
    }
}
