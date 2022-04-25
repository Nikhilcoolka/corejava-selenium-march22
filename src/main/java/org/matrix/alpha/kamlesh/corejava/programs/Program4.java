package org.matrix.alpha.kamlesh.programs;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

//Program for String Immutable
public class Program4 {

    @Test
    public static void main(String[] args) {
        String str = "1 name_is_kamal ";//str.concat("dandi");                         //String SCP Immutable method
        str = str.concat("dandi");
        System.out.println(str);

        String str1 = new String("2 name_is_kamal");      //String object immutable
        str1 = str1.concat(" dandi");
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer("3 kamal ");       //String buffer mutable
        str2 = str2.append("dandi");
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder("4 Kamal ");     //String Builder mutable
        str3 = str3.append("dandi");
        System.out.println(str3);


    }
}
