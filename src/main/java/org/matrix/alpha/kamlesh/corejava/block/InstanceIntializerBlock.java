package org.matrix.alpha.kamlesh.block;

public class InstanceIntializerBlock {


    public InstanceIntializerBlock() {
        System.out.println("Im addressed for no 2");
    }

    {
        System.out.println("Im addressed for no 1");
    }



    public static void main(String[] args) {
        InstanceIntializerBlock obj = new InstanceIntializerBlock();
        System.out.println("______________");
        InstanceIntializerBlock obj2 = new InstanceIntializerBlock();
    }
}
