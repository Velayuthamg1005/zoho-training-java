import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Terms: ");
        int n = sc.nextInt();
    
        int count = 0;
        int num = 1;

        while (count < n) {
            int temp=num;
            int digits = String.valueOf(temp).length();
            double sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if ((int)sum == num) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
