package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utillities.DateUtilis;
import utillities.ReadConfigFiles;

public class TestNgMavenExampleTest {
    private static final Logger Logger = LogManager.getLogger(TestNgMavenExampleTest.class);



    @Test
    public void rub() {
        System.out.println(DateUtilis.returnNextMonth());
    }
}
