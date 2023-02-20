package com.crack.coding;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "crackingcoding", s2="ingcrackingcod";
        StringRotation stringRotation = new StringRotation();
        System.out.println(stringRotation.isStringRotated(s1, s2));;
    }

    private boolean isStringRotated(String s1, String s2) {
        int strLen = s2.length();
        if(s1.length() == strLen && strLen > 0) {
            String s1s1 = s1+s1;
            if(s1s1.contains(s2))
                return true;
        }
        return false;
    }

}
