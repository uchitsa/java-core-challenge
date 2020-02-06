import java.util.Scanner;

public class TaskT03N03 {

    public static void main(String[] args) {
        System.out.println("Enter the word:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println("First half of your word is:");
        System.out.println(getFirstHalfWord(word));
    }

    public static String getFirstHalfWord(String s) {
        return s.substring(0, s.length() / 2);
    }
}
