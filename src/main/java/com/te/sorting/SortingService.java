package com.te.sorting;

public class SortingService {

    public static void main(String args[]) {

        //Selection Sort
        int[] data = {8,3,6,7,1,2,5,4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.doSelectionSort(data);
        for(int datum:data) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Insertion Sort
        int[] dataToSortByInsertionSort = {16,6,12,14,2,4,10,8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.doInsertionSort(dataToSortByInsertionSort);
        for(int datum:dataToSortByInsertionSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Bubble Sort
        int[] dataToSortByBubbleSort = {9,4,6,7,1,2,6,4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(dataToSortByBubbleSort);
        for(int datum:dataToSortByBubbleSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Quick Sort
        int[] dataToSortByQuickSort = {1,4,16,9,36,25,64,49};
        QuickSort quickSort = new QuickSort();
        quickSort.doQuickSort(dataToSortByQuickSort,0, 7);
        for(int datum:dataToSortByQuickSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Merge Sort
        int[] dataToSortByMergeSort = {5,2,17,10,26,50,37,65,};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(dataToSortByMergeSort);
        for(int datum:dataToSortByMergeSort) {
            System.out.print(datum+" ");
        }
        System.out.println();


    }
}