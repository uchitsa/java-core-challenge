package src;

public class TaskT01N01Test {

    public static void main(String[] args) {
        testFirstMax();
        testSecondMax();
        testFirstMaxNegative();
        testSecondMaxNegative();
    }

    public static void testFirstMax() {
        src.Assert.assertEquals("TaskT01N01Test.testFirstMax", 1, src.TaskT01N01.max(1, 0));
    }

    public static void testSecondMax() {
        src.Assert.assertEquals("TaskT01N01Test.testSecondMax", 1, src.TaskT01N01.max(0, 1));
    }

    public static void testFirstMaxNegative() {
        src.Assert.assertEquals("TaskT01N01Test.testFirstMaxNegative", -1, src.TaskT01N01.max(-1, -2));
    }

    public static void testSecondMaxNegative() {
        src.Assert.assertEquals("TaskT01N01Test.testSecondMaxNegative", -1, src.TaskT01N01.max(-2, -1));
    }
}
