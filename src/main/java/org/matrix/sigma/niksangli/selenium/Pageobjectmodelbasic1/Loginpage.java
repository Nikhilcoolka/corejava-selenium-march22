package org.matrix.sigma.niksangli.selenium.Pageobjectmodelbasic1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    private WebDriver driver;

     // Web element
     By Txtusername=By.id("user-name");
     By Txtpassword=By.id("password");
     By btnlogin=By.xpath("//input[@id='login-button']");

     public Loginpage(WebDriver driver)
     {
            this.driver=driver;
     }

    public void login(String uname,String pass) throws InterruptedException
    {
         // Related method
        Pageaction.text(driver,Txtusername,uname);
        Pageaction.text(driver,Txtpassword,pass);
        Pageaction.click(driver,btnlogin);


    }
}
