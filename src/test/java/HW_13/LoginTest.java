package HW_13;

import org.testng.annotations.*;

public class LoginTest {

    @DataProvider(name = "login")
    public static Object[][] arrays() {
        return new Object[][]{
                {"Orsyk", "Password"},
                {"Morsik", "password"}};
    }

    @Parameters({"name", "password"})
    @Test
    public void xmlLoginTest(String name, String password){
        System.out.println("User name: "+ name + " Password: " + password );
    }

    @Test(dataProvider = "login")
    public void LoginTest(String name, String password){
        System.out.println("User name: "+ name + " Password: " + password );
    }


}
