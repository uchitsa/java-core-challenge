package src;

public class TaskT03N02Test {

    public static void main(String[] args) {
        testIsFirstAndLastCharsAreSame1();
        testIsFirstAndLastCharsAreSame2();
    }

    private static void testIsFirstAndLastCharsAreSame1() {
        Assert.assertEquals("testIsFirstAndLastCharsAreSame1", true, TaskT03N02.isFirstAndLastCharsAreSame("aloha"));
    }

    private static void testIsFirstAndLastCharsAreSame2() {
        Assert.assertEquals("testIsFirstAndLastCharsAreSame2", false, TaskT03N02.isFirstAndLastCharsAreSame("hello"));
    }
}
