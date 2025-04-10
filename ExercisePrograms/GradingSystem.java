
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        
        System.out.println("-----Grading System-----");

        Scanner sc=new Scanner(System.in);

        //Take Marks of 5 Subjects

        System.out.print("Enter the Mark of Subject 1: ");
        int m1=sc.nextInt();

        System.out.print("Enter the Mark of Subject 2: ");
        int m2=sc.nextInt();

        System.out.print("Enter the Mark of Subject 3: ");
        int m3=sc.nextInt();

        System.out.print("Enter the Mark of Subject 4: ");
        int m4=sc.nextInt();

        System.out.print("Enter the Mark of Subject 5: ");
        int m5=sc.nextInt();


        //Calculate Average

        double avg=(m1+m2+m3+m4+m5)/5;
        System.out.println("Total Average is: "+avg);
        
        //Grade Assigning

        if(avg>=90){
            System.out.println("Grade is: A");
        }
        else if(avg>=80){
            System.out.println("Grade is: B");
        }
        else if(avg>=70){
            System.out.println("Grade is: C");
        }
        else if(avg>=60){
            System.out.println("Grade is: D");
        }
        else{
            System.out.println("Grade is: F");
        }
    }
}
