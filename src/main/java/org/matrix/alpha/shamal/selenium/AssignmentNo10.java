/*
* Scenarios: Verify Patients module Homepage UI components
Steps:
Navigate to http://wonske.com/HMS/hospital/index.html
Click on Patients module Click here link
Enter username and password
Verify below UI components are displayed or not
*/
package org.matrix.alpha.shamal.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo10 {

    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyUiComponent(){

        driver.get("http://wonske.com/HMS/hospital/index.html");

        driver.manage().window().maximize();


    }
}
