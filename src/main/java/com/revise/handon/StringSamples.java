package com.revise.handon;

public class StringSamples {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "World";
        String str3 = "Hello";
        String str4 = "world";
        String str5 = "Hello";

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str3==str5);

        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));

        System.out.println(""+str1.length() + str2.length());
        System.out.println(str1+" "+str2);
        System.out.println(str1.substring(2));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println(sb);

        StringBuffer strBuf = new StringBuffer();
        System.out.println("strBuf.capacity() : "+strBuf.capacity());
        strBuf.append("Hello");
        strBuf.append(" World!");
        System.out.println(strBuf);

        System.out.println(sb.toString()==strBuf.toString());
        System.out.println(sb.toString().equals(strBuf.toString()));

        System.out.println(sb.capacity());
        System.out.println(sb.insert(5, "StringBuilder"));
        System.out.println(sb.capacity());
        System.out.println(strBuf.capacity());
        System.out.println(strBuf.insert(5, "StringBuilder"));
        System.out.println(strBuf.capacity());

    }

}
