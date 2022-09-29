package com.hr.practice1;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[][] matrix = new int[size][size];
        for(int i =0; i<size ; i++) {
            for(int j = 0; j<size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int diagonal_sum_1 = 0;
        int diagonal_sum_2 = 0;
        for(int i=0;i<size;i++) {
            diagonal_sum_1 += matrix[i][i];
            diagonal_sum_2 += matrix[i][size-1-i];
        }
        int diagonal_diff = Math.abs(diagonal_sum_1-diagonal_sum_2);
        System.out.println(diagonal_diff);
    }

}
