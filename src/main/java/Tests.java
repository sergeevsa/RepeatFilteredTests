import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

    /**
     * это как будто касса стартанула в бефор класс
     */
    private static boolean started = false;

    @BeforeClass
    public static void beforeClass() {
        if (!started) {
            System.out.println("beforeClass");
            started = true;
        }
    }

    @Before
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }
}
