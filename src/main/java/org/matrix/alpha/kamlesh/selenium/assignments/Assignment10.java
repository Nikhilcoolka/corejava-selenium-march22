package org.matrix.alpha.kamlesh.selenium.assignments;
/*Scenarios: Verify Patients module Homepage UI components

Steps:
Navigate to http://wonske.com/HMS/hospital/index.html
Click on Patients module Click here link
Enter username and password
Verify below UI components are displayed or not
username-test@gmail.com
pass-Test@123
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment10 {
    @Test
    public void TestNg(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://wonske.com/HMS/hospital/index.html");
        driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@class='form-control password']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
        boolean U1= driver.findElement(By.xpath("//span[text()=' Dashboard ']")).isDisplayed();
        System.out.println("Dashboard " +U1);
        boolean U2=driver.findElement(By.xpath("//span[text()=' Book Appointment ']")).isDisplayed();
        System.out.println("Book Appointment" +U2);
        boolean U3=driver.findElement(By.xpath("//span[text()=' Appointment History ']")).isDisplayed();
        System.out.println("Appointment History"+U3);
        boolean U4=driver.findElement(By.xpath("//span[text()=' Medical History ']")).isDisplayed();
        System.out.println("Medical History" +U4);

    }
}
