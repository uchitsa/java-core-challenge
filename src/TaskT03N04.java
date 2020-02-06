import java.util.Scanner;

public class TaskT03N04 {

    public static void main(String[] args) {
        System.out.println("Enter the word:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Is it a palindrome?");
        System.out.println(isPalindrome(s) ? "Yes" : "No");
    }

    public static boolean isPalindrome(String s) {
        return s.replaceAll("\\W", "").equals((new StringBuilder(s)).reverse().toString());
    }
}
