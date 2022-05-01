package org.matrix.delta.rahul.block;

public class StaticBlocks {
    //static  blocks are run before object creation, but it runs one time in class if you created more ref variable too.
    static  {
        System.out.println("Hey, you are using the static clocks here");
    }

    {
        System.out.println("Hey, Your are in Instance blocks");
    }
    public void getAge() {
        int age=30;
        System.out.println("My Age is "+age);
    }
    public static void main(String[] args) {
        new StaticBlocks();
        new StaticBlocks();
    }
}
