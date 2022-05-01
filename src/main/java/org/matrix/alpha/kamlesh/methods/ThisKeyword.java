package org.matrix.alpha.kamlesh.methods;

public class ThisKeyword {

    public void Kamal() {
        System.out.println("Lenovo");
    }
    public void Honda() {
        this.Kamal();       /* This is an sample from of this keyword.Here I have called honda in which I have
                                          displayed both the function */
        System.out.println("Dell");
    }
    public String TVS() {
        this.Honda();
        this.Kamal();
        String str = "HP";
        return str;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();/* Here I had took an example of string where fitst I have stored
                                            the value and then print */
        String str = obj.TVS();
        System.out.println(str);
    }
}

