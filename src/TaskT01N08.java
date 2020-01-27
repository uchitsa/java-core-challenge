package src;

import java.util.Scanner;

public class TaskT01N08 {

    public static void main(String[] args) {
        System.out.println("Вы ввели число " + readNumber());
    }

    public static int readNumber() {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
