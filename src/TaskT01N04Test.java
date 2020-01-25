package src;

public class TaskT01N04Test {

    public static void main(String[] args) {
        testOneHourToSeconds();
        testTwelveHoursToSeconds();
        testTwentyFourHoursToSeconds();
    }

    public static void testOneHourToSeconds() {
        Assert.assertEquals("testOneHourToSeconds", 3600, TaskT01N04.getSecondsFromHours(1));
    }

    public static void testTwelveHoursToSeconds() {
        Assert.assertEquals("testTwelveHoursToSeconds", 43200, TaskT01N04.getSecondsFromHours(12));
    }

    public static void testTwentyFourHoursToSeconds() {
        Assert.assertEquals("testTwentyFourHoursToSeconds", 86400, TaskT01N04.getSecondsFromHours(24));
    }
}
