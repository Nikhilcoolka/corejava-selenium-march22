package org.matrix.alpha.kamlesh.programs;

public class Program5 {

    public static void main(String[] args) {

        String str = "kamal";
        str = str.concat("dandi");              //String SCP immutable
        System.out.println(str);


        String str1 = new String("kamal");
        str1 = str1.concat("dandi");
        System.out.println(str1);
    }
}
