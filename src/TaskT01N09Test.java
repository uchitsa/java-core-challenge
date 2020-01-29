package src;

public class TaskT01N09Test {

    public static void main(String[] args) {
        testCalaSumOfTwoSqrs();
        testCalcSqrtOneMinusSqrSinX();
        testCalcOneDivSqrOfPolynom();
        testCalcSumTwoSqrsDiv2SqrX();
        testCalcSumOfTwoAbs();
    }

    public static void testCalaSumOfTwoSqrs() {
        Assert.assertEquals("testCalaSumOfTwoSqrs", 0.001, 5, TaskT01N09.calcSqrtOFSumTwoSqrs(3, 4));
    }

    public static void testCalcSqrtOneMinusSqrSinX() {
        Assert.assertEquals("testCalcSqrtOneMinusSqrSinX", 0.001, 1.0, TaskT01N09.calcSqrtOneMinusSqrSinX(Math.PI));
    }

    public static void testCalcOneDivSqrOfPolynom() {
        Assert.assertEquals("tesCalcOneDivSqrOfPolynom", 0.001, 0.25, TaskT01N09.calcOneDivSqrOfPolynom(1, 3, 6, 2));
    }

    public static void testCalcSumTwoSqrsDiv2SqrX() {
        Assert.assertEquals("testCalcSumTwoSqrsDiv2SqrX", 0.001, 0.922, TaskT01N09.calcSumTwoSqrsDiv2SqrX(2));
    }

    public static void testCalcSumOfTwoAbs() {
        Assert.assertEquals("testClcSumOfTwoAbs", 0.001, 1, TaskT01N09.calcSumOfTwoAbs(-1));
    }
}
