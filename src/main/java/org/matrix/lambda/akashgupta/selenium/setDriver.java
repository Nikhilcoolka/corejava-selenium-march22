package org.matrix.lambda.akashgupta.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

final class setDriver {
    static WebDriver driver;

    public static void setDriverProperty(String s) {
        if (s.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\akash\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (s.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}
