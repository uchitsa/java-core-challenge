public class TaskT01N02Test {

    public static void main(String[] args) {
        testFirstMin();
        testSecondMin();
        testThirdMin();
        testTwoMin();
        testThreeMin();
    }

    public static void testFirstMin() {
        Assert.assertEquals("testFirstMin", 1, TaskT01N02.minOfThreeNumbers(1, 2, 3));
    }

    public static void testSecondMin() {
        Assert.assertEquals("testSecondMin", 0, TaskT01N02.minOfThreeNumbers(1, 0, 3));
    }

    public static void testThirdMin() {
        Assert.assertEquals("testThirdMin", -1, TaskT01N02.minOfThreeNumbers(1, 0, -1));
    }

    public static void testTwoMin() {
        Assert.assertEquals("testTwoMin", 0, TaskT01N02.minOfThreeNumbers(1, 0, 0));
    }

    public static void testThreeMin() {
        Assert.assertEquals("testThreeMin", 0, TaskT01N02.minOfThreeNumbers(0, 0, 0));
    }
}
