package src;

public class TaskT01N07Test {
    public static void main(String[] args) {
        testPi();
    }

    public static void testPi(){
        Assert.assertEquals("testPI", 3.14, TaskT01N07.getPi());
    }
}
