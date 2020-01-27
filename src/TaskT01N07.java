package src;

public class TaskT01N07 {

    public static void main(String[] args) {
        System.out.println("Число Пи с точностю до сотых равно " + getPi());
    }

    public static double getPi() {
        final double PRECISION = 0.01;
        return Math.round(100 * Math.PI) * PRECISION;
    }
}
