package com.te.sorting;

public class SortingService {

    public static void main(String args[]) {
        int[] data = {8,3,6,7,1,2,5,4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.doSelectionSort(data);
        System.out.println(data);
        for(int datum:data) {
            System.out.print(datum+" ");
        }
    }
}