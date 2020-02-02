package src;

public class Assert {

    public static void assertEquals(String testName, int expected, int actual) {
        if (expected == actual)
            System.out.println(testName + " passed");
        else
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
    }

    public static void assertEquals(String testName, double precision, double expected, double actual) {
        if (((long) 100 * expected - (long) 100 * actual) < precision)
            System.out.println(testName + " passed");
        else
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
    }

    public static void assertEquals(String testName, boolean expected, boolean actual) {
        if (expected == actual)
            System.out.println(testName + " passed");
        else
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
    }
}
