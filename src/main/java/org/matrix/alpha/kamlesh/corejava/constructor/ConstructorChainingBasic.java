package org.matrix.alpha.kamlesh.constructor;

public class ConstructorChainingBasic {


    public ConstructorChainingBasic(String name) {
        System.out.println("Im no 3");

    }

    public ConstructorChainingBasic() {
        this("Vertex",10);
        System.out.println("Im no 1");
    }
    public ConstructorChainingBasic(String name,int id) {   /*This is an example of constructorchaining in this we
                                                            call parameters by using this() not to use this.
                                                             */
        this("Unique");
        System.out.println("Im no 2");

    }


    public static void main(String[] args) {

        ConstructorChainingBasic obj = new ConstructorChainingBasic();
        }
}
