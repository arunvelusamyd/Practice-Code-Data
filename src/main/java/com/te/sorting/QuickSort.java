package com.te.sorting;

public class QuickSort {

    //{1,4,16,9,36,25,64,49};
    public void doQuickSort(int[] a,int strtIdx,int lstIdx) {
        //Pivot index & value selection. move the pivot value to last position
        int pivotIdx = strtIdx+(lstIdx-strtIdx)/2;
        //int pivotIdx = lstIdx-1;
        int pivotValue = a[pivotIdx];
        swap(a,pivotIdx,lstIdx);

        //Finding pivot values position
        int wall = strtIdx-1;
        for(int i=strtIdx;i < a.length;i++) {
            if(a[i]<=pivotValue) {
                wall++;
                swap(a,wall,i);
            }
        }

        //Divide & doQuickSort on the divided array
        if(strtIdx < wall-1){
            doQuickSort(a, strtIdx, wall-1);
        }
        if(wall+1<lstIdx) {
            doQuickSort(a, wall+1, lstIdx);
        }
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

}
