package org.matrix.alpha.kamlesh.selenium.assignments;
/*
Scenario:Fetch all the links present for the given heading
Steps:
 Navigate to https://www.makemytrip.com/
Fetch all the url for the given heading
 */
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {
@Test
    public void MakeMyTrip(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.makemytrip.com/");


    }
}
