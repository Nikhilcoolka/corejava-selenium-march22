package org.matrix.alpha.nikhilesh;

public class MethodCall {
    String sr = "Nikhil";
    int x = 15;
    int y = 25;

    public String data() {
        return sr;
    }

    public void get() {
        System.out.println("i am in A-1 Method");
    }

    public void m1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public int m2() {
        int s;
        s= x + y;
        return s;
    }
    public int m4(int a, int b) {
        int c;
                c= a + b;
        return c;
    }
    public String dataGet(String te,int v){
        System.out.println(te);
        System.out.println(v);
        return te;

    }
    public static void main(String[] args) {
        MethodCall tr = new MethodCall();

        String str = tr.data();

        System.out.println(str);

        tr.m1(10, 20);

        int a = tr.m2();

        System.out.println(a);

        int w=tr.m4(50,70);

        System.out.println(w);

        String dr=tr.dataGet ("Shriniwas",28);

        System.out.println(dr);

    }
}
