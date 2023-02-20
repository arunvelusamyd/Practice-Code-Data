package com.crack.coding;

public class URLify {

    public static void main(String[] args) {
        URLify urLify = new URLify();
        urLify.replaceSpaces("Mr Arunkumar Velusamy    ".toCharArray(),21);
        System.out.println();
    }

    private void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index;
        for(int i =0; i<trueLength;i++) {
            if(str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount*2;
        if(trueLength < str.length)
            str[trueLength] = '\0';
        for(int i=trueLength-1;i>=0;i--) {
            if(str[i] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index-3;
            } else {
                str[index-1] = str[i];
                index--;
                Math.pow(2,2);
            }
        }
        System.out.println(str);
    }
}
