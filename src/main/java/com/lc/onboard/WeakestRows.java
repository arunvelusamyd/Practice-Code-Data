package com.lc.onboard;

public class WeakestRows {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] solidersCount = new int[mat.length];
        int[] weakestRowOrder = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++) {
                solidersCount[i] = solidersCount[i] + mat[i][j];
            }
        }

        for(int i=0;i<solidersCount.length;i++){
            int position = 0;
            for(int j=0;j<solidersCount.length;j++) {
                if(solidersCount[i] > solidersCount[j]) {
                    position = position + 1;
                } else if(solidersCount[i] == solidersCount[j] && i>j) {
                    position = position + 1;
                }
            }
            weakestRowOrder[position] = i;
        }
        int[] kWeakestRows = new int[k];
        for(int i=0;i<k;i++) {
            kWeakestRows[i] = weakestRowOrder[i];
        }
        return kWeakestRows;
    }

}
