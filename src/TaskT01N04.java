package src;

import java.util.Scanner;

/**
 * Дано количство часов, вернуть количество секунд
 */
public class TaskT01N04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        System.out.println("Hours: " + hours + " includes seconds: " + getSecondsFromHours(hours));
    }

    public static int getSecondsFromHours(int hours) {
        final int SECONDS_IN_ONE_HOUR = 3600;
        return hours * SECONDS_IN_ONE_HOUR;
    }
}
