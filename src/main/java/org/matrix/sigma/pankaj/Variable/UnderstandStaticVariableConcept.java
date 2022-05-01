package org.matrix.sigma.pankaj.Variable;

public class UnderstandStaticVariableConcept {
    int empid = 111;
    String empname = "pankaj kurhade";
    String companyname = "Wipro";
    String location = "mumbai";

    public void data() {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(companyname);
        System.out.println(location);
    }

    public static void main(String[] args) {
        UnderstandStaticVariableConcept emp = new UnderstandStaticVariableConcept();
        emp.data();
    }
}
