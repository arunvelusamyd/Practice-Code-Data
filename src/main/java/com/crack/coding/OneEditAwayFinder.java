package com.crack.coding;

public class OneEditAwayFinder {

    public static void main(String[] args) {
        String str = "Arun";
        String strAdd = "ArunV";
        String strRemove = "run";
        String strReplace = "arun";
        String strEditedTwice = "Varun";

        OneEditAwayFinder oneEditAwayFinder = new OneEditAwayFinder();
        System.out.println(oneEditAwayFinder.isEditedOnce(str, strAdd));
        System.out.println(oneEditAwayFinder.isEditedOnce(str, strRemove));
        System.out.println(oneEditAwayFinder.isEditedOnce(str, strReplace));
        System.out.println(oneEditAwayFinder.isEditedOnce(str, strEditedTwice));
    }

    private boolean isEditedOnce(String s1, String s2) {
        int first = s1.length();
        int second = s2.length();
        boolean foundDifference = false;

        int idx1 = 0;
        int idx2 = 0;

        while(idx1<first && idx2<second) {
            if(s1.charAt(idx1) != s2.charAt(idx2)) {
                if(foundDifference)
                    return false;
                foundDifference = true;
                if(first > second)
                    idx1++;
                else if(second > first)
                    idx2++;
                else{
                    idx1++;
                    idx2++;
                }
            } else {
                idx1++;
                idx2++;
            }
        }
        return true;
    }

}
