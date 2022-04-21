package org.matrix.alpha.shamal.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo8 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login\n");

        driver.manage().window().maximize();

        //Enter User credential to login to website
        Thread.sleep(2000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();


        ////ul[@id="mainMenuFirstLevelUnorderedList"]/li/a patha for Main menu(11 tab)

       driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]/child::b")).click();
       Thread.sleep(2000);
      // String adminTab = driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]/child::b")).getText();
        driver.findElement(By.xpath("//a[@id=\"menu_pim_viewPimModule\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_leave_viewLeaveModule\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_time_viewTimeModule\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_recruitment_viewRecruitmentModule\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_pim_viewMyDetails\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_dashboard_index\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_maintenance_purgeEmployee\"]/child::b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menu_buzz_viewBuzz\"]/child::b")).click();
        Thread.sleep(2000);
       // boolean adminTab = driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]/child::b")).isDisplayed();

       // System.out.println("The Admin tab is present :" +adminTab);



        String expTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expTitle)){
            System.out.println("Login Successful Or Verification Done");
        }else {
            System.out.println("Login Fail Or Not Verified");
        }

    }


}
