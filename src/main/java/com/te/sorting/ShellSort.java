package com.te.sorting;

public class ShellSort {

    public void doShellSort(int a[]) {
        for(int g=(a.length/2);g>0;g=g/2) {
            for(int i=0;i+g<a.length;i++) {
                for(int end=i+g;end-g>=0;end=end-g) {
                    if(a[end]<a[end-g]) {
                        swap(a, end, end-g);
                    }
                }
            }
        }
    }
    private void swap(int[] array, int firstPosition, int secondPosition) {
        int temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }

}
