package org.matrix.alpha.kamlesh.polymorphism.methooverloading.overriding;


public class ChildParameter extends ParentParameter {

    public void C1(int k,String str){
        System.out.println(k);
        System.out.println(str);
    }

    public static void main(String[] args) {
        ChildParameter obj1 = new ChildParameter();
        ParentParameter obj2= new ParentParameter();
        ParentParameter obj3= new ChildParameter();
        obj3.m1();
        //obj1.C1(100,"I am child with paramter");
        //obj2.m1(50,"I am parent with parameter");
        //obj3.m1(34,"I m parent with parametr");
    }
}
