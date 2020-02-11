package src;

public class TaskT04N01Test {
    public static void main(String[] args) {
        testGetArray1toN1();
        testGetArray1toN2();
        testGetArray1toN3();
    }

    public static void testGetArray1toN1() {
        Assert.assertEquals("testGetArray1toN1", new int[]{1, 2, 3, 4},
                TaskT04N01.getArray1toN(4));
    }

    public static void testGetArray1toN2() {
        Assert.assertEquals("testGetArray1toN2", new int[]{1},
                TaskT04N01.getArray1toN(1));
    }

    public static void testGetArray1toN3() {
        Assert.assertEquals("testGetArray1toN3", new int[]{},
                TaskT04N01.getArray1toN(0));
    }
}
