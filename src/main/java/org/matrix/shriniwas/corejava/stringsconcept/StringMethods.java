package org.matrix.shriniwas.corejava.stringsconcept;

public class StringMethods {

    public static void main(String[] args) {
        String name = "shriniwas";
                    // [012345678]

        System.out.println("Length : " +name.length()); // length() is method of String
        System.out.println(args.length); // length in array is a property/attribute

        String str1 = "SHRINIWAS";
        System.out.println("To Lower case :" +str1.toLowerCase());
        System.out.println("To Upper case :" +name.toUpperCase());

        String str2 = "      Shriniwas      ";
        System.out.println("Trim :" +str2.trim());

        String str3 = "Shri";
        String str4 = "Shri";
        String str5 = "ShRi";
        System.out.println("Equals : " +str3.equals(str4));
        System.out.println("EqualIgnoreCase:" +str3.equalsIgnoreCase(str5));

        System.out.println("Char At :" +name.charAt(0));
        System.out.println("Char At :" +name.charAt(8));
        System.out.println("Char At :" +name.charAt(7));
        // System.out.println("Char At :" +name.charAt(10));

        System.out.println(" Replace :" +name.replace('h', 'H'));
        System.out.println("ReplaceAll :" +name.replaceAll("was", "vas"));

        System.out.println("Index Of :" +name.indexOf('s')); // Always it will give first index of char
        System.out.println("Index Of :" +name.indexOf('i'));

        System.out.println("Index Of :" +name.lastIndexOf('s')); // It gives last index of char

        System.out.println("Substring :" +name.substring(0, 9)); // startIndex, endIndex-1 (9-1 = 8)
        System.out.println("Substring :" +name.substring(0, 4)); // startIndex, endIndex-1 (4-1 = 3)
        System.out.println("Substring :" +name.substring(1, 4)); // startIndex, endIndex-1 (4-1 = 3)
        System.out.println("Substring :" +name.substring(0)); // startIndex, endIndex-1 (9-1 = 8)
        System.out.println("Substring :" +name.substring(4)); // startIndex, endIndex-1 (9-1 = 8)
        System.out.println("Substring :" +name.substring(8));
        System.out.println("Substring :" +name.substring(0,0));

        System.out.println("Concat : " +name.concat(" Alle"));
        System.out.println("Contains :" +name.contains("Niwas"));
        System.out.println("Starts with :" +name.startsWith("shri"));
        System.out.println("Ends with :" +name.endsWith("Was"));

        String str6 = "AC"; // ASCII Code: 67
        String str7 = "AB"; // ASCII Code: 66
        System.out.println("Compare To: " +str6.compareTo(str7));

        System.out.println("Is Empty :"+name.isEmpty());

        char [] chArr = name.toCharArray();
        // ['s' , 'h' , 'r', 'i', 'n', 'i', ...]

        String str8 = "Shriniwas Alle"; // [Shriniwas=0, Alle=1]
        String [] arr = str8.split(" ");
        System.out.println( "Array Length: "+arr.length);

        System.out.println("----- Using For loop -----");
        for( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // arr[0] = Shriniwas , arr[1] = Alle
        }

        System.out.println("----- Using For each loop -----");
        // For each loop
        for (String str : arr) {
            System.out.println(str);
        }

        System.out.println("----- Using For each loop for Character array -----");
        char [] ch = {'s', 'h', 'r', 'i'};

        for ( char c : ch) {
            System.out.print(c + " ");
        }
    }
}
