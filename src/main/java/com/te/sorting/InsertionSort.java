package com.te.sorting;

public class InsertionSort {

    public int[] doInsertionSort(int[] ip) {
        for(int i =1;i<ip.length;i++) {
            for(int j=i;j>0;j--) {
                if(ip[j]<ip[j-1]){
                    swap(ip, j, j-1);
                }else {
                    break;
                }
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
