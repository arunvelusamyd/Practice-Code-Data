package com.te.sorting;

import java.util.*;

public class BucketSort {
    public int[] doBucketSort(int[] arr) {
        int size = arr.length;
        int numberOfBuckets = size/4;
        List<Integer>[] buckets = new List[numberOfBuckets];

        int[] minAndMax = findMinAndMax(arr);

        for(int val: arr) {
            int hashVal = hash(val, minAndMax[0], minAndMax[1], numberOfBuckets);
            if(buckets[hashVal] == null) {
                buckets[hashVal] = new LinkedList<>();
            }
            buckets[hashVal].add(val);
        }

        return mergeBuckets(buckets, size);
    }

    public int[] mergeBuckets(List<Integer>[] buckets,int size) {
        int[] output = new int[size];
        int idx = 0;
        for(List<Integer> bucket:buckets) {
            int startIdx = idx;
            if(bucket != null) {
                for(Integer bucketVal:bucket) {
                    output[idx] = bucketVal;
                    idx++;
                    for(int i=0;i<idx;i++) {
                        for(int j=i;j>startIdx;j--) {
                            if(output[j]<output[j-1]){
                                swap(output, j, j-1);
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return output;
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

    public int hash(int val, int min, int max, int numberOfBuckets) {
        int range = ((max-min)/numberOfBuckets)+1;
        int hashVal = (val-min)/range;
        return hashVal;
    }

    public int[] findMinAndMax(int[] a) {
        int[] minAndMax = new int[2];
        minAndMax[0] = a[0];
        minAndMax[1] = a[0];

        for(int i=1;i<a.length;i++) {
            if(a[i] > minAndMax[1])
                minAndMax[1] = a[i];
            if(a[i] < minAndMax[0])
                minAndMax[0] = a[i];
        }
        return minAndMax;
    }

}
