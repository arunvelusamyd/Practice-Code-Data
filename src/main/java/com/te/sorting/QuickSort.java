package com.te.sorting;

public class QuickSort {

    public void doQuickSort(int[] a,int strtIdx,int lstIdx) {
        int pivotValue = a[lstIdx];
        int wall = strtIdx;
        for(int i=strtIdx;i < lstIdx;i++) {
            if(a[i] < pivotValue){
                swap(a,wall,i);
                wall++;
            }
        }
        swap(a,wall,lstIdx);
        if(strtIdx < wall-1){
            doQuickSort(a, strtIdx, wall-1);
        }
        if(wall+1 < lstIdx){
            doQuickSort(a, wall+1, lstIdx);
        }
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

}
