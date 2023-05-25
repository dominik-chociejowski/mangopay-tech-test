import io.cucumber.java.After;

import static com.mangopay.TestBase.driver;

public class Hooks {
    @After
    public static void teardown() {
        driver.quit();
    }
}
