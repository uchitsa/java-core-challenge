public class TaskT01N03Test {

    public static void main(String[] args) {
        testFirstMin();
        testSecondMin();
        testThirdMin();
        testTwoMin();
        testThreeMin();
        testFourMin();
    }

    public static void testFirstMin() {
        Assert.assertEquals("testFirstMin", 1, TaskT01N03.minOfFourNumbers(1, 2, 3, 4));
    }

    public static void testSecondMin() {
        Assert.assertEquals("testSecondMin", 0, TaskT01N03.minOfFourNumbers(1, 0, 3, 4));
    }

    public static void testThirdMin() {
        Assert.assertEquals("testThirdMin", -1, TaskT01N03.minOfFourNumbers(1, 0, -1, 2));
    }

    public static void testTwoMin() {
        Assert.assertEquals("testTwoMin", 0, TaskT01N03.minOfFourNumbers(1, 0, 0, 2));
    }

    public static void testThreeMin() {
        Assert.assertEquals("testThreeMin", 0, TaskT01N03.minOfFourNumbers(0, 0, 0, 1));
    }

    public static void testFourMin() {
        Assert.assertEquals("testFourMin", 0, TaskT01N03.minOfFourNumbers(0, 0, 0, 0));
    }

}
