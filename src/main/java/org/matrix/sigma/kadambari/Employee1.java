package org.matrix.sigma.kadambari;

public class Employee1 {

    int id;
    String name;
    String city;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee1(int id, String name, String city) {
       this.id=id;
       this.name= name;
    this.city = city;
    }

    void display() {
        System.out.println(" id : " + id +" name: " + name       + " city: " + city);
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1(1, "shravi","Pune");
        emp.display();
    }
}