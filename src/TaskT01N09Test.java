package src;

public class TaskT01N09Test {

    public static void main(String[] args) {
        testCalaSumOfTwoSqrs();
        testCalcSqrtOneMinusSqrSinX();
    }

    public static void testCalaSumOfTwoSqrs() {
        Assert.assertEquals("testCalaSumOfTwoSqrs", 5, TaskT01N09.calcSqrtOFSumTwoSqrs(3, 4));
    }

    public static void testCalcSqrtOneMinusSqrSinX() {
        Assert.assertEquals("testCalcSqrtOneMinusSqrSinX", 1.0, TaskT01N09.calcSqrtOneMinusSqrSinX(Math.PI));
    }
}
