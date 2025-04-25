package Matrices;



// Intro

class ExampleMatrices {
    public static void main(String[] args) {
        System.out.println("-----Example Matrices-----");
    }
}

// 1. Matrix Addition

class MatrixAdd{
    public static void main(String[] args) {
        
        int[][] a={
            {12,23,42},
            {2,42,41},
            {11,32,11}
        };

        int[][] b={
            {14,55,21},
            {21,52,22},
            {76,53,22}
        };

        int rows=a.length;
        int cols=a[0].length;

        int[][] c=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print((c[i][j]=a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
    }
}


// 2. Matrix Subtraction

class MatrixSub{
    public static void main(String[] args) {
        
        int[][] a={
            {102,42,63},
            {85,93,55},
            {92,93,73}
        };

        int[][] b={
            {98,24,11},
            {65,66,33},
            {89,67,66}
        };

        int[][] c=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print((c[i][j]=a[i][j]-b[i][j])+" ");
            }
            System.out.println();
        }
    }
}

// 3. Matrix Multiplication - Element Wise Method

class MatrixMul1{
    public static void main(String[] args) {
        
        int[][] a={
            {3,4},
            {1,3}
        };

        int[][] b={
            {3,2},
            {4,5}
        };

        int[][] c=new int[a.length][a[0].length];
        

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print((c[i][j]=a[i][j]*b[i][j])+" ");
            }
            System.out.println();
        }
    }
}

// 4. Matrix Multiplication - Row * Col Multiplication

class MatrixMul2{
    public static void main(String[] args) {
        
        int[][] a={
            {2,4,4},
            {3,5,2}
        };
        int[][] b={
            {2,5,2},
            {3,5,2},
            {4,6,7}
        };

        int[][] c=new int[a.length][b[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// 5. Transpose of a Matrix

class Transpose{
    public static void main(String[] args) {
        
        int[][] a={
            {1,23,4},
            {23,52,45}
        };

        int[][] transpose=new int[a[0].length][a.length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                transpose[j][i]=a[i][j];
            }
        }

        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// 6. Matrix Addition using Functions

class MatrixAddFunction {

    static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
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
            {12, 23, 42},
            {2, 42, 41},
            {11, 32, 11}
        };

        int[][] b = {
            {14, 55, 21},
            {21, 52, 22},
            {76, 53, 22}
        };

        int[][] sum = addMatrices(a, b);

        System.out.println("Matrix Addition Result:");
        printMatrix(sum);
    }
}


