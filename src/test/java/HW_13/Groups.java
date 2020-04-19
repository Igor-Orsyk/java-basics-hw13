package HW_13;

import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class Groups {


    @BeforeSuite
    public void setup(){ System.out.println("Setup phone"); }

    @AfterSuite
    public void teardown(){ System.out.println("Teardown phone"); }

    @BeforeGroups("add_device")
    public void beforeGroup(){ System.out.println("Before group"); }

    @AfterGroups("add_device")
    public void afterGroup(){ System.out.println("After group"); }

    @BeforeMethod
    public void beforeMethod(){ System.out.println("User login"); }

    @AfterMethod
    public void afterMethod(){ System.out.println("User logout"); }

    @Test(groups = {"add_device"})
    public void addLpdTest(){ System.out.println("Add lpd"); }

    @Test(groups = {"add_device"})
    public void addDpdTest(){ System.out.println("Add dpd"); }

    @Test(groups = {"dashboard"}, dependsOnGroups = {"add_device"})
    public void checkDevicesTilesTest(){ System.out.println("Check device tile"); }

    @Test(groups = {"dashboard"}, dependsOnGroups = {"add_device"}, enabled = false)
    public void checkDevicesIconTest(){ System.out.println("Check device tile"); }
}

