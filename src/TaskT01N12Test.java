package src;

public class TaskT01N12Test {

    public static void main(String[] args) {
        testGetAngleOfTime1();
        testGetAngleOfTime2();
        testGetAngleOfTime3();
    }

    private static void testGetAngleOfTime1() {
        src.Assert.assertEquals("testGetAngleOfTime1", 0.001, 0, src.TaskT01N12.getAngleOfTime(12, 0, 0));
    }

    private static void testGetAngleOfTime2() {
        src.Assert.assertEquals("testGetAngleOfTime2", 0.001, 90, src.TaskT01N12.getAngleOfTime(3, 0, 0));
    }

    private static void testGetAngleOfTime3() {
        src.Assert.assertEquals("testGetAngleOfTime3", 0.001, 120, src.TaskT01N12.getAngleOfTime(21, 0, 0));
    }
}
