package org.matrix.alpha.kamlesh.string;

public class StringMemoryAddress {

    public static void main(String[] args) {
        String str1 = new String("Kamal1"); // 1989780873
        String str2 = new String("Kamal1"); // 1480010240
        String str3 = "Kamal3"; // 81628611
        String str4 = "Kamal3"; // 81628611

        System.out.println(+System.identityHashCode(str1));     //System.identityHashcode is used for address of memory
        System.out.println(+System.identityHashCode(str2));     //Str 1 & Str 2 is created new string thats why there address is changed
        System.out.println(+System.identityHashCode(str3));     //Str 3 & Str 4 address is same because new string is not created
        System.out.println(+System.identityHashCode(str4));
    }
}
