package HW_13;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SimpleTest {

    @BeforeTest
    public void setup(){
        System.out.println("Setup");
    }

    @AfterTest
    public void teardown(){
        System.out.println("Teardown");
    }

    @Test
    public void test(){
        assertTrue(true);
    }
}
