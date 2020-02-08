package src;

import java.util.Scanner;

public class TaskT03N05 {

    public static void main(String[] args) {
        System.out.println("Enter the word:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(changeFirstALastO(s));
    }

    public static String changeFirstALastO(String s) {
        int firstIndexA = s.indexOf('а');
        int lastIndexO = s.lastIndexOf('о');
        String neoS = "";
        if ((firstIndexA >= 0) && (lastIndexO >= 0)) {
            neoS = s.substring(0, firstIndexA).concat("о").concat(s.substring(firstIndexA + 1));
            neoS = neoS.substring(0, lastIndexO).concat("а").concat(neoS.substring(lastIndexO + 1));
        } else
            neoS = s;
        return neoS;
    }
}
