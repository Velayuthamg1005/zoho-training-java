import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {

        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Square Hallow Pattern

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}

//Number Triangular

class NumberTriangular{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }
}

//Number Increasing Pyramid

class NumberIncreasing{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}


//Number Increasing Reverse Pyramid

class ReverseNumberIncreasing{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

//Number Changing Pyramid

class NumberChanging{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }

    }
}

//Zero-One-Triangle

class ZeroOneTriangle{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println(" ");
        }
    }
}

//Palindrome Triangular

class Palindrome{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//Rhombus Pattern

class RhombusPattern{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
                for(int j=1;j<=n-1;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

//Diamond Pattern

class DiamondPattern{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Butterfly Star Pattern

class SquareFill{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

//Right Half Pyramid

class RightHalf{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Reverse Right Half

class ReverseRight{
    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Left Half Pyramid

class LeftHalfPyramid{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}