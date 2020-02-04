package src;

import java.util.Scanner;

public class TaskT03N02 {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Is the first and last chars of string are same? ");
        System.out.println(isFirstAndLastCharsAreSame(s) ? "Yes" : "No");
    }

    static boolean isFirstAndLastCharsAreSame(String s) {
        return s.charAt(0) == s.charAt(s.length() - 1);
    }
}
