package HW_13;

import org.testng.annotations.Test;


public class Priority {

    @Test(priority = 3)
    public void firstTest(){ System.out.println("First"); }

    @Test(priority = 2)
    public void secondTest(){ System.out.println("Second"); }

    @Test(priority = 1)
    public void thirdTest(){ System.out.println("Third"); }

}
