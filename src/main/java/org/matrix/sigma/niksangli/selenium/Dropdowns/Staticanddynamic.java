package org.matrix.sigma.niksangli.selenium.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class Staticanddynamic {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Autosuggestive
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> country =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

        List<String> l1=new LinkedList<>();

        for(WebElement l2:country)
        {
            l1.add(l2.getText());
            if(l2.getText().equalsIgnoreCase("India"))
            {
                l2.click();
                break;
            }

        }

        //radio button
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
       // Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
       // Thread.sleep(1000);



        //static dropdown currency
        WebElement staticdp =driver.findElement(By.xpath
                ("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select s1=new Select(staticdp);
        s1.selectByIndex(3);
        Thread.sleep(2000);
        System.out.println(s1.getFirstSelectedOption().getText());
        s1.selectByVisibleText("AED");
        Thread.sleep(2000);
        System.out.println(s1.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        //Passenger //checkbox

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(1000);
        for(int i=1;i<3;i++) {

            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
            ////span[@id='hrefIncChd']
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

        //dynamic dropdown element is not visible issue
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
        driver.findElement(By.cssSelector("a.ui-state-default ui-state-highlight ui-state-active")).isSelected();

        driver.findElement(By.cssSelector("input[value='Search']")).click();

        Thread.sleep(3000);
        driver.close();



    }
}
