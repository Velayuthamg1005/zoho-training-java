import java.util.Scanner;

public class MenuDrivenPro1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int choice;
        
        do{

            System.out.println("-----Interactive Menu With Exit-----");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Check Prime");
            System.out.println("3. Reverse a Number");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print("Enter a Number: ");
                    int num1 = sc.nextInt();

                    if(num1%2==0){
                        System.out.println("It is an Even Number");
                    }
                    else{
                        System.out.println("It is an Odd Number");
                    }

                break;
                
                case 2:

                    System.out.print("Enter a Number: ");
                    int num2 = sc.nextInt();
                    int flag=1;
                    
                    if(num2<=1)
                    {
                        flag=0;
                    }
                    else
                    {
                        for(int i=2;i<=num2/2;i++)
                        {
                            if(num2%i==0){
                                flag=0;
                                break;
                            }
                        }
                    }
                    if(flag==1){
                        System.out.println("It is a Prime Number");
                    }
                    else{
                        System.out.println("It is not a Prime Number");
                    }
                break;
                
                case 3:
                    System.out.print("Enter a Number: ");
                    int num3 = sc.nextInt();

                    int rev=0;

                    while(num3!=0){
                      
                        int digit=num3%10;
                        rev=rev*10+digit;
                        num3=num3/10;

                    }
                    
                    System.out.println("Reverse Number is "+rev);
                    
                    break;

                case 4:
                    System.out.println("Exit");
                    break;
                
                default:
                    System.out.println("Invalid Choice.Please Try Again");
            }
        }while(choice>4);
    }
}
