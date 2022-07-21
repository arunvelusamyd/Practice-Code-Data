package com.te.sorting;

public class BubbleSort {

    public int[] doBubbleSort(int[] ip) {
        boolean isSwapped = false;
        for(int i=1;i<ip.length;i++){
            for(int j=0;j<ip.length-i;j++){
                if(ip[j]>ip[j+1]){
                    swap(ip, j, j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
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
