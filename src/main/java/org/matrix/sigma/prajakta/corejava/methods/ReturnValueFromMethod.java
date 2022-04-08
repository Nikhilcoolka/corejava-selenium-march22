package org.matrix.sigma.prajakta.corejava.methods;

public class ReturnValueFromMethod {

    public String getName(String str){
        return  str;
    }

    public String getMethod(){
        return getName("Prajakta");
    }
    public static void main(String[] args) {
        ReturnValueFromMethod obj=new ReturnValueFromMethod();
        String st=obj.getMethod();
        System.out.println("Name :-"+st);
    }
}
