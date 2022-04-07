package org.matrix.alpha.kamlesh.constructor;

public class DefaultConstructor {
    int empId;
    String companyName;
    public DefaultConstructor() {

        System.out.println("Default " +empId);    //Here this is an example of Default Constructor without parameters
        System.out.println("Default" +companyName);

    }

    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();

    }
}
