package com.lc.onboard;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArraySizeReduction {

    public int minSetSize(int[] arr) {
        Map<Integer,Integer> eachNumberCount = new LinkedHashMap<>();
        int[] dynamicArray = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int numberCount = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    numberCount++;
                } else {
                    dynamicArray[j-numberCount] = arr[j];
                }
            }
        }
        return 0;
    }

}
