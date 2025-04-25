package Matrices;
import java.util.Arrays;
import java.util.Scanner;


// Intro

class MatricesProblems {
    public static void main(String[] args) {
        System.out.println("-----Problems on Matrices-----");
    }
}


// 1. Write a program that uses a function to compute the average of an array of integers.

class ComputeAverage{

    static double findAvg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (double)sum/arr.length;
    }


    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println("Average = "+findAvg(arr));
    }
}

// 2. Write a program that adds two 2x2 matrices using arrays and functions.

class MatrixAddition {

    static int[][] findAddMatrix(int[][] a, int[][] b) {

        int[][] c = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = findAddMatrix(a, b);
        System.out.println("Matrix Addition Result:");
        printMatrix(result);
    }
}

// 3. Write a program that multiplies two 2x2 matrices using arrays and functions.

class MatrixMultiplication {

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {3, 4, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8},
            {3, 5}
        };

        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product of Matrix 1 and Matrix 2:");
        displayMatrix(result);
    }
}

// 4. Write a function that computes the transpose of a 2x2 matrix:

public class Transpose2x2 {

    static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int[][] transposed = transposeMatrix(matrix);

        System.out.println("Transposed Matrix:");
        displayMatrix(transposed);
    }
}

// 5. Write a function that finds the maximum value in an array.

class MaximumArray{

    static int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={13,94,12,91,81};
        System.out.println(findMax(arr));
    }
}

// 6. Write a function that searches for an element in an array and returns its position :

class SearchElement {

    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        int position = findElement(arr, target);

        if (position != -1) {
            System.out.println("Position: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}

// 7. Write a function to reverse the rows and columns of a 2x2matrix.

class ReverseMatrix {

    public static int[][] reverseMatrix(int[][] matrix) {
        int[][] reversed = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                reversed[i][j] = matrix[1 - i][1 - j];
            }
        }

        return reversed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int[][] reversed = reverseMatrix(matrix);

        System.out.println("Reversed Matrix:");
        printMatrix(reversed);
    }
}

// 8. Write a function to rotate a 2x2 matrix 90degrees clockwise.

class RotateMatrix {

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotated = new int[2][2];

        rotated[0][0] = matrix[1][0];
        rotated[0][1] = matrix[0][0];
        rotated[1][0] = matrix[1][1];
        rotated[1][1] = matrix[0][1];

        return rotated;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int[][] rotated = rotateMatrix(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(rotated);
    }
}



// 9. Write a function to merge two arrays and return the combined array.


class MergeTwoArrays {

    public static int[] mergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 7};

        int[] result = mergeArray(a, b);
        System.out.println(Arrays.toString(result));
    }
}


// 10.Write a function that calculates the sum of diagonal elements of a 2x2matrix.


class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        return matrix[0][0] + matrix[1][1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int sum = diagonalSum(matrix);
        System.out.println("Sum of Diagonal = " + sum);
    }
}






// 11. Write a function to count even and odd numbers in an array

class CountEvenOdd {

    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        countEvenOdd(arr);
    }
}

// 12. Write a function that calculates the sum of elements in each row of a 2x2 matrix

class SumeElments {

    public static int[] rowSums(int[][] matrix) {
        int[] sums = new int[2];

        for (int i = 0; i < 2; i++) {
            sums[i] = matrix[i][0] + matrix[i][1];
        }

        return sums;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int[] result = rowSums(matrix);
        System.out.println("Row Sums = " + Arrays.toString(result));
    }
}

// 13. Write a Java program that takes a positive integer n as input and prints an n x n spiral matrix filled with numbers from 1 to n^2 in clockwise spiral order. 

class SpiralMatrixInputPrint {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        int val = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = val++;
            }
        }

        int rowStart = 0, rowEnd = n;
        int colStart = 0, colEnd = n;

        while(rowStart < rowEnd && colStart < colEnd){
            
            // Left to Right
            for(int i = colStart; i < colEnd; i++){
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // Top to Bottom
            for(int i = rowStart; i < rowEnd; i++){
                System.out.print(matrix[i][colEnd - 1] + " ");
            }
            colEnd--;

            // Right to Left
            if(rowStart < rowEnd){
                for(int i = colEnd - 1; i >= colStart; i--){
                    System.out.print(matrix[rowEnd - 1][i] + " ");
                }
                rowEnd--;
            }

            // Bottom to Top
            if(colStart < colEnd){
                for(int i = rowEnd - 1; i >= rowStart; i--){
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}



// 14. Write a Java program that have a 4x4 matrix and get the output in a Spiral matrix manner.

class SpiralMatrix{
    public static void main(String[] args) {

        int a[][]={
            {1,2,3,4},
            {12,13,14,5},
            {11,16,15,6},
            {10,9,8,7}
        };

        int rowStart=0,rowEnd=a.length;
        int colStart=0,colEnd=a[0].length;

        while(rowStart<rowEnd && colStart<colEnd){

            //Print Left to Right
            for(int i=colStart;i<colEnd;i++){
                System.out.print(a[rowStart][i]+" ");
            }
            rowStart++;

            //Print Top to Bottom
            for(int i=rowStart;i<rowEnd;i++){
                System.out.print(a[i][colEnd-1]+" ");
            }
            colEnd--;

            //Print Right to Left
            for(int i=colEnd-1;i>=colStart;i--){
                System.out.print(a[rowEnd-1][i]+" ");
            }
            rowEnd--;

            //Print Bottom to Top
            for(int i=rowEnd-1;i>=rowStart;i--){
                System.out.print(a[i][colStart]+" ");
            }
            colStart++;
        }

    }
}

// 15. Snake Matrix

class SnakeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {7, 6, 5, 4},
            {3, 2, 1, 0},
            {7, 3, 2, 1},
            {1, 3, 6, 8}
        };

        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Right to left
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}


