package src;

public class TaskT01N11Test {

    public static void main(String[] args) {
        testGetOldValue1();
        testGetOldValue2();
        testGetOldValue3();
        testGetOldValue4();
    }

    public static void testGetOldValue1() {
        Assert.assertEquals("testGetOldValue1", 321, TaskT01N11.getOldValue(312));
    }

    public static void testGetOldValue2() {
        Assert.assertEquals("testGetOldValue2", 789, TaskT01N11.getOldValue(798));
    }

    public static void testGetOldValue3() {
        Assert.assertEquals("testGetOldValue3", 110, TaskT01N11.getOldValue(101));
    }

    public static void testGetOldValue4() {
        Assert.assertEquals("testGetOldValue4", 998, TaskT01N11.getOldValue(989));
    }
}
