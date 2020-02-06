package src;

import java.util.Scanner;

public class TaskT01N12 {
    private static final int DEGREES_OF_12_HOURS = 360;
    private static final int ONE_DAY_HOURS = 24;
    private final static int HALF_DAY_HOURS = 12;
    private final static int SECONDS_IN_MINUTE = 60;
    private final static int MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = -1;
        while (h < 0 || h >= ONE_DAY_HOURS) {
            System.out.println("Введите часы от 0 до 23:");
            h = scan.nextInt();
        }
        int m = -1;
        while (m < 0 || m >= MINUTES_IN_HOUR) {
            System.out.println("Введите минуты от 0 до 59:");
            m = scan.nextInt();
        }
        int s = -1;
        while (s < 0 || s >= SECONDS_IN_MINUTE) {
            System.out.println("Введите секунды от 0 до 59:");
            s = scan.nextInt();
        }
        System.out.printf("Угол часовой стрелки между началом суток и текущим временем равен %3.3f", getAngleOfTime(h, m, s));
    }

    static double getAngleOfTime(int h, int m, int s) {

        if (h > HALF_DAY_HOURS)
            h -= HALF_DAY_HOURS;
        double minutesPart = m + (double) s / SECONDS_IN_MINUTE;
        double hoursPart = (h + minutesPart / MINUTES_IN_HOUR) / HALF_DAY_HOURS;
        return hoursPart * DEGREES_OF_12_HOURS;
    }
}
