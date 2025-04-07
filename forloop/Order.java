import java.util.Scanner;

//Write a Java program to display the multiplication table of a given integer.

class ForLoopsExample {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            System.out.println( n+ " * " +i+ " = " +(n*i));
        }
    }
}


//Write a Java program that displays the sum of n odd natural numbers

class OddNumber{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int oddNum=1;

        System.out.println("The odd numbers are ");

        for(int i=1;i<=n;i++){
            System.out.println(oddNum);
            sum=sum+oddNum;
            oddNum=oddNum+2;
        }
        System.out.println("The sum of odd Natural Numbers upto"+n+"terms is: "+sum);
        
    }
}

//Write a Java program to display the pattern like a right angle triangle with a number

class RightAngle {
    public static void main(String[] args) {

        System.out.print("Enter the number of rows: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

//Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

class pyramid{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    
    }
}

//Write a Java program to generate the following * triangles.

class RightHalf{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}


//Write a Java program to generate the following @'s triangle

class AliasTriangle{
    public static void main(String[] args) {

        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("@");
            }
            System.out.println(" ");
        }

    }
}

//Increasing/Decreasing/Neither..nor

public class Order{
    public static void main(String[] args) {

        System.out.print("Enter the First Number: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2=sc.nextInt();

        System.out.print("Enter the Third Number: ");
        int num3=sc.nextInt();

        if(num1<num2 && num2<num3){
            System.out.println("Increasing Order");
        }
        else if(num1>num2 && num2>num3){
            System.out.println("Decreasing Order");
        }
        else{
            System.out.println("Neither Increasing Nor Decreasing");
        }

    }
}