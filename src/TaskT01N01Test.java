public class TaskT01N01Test {

    public static void main(String[] args) {
        testFirstMax();
        testSecondMax();
        testFirstMaxNegative();
        testSecondMaxNegative();
    }

    public static void testFirstMax() {
        Assert.assertEquals("TaskT01N01Test.testFirstMax", 1, TaskT01N01.max(1, 0));
    }

    public static void testSecondMax() {
        Assert.assertEquals("TaskT01N01Test.testSecondMax", 1, TaskT01N01.max(0, 1));
    }

    public static void testFirstMaxNegative() {
        Assert.assertEquals("TaskT01N01Test.testFirstMaxNegative", -1, TaskT01N01.max(-1, -2));
    }

    public static void testSecondMaxNegative() {
        Assert.assertEquals("TaskT01N01Test.testSecondMaxNegative", -1, TaskT01N01.max(-2, -1));
    }
}
