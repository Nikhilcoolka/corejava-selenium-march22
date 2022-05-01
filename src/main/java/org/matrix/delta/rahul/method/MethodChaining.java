package org.matrix.delta.rahul.method;

public class MethodChaining {
    public void studDetails() {
        int studRollNumber=100;
        String studName="Rahul";
        System.out.println("Student roll number is "+studRollNumber+" Student name is "+studName);
    }
    public void colDetails() {
        int colId=25;
        String colName="GFCCT";
        System.out.println("College Id is "+colId+" " +
                "College name is "+colName);
    }
    public void bothDetails() {
        studDetails();
        colDetails();
    }

    public static void main(String[] args) {
        MethodChaining obj=new MethodChaining();
        obj.bothDetails();
    }
}
