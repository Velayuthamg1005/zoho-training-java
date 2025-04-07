import java.util.Scanner;

class SwitchExample {
    public static void main(String[] args) {

        System.out.println("Enter a Character: ");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        if(word.isEmpty()){
            System.out.println("It can't be empty");
            return;
        }

        char ch=Character.toLowerCase(word.charAt(0));

        switch (ch) {
                case 'a':
                    System.out.println("It is a vowel");
                break;
                case 'e':
                    System.out.println("It is a vowel");
                break;
                case 'i':
                    System.out.println("It is a vowel");
                break;
                case 'o':
                    System.out.println("It is a vowel");
                break;
                case 'u':
                    System.out.println("It is a vowel");
                break;
            default: 
                if(ch>=97 && ch<=122){
                    System.out.println("It is a consonant");
                }
                else{
                    System.out.println("It is not an alphabet");
                }
        }


    }
}

public class Threesum{
    public static void main(String[] args) {

        int num1=40,num2=40,num3=54;

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+ " is greater");
        }
        else if(num2>=num3){
            System.out.println(num2+ " is greater");
        }
        else
        {
            System.out.println(num3+ " is greater");
        }   
    }
}
    

