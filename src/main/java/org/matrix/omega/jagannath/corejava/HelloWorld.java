package org.matrix.omega.jagannath.corejava;

public class HelloWorld {
    public static void main(String args)
    {
        System.out.println("Hello world");
    }

    public static class InstanceVariable {
        int num=10;
        String name ="Jagannath";

        InstanceVariable()
        {
            System.out.println(num);
        }
        public void Display()
        {
            System.out.println("name");
        }
        public static void main(String[] args)
        {
            /*
             Non static variables can not be used directly inside static methods
             System.out.println(name);
            Object Creation
            */
            InstanceVariable obj=new InstanceVariable();
            obj.Display();

        }

    }
}
