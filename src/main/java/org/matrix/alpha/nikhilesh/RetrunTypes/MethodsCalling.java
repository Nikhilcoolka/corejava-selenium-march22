package org.matrix.alpha.nikhilesh.RetrunTypes;

public class MethodsCalling {
    String name ="Nikhil";
    int idNo =10;
    String companyName ="Shri";
    public void  data(){
        System.out.println("Name ="+name);
        System.out.println("Id No :-"+idNo);
        System.out.println("Company :-"+companyName);
    }

    public static void main(String[] args) {
        MethodsCalling man=new  MethodsCalling();
        man.data();

    }
}
