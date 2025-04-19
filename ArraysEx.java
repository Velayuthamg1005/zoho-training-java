// 1. Largest Element in an Array

class ArraysEx {
    public static void main(String[] args) {

        int[] arr={1111,34,1344,53,53,12,424,12,42};

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            int currentEle=arr[i];
            if(currentEle>max){
                max=currentEle;
            }
        }
        System.out.println(max);

    }
}

// 2. Smallest Element in an Array

class SmallestElement{
    public static void main(String[] args) {

        int[] arr={23,12,42,2,42,12,44,11,3};

        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            int currentEle=arr[i];
            if(currentEle<min){
                min=currentEle;
            }
        }
        System.out.println(min);
    }
}

// 3. Sum of Elements in an array

class SumofElements{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

// 4. Reverse an array


class Reverse{
    public static void main(String[] args) {
        int[] arr={12,23,42,13,45,11};
        int[] rev=new int[arr.length];

        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}

// 5. Two Dimensional Array

class TwoDimensional{
    public static void main(String[] args) {

        int[][] arr=new int[4][3];

        arr[0][0]=01;
        arr[0][1]=12;
        arr[0][2]=34;
        
        arr[1][0]=02;
        arr[1][1]=67;
        arr[1][2]=54;
        
        arr[2][0]=03;
        arr[2][1]=45;
        arr[2][2]=32;
        
        arr[3][0]=04;
        arr[3][1]=90;
        arr[3][2]=76;

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}

// 6. Two Dimensional using for-each loop

class TwoDimenForLoop {
    public static void main(String[] args) {

        int[][] arr = {
            {34, 32, 45},
            {32, 45, 21},
            {12, 24, 345}, 
            {34, 442, 22}
        };

        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

