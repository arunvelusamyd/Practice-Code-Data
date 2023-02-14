package com.crack.coding;

public class PermutationOfPalindromeChecker {

    public static void main(String[] args) {
        PermutationOfPalindromeChecker permutationOfPalindromeChecker = new PermutationOfPalindromeChecker();
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_1("malayalam"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_1("malayamal"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_1("karur"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_1("arura"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_1("arunv"));

        System.out.println("-------");
        System.out.println("-------");

        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_2("malayalam"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_2("malayamal"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_2("karur"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_2("arura"));
        System.out.println(permutationOfPalindromeChecker.isPermuationOfPalidrome_2("arunv"));
    }

    private boolean isPermuationOfPalidrome_1(String str) {
        int countOdd = 0;
        int[] temp = new int[26];
        for(char c:str.toCharArray()) {
            int i = c-'a';
            temp[i]++;
            if(temp[i] % 2 == 1) {
                countOdd++;
            } else {
              countOdd--;
            }
        }
        return countOdd <=1;
    }

    private boolean isPermuationOfPalidrome_2(String str) {
        int bitVector = createBitVector(str);
        return checkExactlyOneBitSet(bitVector);
    }

    private int createBitVector(String str) {
        int bitVector = 0;
        for(char c:str.toCharArray()) {
            int index = c- 'a';
            bitVector = toggle(bitVector, index);
        }
        return bitVector;
    }

    private int toggle(int bitVector, int index) {
        if(index < 0)
            return bitVector;
        int mask = 1 << index;
        if((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

}
