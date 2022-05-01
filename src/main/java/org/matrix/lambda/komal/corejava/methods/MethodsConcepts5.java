package org.matrix.lambda.komal.corejava.methods;

//Method with class return type

public class MethodsConcepts5 {

    public static Employee getEmployeeData() {    // here we return Employee class using Method
        Employee emp = new Employee();
        return emp;
        //return new Employee(); // we can use this. no need to take emp var to store object of class
    }

    // Method with employee class as parameter
    public Employee getEmployee(Employee eee){
        return eee;
    }

    public String getName(String str){
        return str;
    }

    public String getMethodData(){
        return getName("ram");
    }

    public static void main(String[] args) {   // getEmployeeData method contains return value i.e.employee class
        Employee ee = getEmployeeData();      // getEmployeeData stored in ee
        //Employee ee = new Employee();      // we can use like this also

        System.out.println(ee.empName);
        System.out.println(ee.empId);
        System.out.println(ee.empCompany);//company is static in employee class but here we can not use empCompany
        // we have to use ee.empCompany. if we want to use just empCompany then extend employee class

        ee.getData();     //no sout coz sout is there in get data method

        MethodsConcepts5 obj =new MethodsConcepts5();
        Employee eee = new Employee();
        obj.getEmployee(eee);

        obj.getName("rohan");

        String str= obj.getMethodData(); //stored in str
        System.out.println(str);
    }
}
