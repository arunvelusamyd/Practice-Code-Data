package com.te.sorting;

public class MergeSort {

    public void doMergeSort(int[] a) {
        int[] sortedArray = sort(a, 0, a.length-1);
        for(int i=0;i<sortedArray.length;i++) {
            a[i] = sortedArray[i];
        }
    }

    private int[] sort(int[] a,int strtIdx,int lstIdx) {
        if(strtIdx != lstIdx) {
            int midIdx = (lstIdx-strtIdx)/2;

            int[] left = sort(a, strtIdx, strtIdx+midIdx);
            int[] right = sort(a, strtIdx+midIdx+1, lstIdx);

            int mergedArrayLength = left.length + right.length;
            int[] mergedArray = new int[mergedArrayLength];
            int l=0,r=0;
            for(int i=0;i<mergedArrayLength;i++) {
                if(l < left.length && r < right.length) {
                    if(left[l]<=right[r]) {
                        mergedArray[i] = left[l];
                        l++;
                    } else if(left[l]>right[r]){
                        mergedArray[i] = right[r];
                        r++;
                    }
                } else if(l >= left.length && r < right.length) {
                    mergedArray[i] = right[r];
                    r++;
                } else if(r >= right.length && l < left.length) {
                    mergedArray[i] = left[l];
                    l++;
                }
            }
            return mergedArray;
        } else {
            int[] singleValueArray = new int[1];
            singleValueArray[0] = a[strtIdx];
            return singleValueArray;
        }
    }
}
