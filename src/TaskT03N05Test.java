package src;

public class TaskT03N05Test {

    public static void main(String[] args) {
        testChangeFirstALastO1();
        testChangeFirstALastO2();
        testChangeFirstALastO3();
    }

    public static void testChangeFirstALastO1() {
        Assert.assertEquals("testСhangeFirstALastO1", "борадо", TaskT03N05.changeFirstALastO("борода"));
    }

    public static void testChangeFirstALastO2() {
        Assert.assertEquals("testСhangeFirstALastO2", "кало", TaskT03N05.changeFirstALastO("кола"));
    }

    public static void testChangeFirstALastO3() {
        Assert.assertEquals("testСhangeFirstALastO3", "молоко", TaskT03N05.changeFirstALastO("молоко"));
    }
}
