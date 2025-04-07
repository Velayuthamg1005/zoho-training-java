import java.util.Scanner;

class Programs {
    public static void main(String[] args) {

        int temp;

        System.out.print("Enter First Number: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2=sc.nextInt();

        System.out.println("Before Swapping Num1 is " +num1+   " and Num2 is "+num2 );

        // temp=num1;
        // num1=num2;
        // num2=temp;

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;

        System.out.println("After Swapping Num1 is " +num1+ " and Num2 is "+num2 );

    }
}

//Ascii value

class AsciiValue{
    public static void main(String[] args) {
        
        System.out.print("Enter a Character: ");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        int asciiValue=(int)c;
        System.out.println(asciiValue);

    }
}