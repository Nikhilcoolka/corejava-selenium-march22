package org.matrix.sigma.ashish.newinterface;

public class TestInterfaceClass implements TestInterface1 ,TestInterface2 {

    @Override
    public void click() {
        System.out.println("Click on button");
    }

    @Override
    public String getText() {
        return "Ashish";
    }

    @Override
    public void enterText() {
        System.out.println("Enter Text in input Box");
    }

    public void add(){
        System.out.println("Addition");
    }

    public void multiply(){
        System.out.println("multiply");
    }

    public static void main(String[] args) {
        TestInterface1 obj=new TestInterfaceClass();
        obj.click();
        obj.enterText();
        obj.getText();
        obj.add();
        obj.multiply();
        System.out.println("Declaired String"+str);
    }
}
