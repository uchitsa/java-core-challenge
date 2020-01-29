package src;

public class TaskT01N10Test {

    public static void main(String[] args) {
        testReverseNumber1();
        testReverseNumber2();
        testReverseNumber3();
    }

    public static void testReverseNumber1() {
        Assert.assertEquals("testReverseNumber1", 234, TaskT01N10.reverseNumber(432));
    }

    public static void testReverseNumber2() {
        Assert.assertEquals("testReverseNumber2", 1, TaskT01N10.reverseNumber(100));
    }

    public static void testReverseNumber3() {
        Assert.assertEquals("testReverseNumber3", 987, TaskT01N10.reverseNumber(789));
    }
}
