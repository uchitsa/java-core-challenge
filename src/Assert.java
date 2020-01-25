package src;

public class Assert {
    
    public static void assertEquals(String testName, int expected, int actual) {
        if (expected == actual)
            System.out.println(testName + " passed");
        else
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
    }
}
