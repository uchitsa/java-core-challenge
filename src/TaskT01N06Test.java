package src;

public class TaskT01N06Test {

    public static void main(String[] args) {
        testOneYearByTwentyPercent();
        testFiveYearsByTenPercent();
        testOneMonthByFiftyPercent();
    }

    public static void testOneYearByTwentyPercent() {
        Assert.assertEquals("testOneYearByTwentyPercent", 0.001, 121.94,
                TaskT01N06.calcHardPercent(100, 20, 12));
    }

    public static void testFiveYearsByTenPercent() {
        Assert.assertEquals("testFiveYearsByTenPercent", 0.001,
                1645.31, TaskT01N06.calcHardPercent(1000, 10, 60));
    }

    public static void testOneMonthByFiftyPercent() {
        Assert.assertEquals("testOneMonthByFiftyPercent", 0.001, 312.5,
                TaskT01N06.calcHardPercent(300, 50, 1));
    }

}
