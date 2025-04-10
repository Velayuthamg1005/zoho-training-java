public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int n = 2; n <= 100; n++) {
            int flag =1;

            for (int i = 2; i<=n/2; i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag==1) {
                System.out.println(n + " ");
            }
        }
    }
}
