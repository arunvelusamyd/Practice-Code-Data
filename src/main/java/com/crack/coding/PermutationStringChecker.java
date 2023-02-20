package com.crack.coding;

import javax.swing.*;

public class PermutationStringChecker {

    public static void main(String[] args) {
        PermutationStringChecker permutationStringChecker = new PermutationStringChecker();
        System.out.println(permutationStringChecker.checkPermutation("Arun", "runA"));
        System.out.println(permutationStringChecker.checkPermutation("Arun", "runa"));
        System.out.println(permutationStringChecker.checkPermutation("Arun", "ArunV"));
    }

    private boolean checkPermutation(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] temp = new int [128];
        for(char c:s.toCharArray()) {
            temp[c]++;
        }
        for(char c:t.toCharArray()) {
            temp[c]--;
            if(temp[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
