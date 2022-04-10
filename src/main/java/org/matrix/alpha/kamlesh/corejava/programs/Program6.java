package org.matrix.alpha.kamlesh.corejava.programs;

import java.util.Arrays;

public class Program6 {

  public static void anagrams(){

      String str1 = "Ganesh".replaceAll("\\s", "");
      String str2 = "Nagesh".replaceAll("\\s", "");
      boolean flag = true;

      if (str1.length() != str2.length()) {
           flag = false;
      } else {
          char[] ch1 = str1.toLowerCase().toCharArray();
          char[] ch2 = str2.toLowerCase().toCharArray();

          Arrays.sort(ch1);
          Arrays.sort(ch2);
          flag = Arrays.equals(ch1, ch2);
      }
      if (flag == true) {
          System.out.println("Strings are Anagram");
      } else {
          System.out.println("Strings are not Anagram");
      }
  }

    public static void main(String[] args) {
        anagrams();
    }

}
