package com.crack.coding;

import java.util.Arrays;

public class MatrixRotation {

    public static void main(String[] args) {
        MatrixRotation matrixRotation = new MatrixRotation();

        int[][] matrix_33 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrix_44 = {
                {3,2,5,6},
                {4,8,3,9},
                {9,6,7,8},
                {7,1,5,2}
        };

        int[][] matrix_55 = {
                {1,2,3,4,5},
                {6,4,8,3,9},
                {7,6,11,1,8},
                {8,5,7,2,6},
                {9,3,4,2,10}
        };

        int[][] matrix_66 = {
                {1,12,23,34,2,15},
                {10,5,21,33,9,25},
                {47,1,22,2,25,35},
                {3,4,36,16,19,45},
                {4,5,39,13,21,55},
                {43,7,6,36,39,65}
        };


        int[][] arrToRotate = matrix_66;

        System.out.println(matrixRotation.rotate(arrToRotate));
        System.out.println(arrToRotate);


        for(int i =0; i< arrToRotate.length;i++) {
            Arrays.stream(arrToRotate[i]).forEach(val -> System.out.print(val+"\t"));
            System.out.println();
        }
    }

    private boolean rotate(int[][] matrix) {
        if(matrix.length < 2 && matrix.length != matrix[0].length)
            return false;
        int size = matrix.length;
        for(int i=0;i<size/2;i++) {
            System.out.println("Rotating");
            int lastIndex = size - 1 - i;
            for(int j=i; j<lastIndex;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[lastIndex-j+i][i];
                matrix[lastIndex-j+i][i] = matrix[lastIndex][lastIndex-j+i];
                matrix[lastIndex][lastIndex-j+i] = matrix[j][lastIndex];
                matrix[j][lastIndex] = temp;
            }
        }
        return true;
    }

}
