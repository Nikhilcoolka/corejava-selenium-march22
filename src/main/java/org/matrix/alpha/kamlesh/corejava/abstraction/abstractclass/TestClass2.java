package org.matrix.alpha.kamlesh.corejava.abstraction.abstractclass;

public class TestClass2 extends TestClass1 {


    
    @Override
    public void Folder() {
        System.out.println("Right cliq and open");
    }

    public static void main(String[] args) {
        TestClass2 obj = new TestClass2();
        obj.test();
        obj.Folder();
    }
}
