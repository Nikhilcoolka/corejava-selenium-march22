package org.matrix.lambda.akashgupta.javaconcepts.practiceprograms;

public class StringImmutable {

    public static void main(String[] args) {
        //String literals are Immutable
        String str1 = "Akash";  //String literal are stored in StringConstantPool(SCP).
        str1.concat("Gupta");   // here str1 is not mutable i.e value does not change as it would in char[]/StringBuffer
        System.out.println(str1 + "......length is :" + str1.length());
        //String obj is also Immutable
        String ref = new String("Hello");//2 obj is created 1-literal 1-ref
        ref.concat("_SCP"); //returns ref to new literal "Hello_SCP" but doesn't mutate original
        System.out.println(ref + "......length is :" + ref.length());
        //StringBuffer is Mutable
        StringBuffer buffer = new StringBuffer("StringBuffer_");//you cannot create String() object for StringBuffer.
        buffer.append("is_Mutable");
        System.out.println(buffer + "......length is :" + buffer.length());
        //StringBuilder is Mutable
        StringBuilder builder = new StringBuilder(new String("StringBuilder_"));
        //in above code we can see new String() is redundant because jvm creates it for literal(that is why 2 obj is created)
        builder.append("is_Mutable");
        System.out.println(builder + "......length is :" + builder.length());


    }
}
/*
 * StringBuilder & StringBuffer extends AbstractStringBuilder
 * and implements CharSequence & java.io.Serializable
 * String implements  java.io.Serializable, Comparable<String>, CharSequence
 * in above each class uses char[] to store variable*/