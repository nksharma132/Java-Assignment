/**
 * Question: 10. Write a program to generate Matrix Multiplication.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

public class MatrixMultiplication {

    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][] ) {
        int i, j, k;
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);

        if (row2 != col1) {
            System.out.println("\nMultiplication not possible");
            return;
        }
        int C[][] = new int[row1][col2];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k]*B[k][j];
            }
        }
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }

    public static void main(String[] args) {

        int rowA = 4, rowB = 3, colA = 3, colB = 4;
        int matrixA[][] = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        int matrixB[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        multiplyMatrix(rowA,colA,matrixA,rowB,colB,matrixB);
    }
}

/*
// User entered matrix multiplication

import java.util.Scanner;

class Matrix {
    private int row, col;
    private int[][] matrix;

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and column of a matrix ");
        this.row = input.nextInt();
        this.col = input.nextInt();
        this.matrix = new int[this.row][this.col];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++)
                this.matrix[i][j] = input.nextInt();
        }
    }
    public void showMatrix() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++)
                System.out.print(this.matrix[i][j]+ " ");
            System.out.println();
        }
    }
    public void matrixMultiply(Matrix m1, Matrix m2) {
        if (m2.row == m1.col) {
            Matrix temp = new Matrix();
            temp.row = m1.row; temp.col = m2.col;
            temp.matrix = new int[m1.row][m2.col];
            for (int i = 0; i < m1.row; i++) {
                for (int j = 0; j < m2.col; j++) {
                    for (int k = 0; k < m2.row; k++)
                        temp.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
            temp.showMatrix();
        }
	else {
            System.out.println("Not possible.");
        }
    }
};

class MatrixMultiplication {

    public static void main(String[] args) {
        Matrix objM1 = new Matrix();
        objM1.getData();
        System.out.println("Matrix A");
        objM1.showMatrix();
        Matrix objM2 = new Matrix();
        objM2.getData();
        System.out.println("Matrix B");
        objM2.showMatrix();
        Matrix ans= new Matrix();
        System.out.println("Resultant Matrix\n");
        ans.matrixMultiply(objM1, objM2);
    }
}
*/