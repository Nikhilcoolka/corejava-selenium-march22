package org.matrix.alpha.kamlesh.basics;

public class WithoutParameterConcept {
    public void m1() {
        System.out.println("Without Parameter for Instance method example");
    }
    public static void d3() {
        System.out.println("Without Parameter for Static method example");
    }
    public static void main(String[] args) {
        WithoutParameterConcept obj = new WithoutParameterConcept();
        obj.m1();
        WithoutParameterConcept.d3();
    }
}
