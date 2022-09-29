package com.te.sorting;

public class HeapSort {

    public void doHeapSort(int a[]) {
        int unsortedArrayLength = a.length;
        for(int i=0;i<a.length;i++) {
            for(int h=unsortedArrayLength;h>0;h--) {
                heapify(a, h, unsortedArrayLength);
            }
            swap(a, 0, unsortedArrayLength-1);
            unsortedArrayLength--;
        }
    }

    public void heapify(int a[], int indexToHeapify, int arrayLength) {
        int maxChildPosition;
        if(2*indexToHeapify <= arrayLength) {
            if((2*indexToHeapify)+1 <= arrayLength) {
                //Node is full BT. Have 2 children
                if(a[2*indexToHeapify] > a[(2*indexToHeapify)-1]) {
                    maxChildPosition = (2*indexToHeapify)+1;
                } else {
                    maxChildPosition = (2*indexToHeapify);
                }
            } else {
                //Node is Complete BT. Have only one child
                maxChildPosition = (2*indexToHeapify);
            }
            if(a[maxChildPosition-1] > a[indexToHeapify-1]) {
                swap(a, indexToHeapify-1, maxChildPosition-1);
                heapify(a, maxChildPosition, arrayLength);
            }
        }
    }

    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

}
