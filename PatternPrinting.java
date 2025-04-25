import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {

        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // 01-Square Hallow Pattern

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

// 02 - Number Triangular

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

// 03 - Number Increasing Pyramid

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


// 04 - Number Increasing Reverse Pyramid

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

// 05 - Number Changing Pyramid

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

// 06 - Zero-One-Triangle

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

// 07 - Palindrome Triangular

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

// 08 - Rhombus Pattern

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

// 09 - Diamond Pattern

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

// 11 - Square Fill Pattern

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

// 12 - Right Half Pyramid

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

// 13 - Reverse Right Half

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

// 14 - Left Half Pyramid

class LeftHalfPyramid{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 15 - Reverse Left Half Pyramid

class ReverseLeftHalfPyramid{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 16 - K Pattern

class KPattern{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=1;i<n;i++){
                for(int j=1;j<=i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }       
        }


// 17 - Triangle Star Pattern

class TriangleStarPattern{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 18 - Reverse Number Triangle Pattern

class ReverseNumberTriangle{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

// 19 - Mirror Image Triangle Pattern

class MirrorImageTriangle{
    public static void main(String[] args) {
        
        System.out.print("Enter the Number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// 20 - Hollow Triangle Pattern

class HollowTriangle{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 21 - Hollow Reverse Triangle 

class HollowReverse{
    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                if(j==1||i==1||j==n-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 22 - Hallow Diamond Pattern


class HallowDiamond{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j==1 ||j==(2*i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2-1;j++){
                if(j==1||j==(n-i)*2-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 23 - Hollow HourGlass Pattern

class HallowHourGlass{
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                if(i==1||j==1||j==n-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                if(i==n-1||j==1||j==i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

// 24 - Pascal's Triangle

class Pascal {

    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }

            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1); 
            }
            System.out.println();
        }
    }
}


