package com.te.sorting;

import java.util.Arrays;

public class CountingSort {

    public int[] doCountingSort(int[] a) {
        int max = findMax(a);
        int[] indexArr = new int[max+1];
        int[] output = new int[a.length];
        for(int i=0;i<a.length;i++){
            indexArr[a[i]-1] += 1;
        }
        for(int i=1;i<max;i++) {
            indexArr[i] += indexArr[i-1];
        }
        for(int i=0;i<a.length;i++){
            output[indexArr[a[i]-1]-1] = a[i];
            indexArr[a[i]-1]--;
        }
        return output;
    }

    private int findMax(int[] a) {
        int max = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

}
