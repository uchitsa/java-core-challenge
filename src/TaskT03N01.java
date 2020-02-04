package src;

import java.util.Scanner;

public class TaskT03N01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.nextLine();
        System.out.println("Enter № of char:");
        int n = scan.nextInt();
        if (n >= 0 && n < s.length())
            System.out.println(getNthSymbol(s, n));
        else
            System.out.println("Uncorrect № of char");
    }

    static char getNthSymbol(String s, int n) {
        return s.charAt(n);
    }
}
