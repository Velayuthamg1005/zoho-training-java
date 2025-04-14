package Functions;



class Intro {


    // 1. Method Greeting

    static void greetings(){
        System.out.println("Hello All,How are you doing?");
    }

    // 2. Method Get Name

    static void getName(String name){
        System.out.println("Name: "+name);
    }

    // 3. Method Get Age

    static void getAge(int age){
        System.out.println("Age is: "+age);
    }

    // 4. Method with if...else

    static void checkAge(int age){
        if(age>18){
            System.out.println("You are eligible to Vote");
        }
        else{
            System.out.println("You are not eligible");
        }
    }

    // 5. Method with Different Parameters

    static int checkCondition(int x,int y){
        return x+y;
    }

    static double checkCondition(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        greetings();
        getName("Velayutham.G");
        getAge(23);
        checkAge(23);

        int result1=checkCondition(4, 5);
        double result2=checkCondition(4.5, 8.3);

        System.out.println(result1);
        System.out.println(result2);
    }
}
