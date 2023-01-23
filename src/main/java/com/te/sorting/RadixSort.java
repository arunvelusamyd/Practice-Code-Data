package com.te.sorting;

import java.util.Arrays;

public class RadixSort {

    public int[] doRadixSort(int[] arr) {
        int arraySize = arr.length;
        int maxVal = findMax(arr);
        for(int d=1;maxVal/d>0;d*=10) {
            arr = doCountSort(arr, d);
        }
        return arr;
    }

    private int[] doCountSort(int[] arr, int d) {
        int[] count = new int[10];
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length;i++) {
            count[((arr[i]/d)%10)]++;
        }
        for(int i=1;i<10;i++) {
            count[i] = count[i] + count[i-1];
        }
        for(int i=arr.length-1; i>=0;i--) {
            output[count[((arr[i]/d)%10)]-1] = arr[i];
            count[((arr[i]/d)%10)]--;
        }
        arr = output;
        return arr;
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
