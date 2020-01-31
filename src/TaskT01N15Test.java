public class TaskT01N15Test {

    public static void main(String[] args) {
        testConditionA1();
        testConditionA2();
        testConditionB1();
        testConditionB2();
        testConditionC1();
        testConditionC2();
        testConditionD1();
        testConditionD2();
        testConditionE1();
        testConditionE2();
        testConditionF1();
        testConditionF2();
    }

    public static void testConditionA1() {
        src.Assert.assertEquals("testConditionA1", true, TaskT01N15.conditionA(3, 5));
    }

    public static void testConditionA2() {
        src.Assert.assertEquals("testConditionA2", false, TaskT01N15.conditionA(2, 5));
    }

    public static void testConditionB1() {
        src.Assert.assertEquals("testConditionB1", true, TaskT01N15.conditionB(25, 5));
    }

    public static void testConditionB2() {
        src.Assert.assertEquals("testConditionB2", false, TaskT01N15.conditionB(25, 30));
    }

    public static void testConditionC1() {
        src.Assert.assertEquals("testConditionС1", true, TaskT01N15.conditionC(0, 5));
    }

    public static void testConditionC2() {
        src.Assert.assertEquals("testConditionС2", false, TaskT01N15.conditionC(25, 5));
    }

    public static void testConditionD1() {
        src.Assert.assertEquals("testConditionD1", true, TaskT01N15.conditionD(-1, -2, -3));
    }

    public static void testConditionD2() {
        src.Assert.assertEquals("testConditionD2", false, TaskT01N15.conditionD(1, -2, -3));
    }

    public static void testConditionE1() {
        src.Assert.assertEquals("testConditionE1", true, TaskT01N15.conditionE(10, 2, 3));
    }

    public static void testConditionE2() {
        src.Assert.assertEquals("testConditionE2", false, TaskT01N15.conditionE(10, -20, -3));
    }

    public static void testConditionF1() {
        src.Assert.assertEquals("testConditionF1", true, TaskT01N15.conditionF(101, -2, -3));
    }

    public static void testConditionF2() {
        src.Assert.assertEquals("testConditionF2", false, TaskT01N15.conditionF(10, 20, 30));
    }
}
