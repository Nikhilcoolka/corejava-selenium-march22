package org.matrix.alpha.kamlesh.methods;

public class ThisKeyword2 {
    public void k1() {
        System.out.println("ABC");
        k2();
        k3();
    }
    public static void k2() {
        System.out.println("BCA");
    }
    public static String k3() {
        String kam = "I am Kamal";
        return kam;
    }

    public static void main(String[] args) {
        ThisKeyword2 Key = new ThisKeyword2();
        Key.k1();
        String str = k3();
        System.out.println(str);
    }
}
