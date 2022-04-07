package org.matrix.alpha.kamlesh.block;


public class SimpleExample {
    int speed = 100;

    {
        System.out.println("Royal Enfeild Bullet covers speed of " +speed);
    }
    {
        System.out.println("KTM duke covers speed of " +speed);
    }
    public SimpleExample() {
        System.out.println("Honda CBR 150 covers speed of " +speed);
    }

    public static void main(String[] args) {
        SimpleExample obj = new SimpleExample();

        String s = "80 90 60,50";

        String[] s1 = s.split(" ");

        System.out.println(s1[2]);

        for (String s3:s1) {
            System.out.println(s3);
        }

        String s4 = "my name is ";
        String a = "pune";
        String s5 = s4.replaceAll(" ",a); // string
        String s6 = s4.replace(" ",a); //cjar


        System.out.println(s5 + " " + s6);

    }
}

