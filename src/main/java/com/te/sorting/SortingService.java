package com.te.sorting;

import java.util.Arrays;

public class SortingService {

    public static void main(String args[]) {

        //Selection Sort
        int[] data = {8,3,6,7,1,2,5,4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.doSelectionSort(data);
        System.out.println("Insertion Sort Result : ");
        for(int datum:data) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Insertion Sort
        int[] dataToSortByInsertionSort = {16,6,12,14,2,4,10,8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.doInsertionSort(dataToSortByInsertionSort);
        System.out.println("Selection Sort Result : ");
        for(int datum:dataToSortByInsertionSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Bubble Sort
        int[] dataToSortByBubbleSort = {9,4,6,7,1,2,6,4};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(dataToSortByBubbleSort);
        System.out.println("Bubble Sort Result : ");
        for(int datum:dataToSortByBubbleSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Quick Sort
        int[] dataToSortByQuickSort = {1,4,16,9,36,25,64,49};
        QuickSort quickSort = new QuickSort();
        quickSort.doQuickSort(dataToSortByQuickSort,0, 7);
        System.out.println("Quick Sort Result : ");
        for(int datum:dataToSortByQuickSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Merge Sort
        int[] dataToSortByMergeSort = {5,2,17,10,26,50,37,65};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(dataToSortByMergeSort);
        System.out.println("Merge Sort Result : ");
        for(int datum:dataToSortByMergeSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Heap Sort
        int[] dataToSortByHeapSort = {5,3,17,10,26,50,37,65};
        HeapSort heapSort = new HeapSort();
        heapSort.doHeapSort(dataToSortByHeapSort);
        System.out.println("Heap Sort Result : ");
        for(int datum:dataToSortByHeapSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Shell Sort
        int[] dataToSortByShellSort = {15,4,7,1,16,20,37,15,13};
        ShellSort shellSort = new ShellSort();
        shellSort.doShellSort(dataToSortByShellSort);
        System.out.println("Shell Sort Result : ");
        for(int datum:dataToSortByShellSort) {
            System.out.print(datum+" ");
        }
        System.out.println();

        //Counting Sort
        int[] dataToSortBycountingSort = {10,2,4,6,9,8,12};
        CountingSort countingSort = new CountingSort();
        int[] output = countingSort.doCountingSort(dataToSortBycountingSort);
        System.out.println("Counting Sort Result : ");
        Arrays.stream(output).forEach(val -> System.out.print(val+" "));
        System.out.println();

        int[] dataToSortByRadixSort = {194, 25, 13, 18, 12, 58, 73, 39, 36, 143, 183, 121, 124};
        RadixSort radixSort = new RadixSort();
        int[] radixSortedoutput = radixSort.doRadixSort(dataToSortByRadixSort);
        System.out.println("Radix Sort Result : ");
        Arrays.stream(radixSortedoutput).forEach(val -> System.out.print(val+" "));

    }
}