import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {

        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //for loop

        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){ 
                System.out.print(num+" ");
                num=num+n-j;
            }
            System.out.println();
        }
    }
}

class ExercisePattern{
    public static void main(String[] args) {
        
        System.out.print("Enter the number of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            int num=i+1;

            for(int j=1;j<=n;j++){
                System.out.print(num+" ");
                num++;
                if(num>5)
                num=1;
            }

            System.out.println();
        }
    }
}

