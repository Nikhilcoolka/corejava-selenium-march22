package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

public class ConstructorTypes {
    public int num;
    public String name;
    public static String companyName;

   public ConstructorTypes(){   // default access type is default("package-private")
        System.out.println("Object was created withdefault value by JVM Initialization" +
                " \nNo-args type  :general used to display message");
    }

    public void setCompanyName(String companyName){
        ConstructorTypes.companyName=companyName;
    }

    public void display(){
        System.out.println("this is parent");
        System.out.println("EmpId : "+this.num);
        System.out.println("EmpName : "+this.name);
        System.out.println("CompanyName : "+companyName);
    }

    public ConstructorTypes(int num,String name,String companyName){  //public access, can be called in different package
        this.num=num;
        this.name=name;
        setCompanyName(companyName);
        System.out.println("Object was created with user initialization \n" +
                "Args/parameterized type : general used to initialize instance variable/method");
    }

    public static void main(String[] args) {
        ConstructorTypes obj1 = new ConstructorTypes();
        obj1.display();
        ConstructorTypes obj2 = new ConstructorTypes(10,"Akash","MicroSoft");
        obj2.display();
    }
}
