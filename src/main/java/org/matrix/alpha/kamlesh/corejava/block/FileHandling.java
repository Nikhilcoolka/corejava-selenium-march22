package org.matrix.alpha.kamlesh.block;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {


        public static void main(String[] args)
                throws IOException
        {  try{
            FileWriter fw=new FileWriter("D:\\MyPractice\\hp.txt");
            fw.write("Welcome to java      !!!!!!!!!!!!!!!");
            fw.close();
        }catch(Exception e){
            System.out.println(e);}


            System.out.println("Success...");
        }

}
