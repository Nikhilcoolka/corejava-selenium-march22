package org.matrix.alpha.kamlesh.string;

public class StringSimpleConcept {

    public static void main(String[] args) {
        String str = new String("Kamal");   // Object Way.By using object creation - Heap Memory
        String str1 = "kamal";                     // String Literal Way.(String Constant Pool SCP Memory)


        String emp1 = "Microsoft";
        String emp2 = "Microsoft";
        String emp3 = "Microsoft";
        emp3 = emp3.concat("Nuance");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
