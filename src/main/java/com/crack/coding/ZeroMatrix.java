package com.crack.coding;

import java.util.Arrays;

public class ZeroMatrix {

    public static void main(String[] args) {
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

        int[][] matrix_67 = {
                {1,0,12,23,34,2,15},
                {10,5,21,33,9,25,24},
                {47,1,0,2,25,35,34},
                {3,4,36,16,19,45,44},
                {0,5,39,13,21,55,54},
                {43,7,6,36,0,65,64}
        };

        int[][] arrToZero = matrix_67;
        ZeroMatrix zeroMatrix = new ZeroMatrix();

        zeroMatrix.setZeros_2(arrToZero);
        for(int i =0; i< arrToZero.length;i++) {
            Arrays.stream(arrToZero[i]).forEach(val -> System.out.print(val+"\t"));
            System.out.println();
        }


    }

    private void setZeros_1(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        int noOfRows = 0;
        int noOfColumns = 0;

        for(int i=0;i<matrix.length;i++) {
            for(int j=0; j<matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    row[noOfRows] = i;
                    column[noOfColumns] = j;
                    noOfRows++;
                    noOfColumns++;
                }
            }
        }
        for(int r=0;r<noOfRows;r++) {
            for(int c=0;c<matrix[row[r]].length;c++) {
                matrix[row[r]][c] = 0;
            }
        }
        for(int c=0;c<noOfColumns;c++) {
            for(int r=0;r<matrix.length;r++) {
                matrix[r][column[c]] = 0;
            }
        }
    }

    private void setZeros_2(int[][] matrix) {
        boolean firstRowZero = false, firstColZero = false;

        for(int row=0;row<matrix.length;row++) {
            if(matrix[row][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int col=0;col<matrix[0].length;col++) {
            if(matrix[0][col] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for(int r=1;r<matrix.length;r++) {
            for(int c=1;c<matrix[0].length;c++) {
                if(matrix[r][c] == 0) {
                    matrix[0][c] = 0;
                    matrix[r][0] = 0;
                }
            }
        }

        for(int r=0;r<matrix.length;r++) {
            for(int c=0;c<matrix[0].length;c++) {
                if(matrix[0][c] == 0 || matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if(firstColZero) {
            for(int row=0;row<matrix.length;row++) {
                matrix[row][0] = 0;
            }
        }

        if(firstRowZero) {
            for(int col=0;col<matrix[0].length;col++) {
                matrix[0][col] = 0;
            }
        }
    }
}
