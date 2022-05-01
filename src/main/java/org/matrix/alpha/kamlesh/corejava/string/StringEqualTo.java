package org.matrix.alpha.kamlesh.string;

public class StringEqualTo {

    public static void main(String[] args) {

        String emp1 = new String("Kamal");
        String emp2 = new String("Kamal");
        String emp3 = "Kamlesh";
        String emp4 = "Kamlesh";

        System.out.println(emp1 == emp2);  //false - It compares with refrence objects wit location address
        System.out.println(emp3==emp4);    //true  - Here both string location address is same.
        System.out.println(emp3==emp1);    //false
        System.out.println("_____________________");
        System.out.println(emp1.equals(emp2));     //true   - It compares with display name
        System.out.println(emp1.equals(emp3));     // false - It compares with display name
    }
}
