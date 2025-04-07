public class BoolExample {
    public static void main(String[] args) {

        /* 

        ----Greater than two numbers----

        int num1=15;
        int num2=30;
        System.out.println(num1>num2);


        ----Voting Eligibility----

        int age=12;
        String result=(age>18)? "Eligible" : "Not Eligible";
        System.out.println(result);

       

        ----Open a door if the user enters the correct code----

        int doorCode=1234;
        String result=(doorCode==1234)?"Open":"Not Open";
        System.out.println(result);


        ----Find out if a number is positive or negative----

        int num=12;
        String result=(num>0)?"Positive":"Negative";
        System.out.println(result);

        
        ----Even or odd----
        
        */

        //Leap year Checking

        int year=2100;

        if(year%4==0 && year%100!=0 || year%400==0 )
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
}
}
