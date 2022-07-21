package com.te.sorting;

public class SelectionSort {
    public int[] doSelectionSort(int[] ip) {
        int temp = 0;
        for(int i=0;i<ip.length-1;i++) {
            temp = i;
            for(int j=i+1;j<ip.length;j++) {
                if(ip[j]<ip[temp]) {
                    temp = j;
                }
            }
            if(i!=temp) {
                swap(ip, i, temp);
            }
        }
        return ip;
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }
}
