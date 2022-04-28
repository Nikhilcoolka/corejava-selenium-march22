package org.matrix.alpha.kamlesh.zPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class Assignment {


    public static void main(String[] args) throws InterruptedException {

         Properties properties = new Properties();
         System.setProperty("webdriver.chrome.driver","D:\\Data\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        //WebDriverManager.chromedriver().setup();
        // driver.get("https://demo.nopcommerce.com/");

        String path = "D:\\name is kamal\\Automation Testng\\corejava-selenium-march22\\src\\main\\java\\org\\matrix\\alpha\\kamlesh\\zPractice\\config.properties";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
        }catch (Exception e){

        }

        String url = properties.getProperty("url");

        driver.get(url);
        System.out.println("@@@@@@@ " + url);

       // driver.close();
    }
}
