package org.matrix.alpha.kamlesh.corejava.programs;
//Program to count words in sentence

public class Program3 {

    public static void main(String[] args) {
        String str = "my_name_is_kamal";
        System.out.println(str);
        int count = 1;
        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("No of words mentioned in string " + count);
    }
}
