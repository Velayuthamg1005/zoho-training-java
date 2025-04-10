import java.util.Scanner;

public class LoginAttemptLimiter {
    public static void main(String[] args) {
        
        int givenAccNumber=1234;
        int givenPinNumber=1234;
        int limit=3;
        int attempt=0;

        while(attempt<limit){

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Account Number: ");
            int userAccNo=sc.nextInt();
    
            System.out.print("Enter the PIN Number: ");
            int userPin=sc.nextInt();

            if(givenAccNumber==userAccNo && givenPinNumber==userPin){
                System.out.print("Account Access");
                break;
            }
            else{
                System.out.println("Invalid Credentials,Try Again");
                attempt++;
            }
            if(limit==attempt){
                System.out.print("Account Locked");
            }
        }
    }
}
