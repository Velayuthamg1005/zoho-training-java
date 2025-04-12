import java.util.Arrays;

class ArrayProblems {
    public static void main(String[] args) {
        
        System.out.println("---Array Problems---");

    }
}

// 1. Maximum Element in an Array

class MaxiElement{
    public static void main(String[] args) {
        
        System.out.println("---Maximum Elements in an Array:");

        int[] arr={10,42,45,4,43,56,22};

        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element: "+max);
    }
}


// 2.Minimum Element in an Array

class MiniElement{
    public static void main(String[] args) {

        System.out.println("---Minimum Element in an Array:");

        int[] num={45,32,12,54,11,23,10,34,21};

        int min=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Minimum Element: "+min);
        
    }
}

// 3.Average of Array Elements

class AverageOfElements{
    public static void main(String[] args) {

        System.out.println("---Average of Array Elements---");

        int[] arr={90,23,43,11,32};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        double avg=(double)sum/arr.length;

        System.out.println("Average: "+avg);

    }
}

// 4.Count Even and Odd Numbers

class CountEvenOdd{
    public static void main(String[] args) {
        System.out.println("---Count Even and Odd Numbers---");

        int[] arr={2,3,4,5,6};
        int countEven=0;
        int countOdd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Even Count: "+countEven+" Odd Count: "+countOdd);

    }
}


// 5. Find Second Largest Element

class SecondLargest {
    public static void main(String[] args) {
        System.out.println("---Finding Second Largest Element---");

        int[] num = {1, 23, 4,54,24,28, 22, 45};

        int max1, max2;

        if (num[0] > num[1]) {
            max1 = num[0];
            max2 = num[1];
        } else {
            max1 = num[1];
            max2 = num[0];
        }

        for (int i = 2; i < num.length; i++) {
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            } else if (num[i] > max2 && num[i] < max1) {
                max2 = num[i];
            }
        }

        System.out.println("Second Largest Element in an Array: " + max2);
    }
}

// 6.Sum of Elements of Even Indices

class SumOfEvenIndices{
    public static void main(String[] args) {

        System.out.println("--- Sum of Elements at Even Indices---");

        int[] num={2,4,6,8,10};
        int sum=0;

        for(int i=0;i<num.length;i++){
            if(i%2==0){
                sum+=num[i];
            }
        }
        System.out.println(" Sum of Elements at Even Indices: "+sum);
    }
}

// 7.Merge Two Arrays

class MergeTwoArrays{
    public static void main(String[] args) {
        
        System.out.println("---Merge Two Arrays---");

        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        int[] arr3=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}

// 8.Sort an Array

class SortingArray{
    public static void main(String[] args) {
        
        System.out.println("---Sorting Array---");

        int[] arr={32,22,45,11,27};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// 9.Frequency of Elements

class FreqOfElements{
    public static void main(String[] args) {
        
        System.out.println("---Frequency of Elements---");

        int[] arr={2,3,2,5,3};
        int visited=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=visited){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=visited;
                    }
                }
                System.out.println(arr[i]+"->"+count);
            }
        }
        
    }
}

// 10. Remove Duplicates from an Array


class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println("---Remove Duplicates---");

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int dup = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dup) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = dup;
                    }
                }
            }
        }

        int count = 0;
        for (int value : arr) {
            if (value != dup) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value != dup) {
                result[index++] = value;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
