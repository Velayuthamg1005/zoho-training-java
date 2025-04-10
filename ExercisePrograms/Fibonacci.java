import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Fibonacci Series upto n: ");
        int n=sc.nextInt();
        
        System.out.print("Enter the Number 1: ");
        int num1=sc.nextInt();

        System.out.print("Enter the Number 2: ");
        int num2=sc.nextInt();

        int num3;
        int i=1;

        do {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.println(num1); 
            i++;
            
        } while (i<=n);
    }
}

