package Functions;


// 1. Use recursion to add all of the numbers up to 10.

class Recursion{

    static int sum(int n){
        if(n>1){
            return n+sum(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {

        int result=sum(10);
        System.out.println(result);
        
    }
}


