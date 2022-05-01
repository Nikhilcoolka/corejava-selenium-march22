package org.matrix.alpha.kamlesh.objects;

public class getClassMethod {

    public static void main(String[] args) {
        Object obj = new String("kamal");
        Class a = obj.getClass();
        System.out.println("Displaying get class meethod " +a.getName());
        System.out.println("Displaying get class meethod " +a.getClass());
        System.out.println("Memory address printing " +System.identityHashCode("kamal"));
    }

}
