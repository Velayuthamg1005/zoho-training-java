
import java.util.Arrays;


public class ArrayCodingQues {
    public static void main(String[] args) {

        System.out.println("-----Array Coding Questions-----");

    }
}

// 1. Java Program to merge two arrays into single array

class MergeArray{
    public static void main(String[] args) {
        
        System.out.println("---Merge Two Arrays---");

        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}

// 2. Java Program to sort an Array

class SortArray{
    public static void main(String[] args) {
        System.out.println("---Sorting Array---");
        int[] arr= {0,23,16,90,10,12,19};

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


