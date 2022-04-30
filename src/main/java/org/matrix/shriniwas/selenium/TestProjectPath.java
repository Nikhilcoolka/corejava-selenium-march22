package org.matrix.shriniwas.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProjectPath {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir");
        System.out.println("Path of Project:" +path);

        FileInputStream fin = new FileInputStream(path+"\\src\\main\\java\\org\\matrix\\shriniwas\\selenium\\config.properties");
        Properties prop = new Properties();
        prop.load(fin);
        String value = prop.getProperty("");
    }
}
