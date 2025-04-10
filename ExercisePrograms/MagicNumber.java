import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int sum=0;

        while(num>9){
            while(num>0){
                int mod=num%10;
                sum=sum+mod;
                num=num/10;
            }
            num=sum;
            sum=0;
        }

        if(num==1){
            System.out.println("It is a Magic Number");
        }
        else{
            System.out.println("It is not a Magic Number");
        }
    }
}
