import java.util.Scanner;

public class MenuDrivenPro2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---Interactive Menu Driven Program---");
            System.out.println("1. Square Pattern");
            System.out.println("2. Triangle Pattern");
            System.out.println("3. X Pattern");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a Number: ");
                    int num1 = sc.nextInt();

                    for (int i = 1; i <= num1; i++) {
                        for (int j = 1; j <= num1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter a Number: ");
                    int num2 = sc.nextInt();

                    for (int i = 1; i <= num2; i++) {
                        for (int j = 1; j <= num2 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter a Number: ");
                    int num3 = sc.nextInt();

                    for (int i = 0; i < num3; i++) {
                        for (int j = 0; j < num3; j++) {
                            if (i == j || i + j == num3 - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }

        } while (choice>4);
    }
}
