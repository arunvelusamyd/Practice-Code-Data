package com.crack.coding;

public class UniqueCharInString {

    public static void main(String args[]) {
        UniqueCharInString uniqueCharInString = new UniqueCharInString();
        System.out.println(uniqueCharInString.isUniqueChars("zarunvkumarz"));
    }

    private boolean isUniqueChars(String str) {
        int checker = 0;
        for(int i=0;i<str.length();i++) {
            int val = str.charAt(i) - 'a';
            System.out.println(val);
            if((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

}
