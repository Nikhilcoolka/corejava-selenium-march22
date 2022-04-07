package org.matrix.alpha.kamlesh.inheritance;

public class Company {

    int empNo;
    String empName;

    Company(int empNo,String empName) {
        this.empName=empName;
        this.empNo=empNo;                   //Without toString object method
    }

     public String toString() {

        return " "+empName+" "+empNo;       //With toString object method
     }

    public static void main(String[] args) {
        Company obj1 = new Company(7,"Raj");
        Company obj2 = new Company(8,"Suyog");

        String a = obj1.toString();
        System.out.println(a);
        System.out.println(obj2);
    }


}
