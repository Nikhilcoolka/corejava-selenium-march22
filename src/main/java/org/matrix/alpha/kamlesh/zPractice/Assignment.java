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
         String path = "src/main/java/org/matrix/alpha/kamlesh/selenium/config.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
        }catch (Exception e){

        }

        driver.get(properties.getProperty("url"));
    }
}
