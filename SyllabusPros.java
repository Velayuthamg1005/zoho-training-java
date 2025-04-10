
import java.util.Scanner;

// 1. Write and execute a simple "Hello World" program in Java.

class SyllabusPros {
    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}

// 2.  Write a program to declare variables of different data types

class DiffDataTypes{

    public static void main(String[] args) {
        
        int rollNo=101;
        String name="Velayutham";
        char initial ='G';
        float personality = 8.5f;
        double salary = 40000;
        boolean isMarried = false;

        System.out.println("Name is: "+name);
        System.out.println("His Roll No "+rollNo+", Personality wise "+personality+", As of now earning Rs:"+salary);
    }
}

// 3. Perform basic arithmetic operations (addition, subtraction, multiplication,division)

class BasicArithmetic {

    public static void main(String[] args) {
        
        System.out.println("---Performing Arithmetic Operations---");

        System.out.print("Enter a Number 1: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

        System.out.print("Enter a Number 2: ");
        int n2=sc.nextInt();

        int addNum=n1+n2;
        int subNum=n1-n2;
        int mulNum=n1*n2;
        int divNum=n1/n2;

        System.out.println("Addition: "+addNum);
        System.out.println("Subtraction: "+subNum);
        System.out.println("Multiplication: "+mulNum);
        System.out.println("Division: "+divNum);

    }
}

// 4. Write a program that calculates the area of a rectangle using variables and operators.

class AreaOfRectangle{

    public static void main(String[] args) {
        
        System.out.print("Enter the Value of length: ");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();

        System.out.print("Enter the Value of breadth: ");
        int b=sc.nextInt();

        int area=l*b;
        System.out.println("Area of a Rectangle: "+area);
    }
}
