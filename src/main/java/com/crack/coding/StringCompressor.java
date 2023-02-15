package com.crack.coding;

public class StringCompressor {

    public static void main(String[] args) {
        StringCompressor stringCompressor = new StringCompressor();
        String str1 = "aabcccccaaa";
        System.out.println(stringCompressor.compressString_1(str1,str1.length()));
        System.out.println(stringCompressor.compressString_2(str1,str1.length()));

        String str2 = "arun";
        System.out.println(stringCompressor.compressString_1(str2,str2.length()));
        System.out.println(stringCompressor.compressString_2(str2,str2.length()));

        String str3 = "xxzyyyypppq";
        System.out.println(stringCompressor.compressString_1(str3,str3.length()));
        System.out.println(stringCompressor.compressString_2(str3,str3.length()));

        String str4 = "xxzyyyypq";
        System.out.println(stringCompressor.compressString_1(str4,str4.length()));
        System.out.println(stringCompressor.compressString_2(str4,str4.length()));
    }

    private String compressString_1(String str, int strLen) {
        int consecutiveCount = 0;
        StringBuilder compressedStrBuilder = new StringBuilder();
        for (int i = 0; i < strLen; i++) {
            if(i+1 == strLen){
                consecutiveCount++;
                compressedStrBuilder.append(str.charAt(i));
                compressedStrBuilder.append(consecutiveCount);
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                consecutiveCount++;
            } else {
                consecutiveCount++;
                compressedStrBuilder.append(str.charAt(i));
                compressedStrBuilder.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        String compressedStr = compressedStrBuilder.toString();
        if (compressedStr.length() > strLen)
            return str;
        else
            return compressedStrBuilder.toString();
    }

    private String compressString_2(String str, int strLen) {
        int compressedStringSize = 0;
        for (int i = 0; i < strLen - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                compressedStringSize += 2;
            }
        }
        if(compressedStringSize>strLen)
            return str;
        else
            return compressString_1(str, strLen);
    }

}